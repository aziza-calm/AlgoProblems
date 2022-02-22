import java.util.Scanner;

public class One {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        basifyMemes(n,m);
    }

    private static void basifyMemes(int n, int m) {
        if (n >= m) {
            for (int i = 0; i < n + m; i++) {
                if (i % 2 == 0) {
                    System.out.print("X");
                } else {
                    System.out.print("Y");
                }
            }
        } else {
            for (int i = 0; i < n + m; i++) {
                if (i % 2 == 0) {
                    System.out.print("Y");
                } else {
                    System.out.print("X");
                }
            }
        }
    }
}
