// fibanochi using recursion

// this is working till the 46nd fibonachii number after which it over flow
// integer data

public class recursion_fibo {
    public static void main(String[] args) {
        int pos = 8;
        int result = fib(pos);
        System.out.println(result);
    }

    public static int fib(int pos) {
        if (pos == 0) {
            return 0;
        }
        if (pos == 1 || pos == 2) {
            return 1;
        }
        return fib(pos - 1) + fib(pos - 2);
    }
}

// // this is working till the 92nd fibonachii number after which it overflows
// long data

// public class recursion_fibo {
// public static void main(String[] args) {
// long pos = 9;
// long result = fib(pos);
// System.out.println(result);
// }

// public static long fib(long pos) {
// if (pos == 0) {
// return 0;
// }
// if (pos == 1 || pos == 2) {
// return 1;
// }
// return fib(pos - 1) + fib(pos - 2);
// }
// }
