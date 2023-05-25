
// factorial using recursion
// it gives factorial up to 12 after 12 the result overflows the integer
// datatype

public class facto_recursion {
    public static void main(String[] args) {
        int num = 12;
        int result = 0;
        result = fact(num);
        System.out.println(result);
    }

    public static int fact(int num) {
        if (num == 0) {
            return 1;
        }
        return num * fact(num - 1);
    }
}

// factorial after number 12 using recursion
// it gives factorial up to 21 after 21 the result overflows the long
// datatype

// public class facto_recursion {
// public static void main(String[] args) {
// long num = 21;
// long result = 0;
// result = fact(num);
// System.out.println(result);
// }

// public static long fact(long num) {
// if (num == 0) {
// return 1;
// }
// return num * fact(num - 1);
// }
// }
