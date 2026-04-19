package beggnierjava;

public class oops2 {
    public static void main(String[] args) {
        
        int num2[][]=new int[3][4];
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                num2[i][j]=(int)(Math.random()*100);
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                System.out.print(num2[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }

    }
}
