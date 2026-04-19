package dsaarray;

import java.util.Scanner;

public class checksorted {
    public boolean sorted(int nums[]){
        for(int i:nums){
            if(i>i+1){
            }
            else
                return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int n=sc.nextInt();
        System.out.println("Enter the element of an array: ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        checksorted obj=new checksorted();
        boolean result =obj.sorted(arr);
        System.out.println("Is array is sorted: "+result);
        sc.close();
        


    }
}
