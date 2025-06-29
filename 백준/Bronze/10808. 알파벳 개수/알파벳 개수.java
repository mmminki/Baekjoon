import java.util.Scanner;

public class Main {
    // 알파벳 개수
    // 바킹독 3강 배열

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        int[] preq = new int[26];

        for (char s : S.toCharArray()) {
            preq[s-'a']++;
        }
        for (int i : preq) {
            System.out.print(i);
            System.out.print(' ');
        }
    }
}
