import java.util.ArrayList;
import java.util.Scanner;


public class Five {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int W = scanner.nextInt();
        int n = scanner.nextInt();
        int[] sampleLength = new int[n];
        ArrayList<Integer> trackIdx = new ArrayList<>();

        for (int i = 0; i < n; ++i) {
            scanner.nextLine();
            sampleLength[i] = scanner.nextInt();
        }

        int[] spaceLeft = new int[H];

        for (int i = 0; i < H; ++i) {
            spaceLeft[i] = W;
        }

        for (int len : sampleLength) {
            int foundIdx = -1;
            for (int j = 0; j < H; ++j) {
                if (spaceLeft[j] >= len) {
                    spaceLeft[j] -= len;
                    foundIdx = ++j;
                    break;
                }
            }
            trackIdx.add(foundIdx);
        }

        trackIdx.forEach(System.out::println);

    }

}