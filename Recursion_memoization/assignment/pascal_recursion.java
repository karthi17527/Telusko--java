// passcall triangel with recurssion

public class pascal_recursion {
    public static int fact(int num) {
        if (num == 0) {
            return 1;
        }

        return num * fact(num - 1);
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
