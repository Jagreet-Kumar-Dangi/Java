package beggnierjava;

public class practice {
    public static void main(String[] args) {
        int arr[]=new int[6];
        for(int i=0;i<6;i++)
        {
            arr[i]=(int)(Math.random()*100);
        }
        for(int n: arr){
            System.out.print(n+" ");
            
        }
    }
}
