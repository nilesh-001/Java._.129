package Unit3.Sept12;

import java.util.HashSet;
import java.util.Scanner;

public class HashSet1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashSet<String> set1=new HashSet<>();
        HashSet<String> set2=new HashSet<>();
        System.out.println("Enter the size of the first hash set : ");
        int n=sc.nextInt();
        System.out.println("Enter the size of the second hash set : ");
        int m=sc.nextInt();
        System.out.println("Enter the elements in Hash set 1: ");
        for(int i=0;i<n;i++){
            set1.add(sc.next());
        }
        System.out.println("Enter the elements in Hash set 2: ");
        for(int i=0;i<m;i++){
            set2.add(sc.next());
        }
//        System.out.println(set1);
//        set2.removeAll(set1);
//        System.out.println(set2);
        set1.remove(set2);
        System.out.println(set1);
        set1.removeIf(str->str.contains("n"));
        System.out.println(set1);
    }
}
