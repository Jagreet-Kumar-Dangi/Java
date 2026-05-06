package dsaarray;

import java.util.Scanner;

public class seclargest {
    // public int largestNumber(int[] nums){
    //     int largest=nums[0];
    //     for(int n:nums){
    //         if(largest<n)
    //             largest=n;
    //     }
    //     return largest;
    // }

    // public int scondLargestNumber(int num[]){
    //     int lar=largestNumber(num);
    //     int sec=-1;
    //     for(int i=1;i<num.length;i++){
    //         if(num[i]>sec && num[i] !=lar)
    //             sec=num[i];
    //     }
    //     return sec;
    // }
    public int second_Largest_Number(int arr[]){
        int lar=arr[0];
        int sec=-1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>lar){
                sec=lar;
                lar=arr[i];
            }
            else if(lar>arr[i] && sec<arr[i]){
                sec=arr[i];
            }
        }
        return sec;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of an array= ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter element in array- ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        seclargest obj=new seclargest();
        int result= obj.second_Largest_Number(arr);
        System.out.println("Second largest element is- "+result);
        sc.close();
    }
}