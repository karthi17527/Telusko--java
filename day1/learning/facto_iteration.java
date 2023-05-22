// factorial using loop
// it gives factorial up to 12 after 12 the result overflows the integer
// datatype

public class facto_iteration {
    public static void main(String[] args) {
        int num = 12;
        int result = 0;
        result = fact(num);
        System.out.println(result);

    }

    public static int fact(int num) {
        int res = 1;
        for (int i = 1; i <= num; i++) {
            res *= i;
        }
        return res;
    }
}
