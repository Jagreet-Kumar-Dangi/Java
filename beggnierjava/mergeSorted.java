package beggnierjava;

import java.util.Arrays;

public class mergeSorted {
    public static int[] brute(int[] a, int[] b) {
        int n = a.length, m = b.length;
        int[] res = new int[n + m];

        System.arraycopy(a, 0, res, 0, n);
        System.arraycopy(b, 0, res, n, m);

        Arrays.sort(res);

        return res;
    }
}