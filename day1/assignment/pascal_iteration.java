// passcall triangel with iteration

public class pascal_iteration {
    public static int fact(int num) {
        if (num == 0) {
            return 1;
        }
        int res = 1;
        for (int j = 1; j <= num; j++) {
            res *= j;
        }
        return res;
    }

    public static void main(String[] args) {
        int row = 5;
        for (int i = 0; i <= row; i++) {
            for (int k = 0; k < row - i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                int y = fact(i) / (fact(i - j) * fact(j));

                System.out.print(y + " ");
            }
            System.out.println();
        }
    }
}
