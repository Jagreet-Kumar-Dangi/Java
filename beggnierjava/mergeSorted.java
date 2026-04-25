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
    // public static int[] better(int[] a, int[] b) {
    //     int n = a.length, m = b.length;
    //     int[] res = new int[n + m];
    
    //     int i = 0, j = 0, k = 0;
    
    //     while (i < n && j < m) {
    //         if (a[i] <= b[j]) {
    //             res[k++] = a[i++];
    //         } else {
    //             res[k++] = b[j++];
    //         }
    //     }
    
    //     while (i < n) res[k++] = a[i++];
    //     while (j < m) res[k++] = b[j++];
    
    //     return res;
    // }

    public static void optimal(int[] a, int[] b) {
    int n = a.length, m = b.length;
    int gap = (n + m + 1) / 2;

    while (gap > 0) {
        int i = 0;
        int j = i + gap;

        while (j < n + m) {

            int val1 = (i < n) ? a[i] : b[i - n];
            int val2 = (j < n) ? a[j] : b[j - n];

            if (val1 > val2) {
                // swap cases
                if (i < n && j < n) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                } else if (i < n && j >= n) {
                    int temp = a[i];
                    a[i] = b[j - n];
                    b[j - n] = temp;
                } else {
                    int temp = b[i - n];
                    b[i - n] = b[j - n];
                    b[j - n] = temp;
                }
            }

            i++;
            j++;
        }

        if (gap == 1) break;
        gap = (gap + 1) / 2;
    }
}
}