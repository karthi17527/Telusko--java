
// passcal triangel with memoization

import java.util.HashMap;

public class pascal_memoization {
    private static HashMap<Integer, Integer> factcache = new HashMap<>();

    public static int fact(int num) {
        if (num == 0) {
            return 1;
        }
        if (factcache.containsKey(num)) {
            return factcache.get(num);
        }
        int j = num * fact(num - 1);
        factcache.put(num, j);
        return j;
    }

    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i <= n; i++) {
            for (int k = 0; k < n - i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                int y;
                y = fact(i) / (fact(i - j) * fact(j));
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }
}
