import java.util.Scanner;

public class Three {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int queueLength = scanner.nextInt();
        int[][] ticketBuying = new int[queueLength][3];

        for (int i = 0; i < queueLength; ++i) {
            scanner.nextLine();
            for (int j = 0; j < 3; ++j) {
                ticketBuying[i][j] = scanner.nextInt();
            }
        }

        int[] minTicketsNumber = new int[queueLength + 1];
        minTicketsNumber[0] = 0;

        for (int i = 1; i < queueLength + 1; ++i) {
            minTicketsNumber[i] = Integer.MAX_VALUE;
        }

        for (int i = 0; i < queueLength; ++i) {
            for (int step = 0; step < 3; ++step) {
                if (i + step < queueLength) {
                    minTicketsNumber[i + 1 + step] = Math.min(minTicketsNumber[i + 1 + step], minTicketsNumber[i] + ticketBuying[i][step]);
                }
            }
        }

        System.out.println(minTicketsNumber[queueLength]);
    }
}