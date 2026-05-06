package dsaarray;

import java.util.*;

public class practice {
    public void bruteUnique(int nums[]){
        Set<Integer> set=new HashSet<>();
        for(int n:nums){
            set.add(n);
        }
        System.out.println("Unique elements in array: "+set);
        System.out.println("Count of unique element: "+set.size());
    }
    public void betterUnique(int nums[]){
        List<Integer> lis=new ArrayList<>();
        lis.add(nums[0]);
        for(int i=1;i<nums.length;i++){
            if(nums[i] !=nums[i-1]){
                lis.add(nums[i]);
            }
        }
        System.out.println("Unique elements in array: "+lis);
        System.out.println("Count of unique element: "+lis.size());
        
    }
    public void optimumUnique(int nums[]){
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[i] !=nums[j]){
                i++;
                nums[i]=nums[j];
            }
        }
        System.out.print("Unique elements in array: ");
        for(int x=0;x<i+1;x++){
            System.out.print(nums[x]+" ");
        }
        System.out.println();
        System.out.println("Count of unique element: "+i+1);

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length of the array- ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the element of an array= ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        practice obj=new practice();
        obj.bruteUnique(arr);
        System.out.println();
        obj.betterUnique(arr);
        System.out.println();
        obj.optimumUnique(arr);
        sc.close(); 

    }
}
