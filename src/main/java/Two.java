import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        in.nextLine();
        String s = in.nextLine();
        int i = 0;
        int j = k;
        while (i < n && j > 0) {
            for (j = k; j > 0; j--) {
                if (i + j < n && s.charAt(i + j) == '1') {
                    i = i + j;
                    break;
                }
            }
        }
        if (i == n - 1) System.out.println("YES");
        else System.out.println("NO");
    }
}
