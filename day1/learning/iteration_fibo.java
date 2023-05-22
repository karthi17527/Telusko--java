// fibonachi using loop

// this is working till the 46th fibonachii number after which it over flows
// integer data type

public class iteration_fibo {
    public static void main(String[] args) {
        int pos = 30;
        int res = fib(pos);
        System.out.println(res);
    }

    public static int fib(int pos) {
        int a = 0;
        int b = 1;
        int c = 0;
        for (int i = 2; i <= pos; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
}

// this is working till the 92nd fibonachii number after which it over flows
// long data type

// public class iteration_fibo {
// public static void main(String[] args) {
// long pos = 92;
// long res = fib(pos);
// System.out.println(res);
// }

// public static long fib(long pos) {
// long a = 0;
// long b = 1;
// long c = 0;
// for (int i = 2; i <= pos; i++) {
// c = a + b;
// a = b;
// b = c;
// }
// return c;
// }
// }
