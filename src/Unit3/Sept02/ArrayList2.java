package Unit3.Sept02;
import java.util.Collection;
import java.util.*;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        System.out.println("Enter the number of products: ");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            String x=sc.next();
            al.add(x);
        }
        Collections.sort(al);
        Iterator it= al.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        al.add(1,"apple");
        al.addLast("banana");
        al.addFirst("lichi");
        System.out.println(al);
//        for(int i : al){
//            System.out.println(i);
//        }
    }
}