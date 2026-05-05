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


    // Better approch

    // public void uniqueList(int arr[]){
    //     List<Integer> unique=new ArrayList<>();
    //     unique.add(arr[0]);
    //     for(int i=1;i<arr.length;i++){
    //         if(arr[i] !=arr[i-1]){
    //             unique.add(arr[i]);
    //         }
    //     }
    //     System.out.println("Unique Array: "+unique);
    //     System.out.println("Length of the array: "+unique.size());
    // 
    // }



    //Optiomum Approch
    
    public void sameArray(int arr[]){
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[i] !=arr[j]){
                i++;
                arr[i]=arr[j];
            }

        }
        int count=i+1;
        for(int x=0;x<count;x++){
            System.out.print(arr[x]+ " ");
        }
        System.out.println();
        System.out.println("Number of uique elements- "+count);
    }

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
        // obj.unique(arr);    //Brute Force
        //obj.uniqueList(arr);   //Better Solution
        obj.sameArray(arr);
        sc.close();
    }
}
