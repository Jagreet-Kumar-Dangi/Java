package beggnierjava;
public class dimen_3{
    public static void main(String[] args) {
        int nums[][][]=new int[3][2][3];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++)
            {
                for(int z=0;z<nums[i][j].length;z++)
                {
                    nums[i][j][z]=(int)(Math.random()*10);
                }
            }
        }
        for(int n[][] : nums)
        {
            for(int m[]: n)
            {
                for(int o: m)
                {
                    System.out.print(o + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}