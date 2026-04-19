package dsaarray;

import java.util.*;

public class uniqueElement {

    //Brute force approche

    // public void unique(int nums[]){
    //     Set<Integer> set=new HashSet<>();
    //     for(int n:nums){
    //         set.add(n);
    //     }
    //     System.out.println("Unique element: "+set);
    //     System.out.println("Lenth of the unique set: "+set.size());
    // }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter lenght of an array: ");
        int n=sc.nextInt();
        System.out.println("Enter element of an array: ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        uniqueElement obj=new uniqueElement();
        obj.unique(arr);
    }
}
