package prep;
import java.util.*;

public class RemoveCommonFragment {

    private static String removeFragment(String words[], String fragment){
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while(i < words.length){
            if(i < 2 + words.length){
                String sentence = BuildWord(words, i);
                if (sentence.equals(fragment)) {
                    i += 3; 
                    continue;
                }
            }
            sb.append(words[i]).append(" ");
            i++;
        }
        return sb.toString().trim();
    }

    private static String BuildWord(String[] words, int i) {
        if (i + 2 >= words.length) return "";
        return words[i] + " " + words[i + 1] + " " + words[i + 2];
    }

    private static String[] manualSplit(String str) {
        String [] sentence = new String[50];
        String temp = "";
        int wc = 0;
        char[] ca = str.toCharArray();
        for(int i = 0; i < ca.length; i++){
            if(ca[i] != ' '){
                temp+=ca[i];
            }
            else{
                sentence[wc++] = temp;
                temp = "";
            }
        }

        if(temp!= ""){
            sentence[wc++] = temp;
        }

        String[] newSent = new String[wc];

        for(int i = 0; i < wc; i++){
            newSent[i] = sentence[i];
        }
        return newSent;
    }
    private static String CommonWords(String sentence[], int n){
        String common = "";

        String[][] wordfrag = new String[n][];
        for(int i = 0; i < n; i++){
            wordfrag[i] = manualSplit(sentence[i]);
        }

        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            HashSet<String> seen = new HashSet<>();
            for(int j = 0; j < wordfrag.length; j++){
                String word = BuildWord(wordfrag[i],j);
                if(!seen.contains(word)){
                    map.put(word, map.getOrDefault(word, 0) + 1);
                    seen.add(word);
                }
            }
        }

        for(Map.Entry<String, Integer> entry : map.entrySet()){
            if(entry.getValue() == n){
                common = entry.getKey();
                break;
            }
        }
        
        if (!common.equals("")) {
            for (int i = 0; i < n; i++) {
                String updated = removeFragment(wordfrag[i], common);
                System.out.println("S" + (i + 1) + " = \"" + updated + "\"");
            }
            System.out.println("Removed fragment = \"" + common + "\"");
        } else {
            System.out.println("No common fragment found.");
        }

        return common;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] sentence  = new String[3];
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < n; i++){
            sentence[i] = sc.nextLine();
        }
        
        CommonWords(sentence,n);
        sc.close();
    }
}
