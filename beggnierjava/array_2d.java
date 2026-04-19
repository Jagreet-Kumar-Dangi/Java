package beggnierjava;

public class array_2d {
    public static void main(String[] args) {
        int nums[][]=new int[3][4];
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                nums[i][j]=(int)(Math.random() *100);
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                System.out.print(nums[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        for(int n[] : nums){
            for(int m: n){
                System.out.print(m + "\t");
            }
            System.out.println();
        }
        
    }
}
