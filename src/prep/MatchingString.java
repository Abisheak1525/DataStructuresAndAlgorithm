package prep;
import java.util.*;

public class MatchingString {
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        String sentence = op.nextLine();
        String pattern = op.nextLine();
        System.out.println(Match(sentence, pattern));
        op.close();
    }
    private static String Match(String str, String matcher){
        int n = str.length();
        for(int i = 0; i < n; i++){
            int si = i;
            int mi = 0;
            while(si < n && mi < matcher.length()){
                char temp = matcher.charAt(mi);
                if( mi + 1 < matcher.length() && matcher.charAt(mi + 1) == '*' || matcher.charAt(mi + 1) == '+'){
                    char symbol = matcher.charAt(mi + 1);
                    if(symbol == '*'){
                        while(si < n && str.charAt(si) == temp){
                            si++;
                        }
                        mi += 2;
                    }
                    else if(symbol == '+'){
                        int count = 0;
                        while(si < n && str.charAt(si) == temp){
                           si++;
                           count++; 
                        }
                        if(count == 0) break;

                        mi +=2;
                    }
                }
                else{
                    if(si < n && str.charAt(si) == temp){
                        mi++;
                        si++;
                    }
                    else{
                        break;
                    }
                }
            }
            if(mi == matcher.length()){
                return str.substring(i, si);
            }
        }
        return " ";
    }
}
