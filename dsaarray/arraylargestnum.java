package dsaarray;

import java.util.Scanner;
public class arraylargestnum{
    public int largestNumber(int[] num)
    {
        int largest=num[0];
        for(int n:num)
        {
            if(largest<n)
                largest=n;
        }
        return largest;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Length of an Array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter element of an array: ");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        arraylargestnum obj=new arraylargestnum();
        int result =obj.largestNumber(arr);
        System.out.println("largest number in array is: "+result);

    }
}