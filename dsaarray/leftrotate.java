//left rotate array by one place 

package dsaarray;
import java.util.*;
public class leftrotate {
    public void optimum_LeftRotate_1(int nums[]){
        // List<Integer> lis=new ArrayList<>();
        // for(int i=1;i<nums.length;i++){
        //     lis.add(nums[i]);
        // }
        // lis.add(nums[0]);
        // System.out.print("Array after rotation: "+lis);
        int temp=nums[0];
        for(int i=1;i<nums.length;i++)
            nums[i-1]=nums[i];
        nums[nums.length-1]=temp;
        System.out.print("Array after rotation: ");
        for(int n:nums)
            System.out.print(n+" ");
        System.out.println();
        
    }
    public void brute_LeftRotateBy_K(int arr[],int k){
        int lis[]=new int[k];
        for(int i=0;i<k;i++){
            lis[i]=arr[i];
        }
        int n=arr.length;
        for(int i=k;i<n;i++){
            arr[i-k]=arr[i];
        }
        for(int i=n-k;i<n;i++){
            arr[i]=lis[i-(n-k)];
        }
        System.out.print("Array after rotation by k place: ");
        for(int m:arr){
            System.out.print(m+" ");
        }
        System.out.println();
        
    }
    public static void reverse(int[] arr1,int start,int end){
        while(start<=end){
            int temp=arr1[start];
            arr1[start]=arr1[end];
            arr1[end]=temp;
            start++;
            end--;
        }
    }
    public void optimal_LeftRotateBy_K(int arr[],int k){
        int n=arr.length;
        k=k%n;
        reverse(arr, 0,k-1);
        reverse(arr, k, n-1);
        reverse(arr, 0, n-1);
        System.out.print("Array after rotation by k place: ");
        for(int m:arr){
            System.out.print(m+" ");
        }

    }
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n=sc.nextInt();
        System.out.println("Enter the array elements: ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println("Enter number of places to rotate: ");
        int k=sc.nextInt();

        leftrotate obj=new leftrotate();
        int[] arrCopy = Arrays.copyOf(arr, arr.length);
        int[] arrCopy2=Arrays.copyOf(arr, arr.length);
        obj.optimum_LeftRotate_1(arr);
        obj.brute_LeftRotateBy_K(arrCopy, k);
        obj.optimal_LeftRotateBy_K(arrCopy2, k);
        
        sc.close();
    }
}
