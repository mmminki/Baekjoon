import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        for(int i=0; i<testCases; i++) {
            int R = scanner.nextInt();
            String S = scanner.nextLine();
            S=S.trim();
            char[] newS = new char[S.length()*R];

            for(int j=0; j<S.length(); j++) {
                for(int k=0; k<R; k++) {
                    newS[j+k] = S.charAt(j);
                    System.out.print(newS[j+k]);
                }
            }
            System.out.println();
        }

    }
}
