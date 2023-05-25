/* Memoization */

import java.util.HashMap;

public class memoization {
    private static HashMap<Integer, Integer> cache = new HashMap<>();

    public static void main(String[] args) {
        int pos = 92;
        int result = fib(pos);
        System.out.println(result);
    }

    public static int fib(int post) {
        if (post == 0) {
            return 0;
        } else if (post == 1 || post == 2) {
            return 1;
        }
        if (cache.containsKey(post)) {
            return cache.get(post);
        }
        int res = fib(post - 1) + fib(post - 2);
        cache.put(post, res);
        return res;

    }

}
