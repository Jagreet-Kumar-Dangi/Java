package beggnierjava;

public class removeelment {
    //Brute Force

    // public int removeElement(int[] nums, int val) {
    //     int[] temp = new int[nums.length];
    //     int k = 0;

    //     for (int i = 0; i < nums.length; i++) {
    //         if (nums[i] != val) {
    //             temp[k++] = nums[i];
    //         }
    //     }


    //     for (int i = 0; i < k; i++) {
    //         nums[i] = temp[i];
    //     }

    //     return k;
    // }

    //better approach

    // public int removeElement(int[] nums, int val) {
    //     int k = 0;

    //     for (int i = 0; i < nums.length; i++) {
    //         if (nums[i] != val) {
    //             nums[k] = nums[i];
    //             k++;
    //         }
    //     }

    //     return k;
    // }

    //optimal solution

    public int removeElement(int[] nums, int val) {
        int i = 0;
        int n = nums.length;

        while (i < n) {
            if (nums[i] == val) {
                nums[i] = nums[n - 1];
                n--;
            } else {
                i++;
            }
        }

        return n;
    }


}
