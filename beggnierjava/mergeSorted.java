package beggnierjava;

import java.util.Arrays;

public class mergeSorted {
    // public static int[] brute(int[] a, int[] b) {
    //     int n = a.length, m = b.length;
    //     int[] res = new int[n + m];

    //     System.arraycopy(a, 0, res, 0, n);
    //     System.arraycopy(b, 0, res, n, m);

    //     Arrays.sort(res);

    //     return res;
    // }
    public static int[] better(int[] a, int[] b) {
        int n = a.length, m = b.length;
        int[] res = new int[n + m];
    
        int i = 0, j = 0, k = 0;
    
        while (i < n && j < m) {
            if (a[i] <= b[j]) {
                res[k++] = a[i++];
            } else {
                res[k++] = b[j++];
            }
        }
    
        while (i < n) res[k++] = a[i++];
        while (j < m) res[k++] = b[j++];
    
        return res;
    }
}