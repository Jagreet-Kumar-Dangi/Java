package beggnierjava;

public class draw {
    public static void main(String[] args) {
        int num[]=new int[6];
        for(int i=0;i<5;i++){
            num[i]=(int)(Math.random()*100);
        }
        for(int n: num)
        {
            System.out.print(n+ " ");
        }
        System.out.println();
    }
}
