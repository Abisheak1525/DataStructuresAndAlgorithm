import java.util.*;
class Collections{
    public static void main(String args[]){
        Scanner op= new Scanner(System.in);
        int n=op.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<n;i++){
            al.add(op.nextInt());
        }
        System.out.println(al.get(0));
        System.out.println(al.indexOf(5));
        System.out.println(al.remove(5));
        System.out.println(al.contains(5));
        al.set(0, 1);
        al.add(0,2);
        op.close();
        

    }

}