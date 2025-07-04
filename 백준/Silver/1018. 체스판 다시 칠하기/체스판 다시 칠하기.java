import java.util.Scanner;

public class Main {

    static int repaint(int rowStart, int colStart, String[] board) {
        String[] orgBoard = {"WBWBWBWB", "BWBWBWBW"};
        int count = 0;
        for(int i=0; i<8; i++) {
            int row = rowStart + i;
            for (int j=0; j<8; j++) {
                int col = colStart + j;
                if (board[row].charAt(col) != orgBoard[row % 2].charAt(j)) count++;
            }
        }
        return Math.min(count, 64-count);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N,M;
        N=scanner.nextInt();
        M=scanner.nextInt();
        scanner.nextLine();

        String[] board = new String[N];
        for(int i=0; i<N; i++) {
            board[i] = scanner.nextLine();
        }

        int min = Integer.MAX_VALUE;
        for(int j=0; j<=N-8; j++) {
            for(int k=0; k<=M-8; k++) {
                int result = repaint(j, k, board);
                if(result < min) min = result;
            }
        }
        System.out.println(min);
    }
}
