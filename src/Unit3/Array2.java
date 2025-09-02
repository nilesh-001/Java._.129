package Unit3;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the arrays :");
        int n=sc.nextInt();
        int arr1[][]=new int[n][n];
        System.out.println("Enter the elements in 1st array: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        int arr2[][]=new int[n][n];
        System.out.println("Enter the elements in 2nd array: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        System.out.println("The addition matrix is: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print((arr1[i][j]+arr2[i][j])+"\t");
            }
            System.out.println();
        }
    }
}
