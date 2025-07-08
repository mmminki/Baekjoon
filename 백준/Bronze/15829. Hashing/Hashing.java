import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int l = in.nextInt();
        in.nextLine();
        String str = in.nextLine();
        long zegob = 1;
        long sum = 0;
        for (int i=0; i<str.length(); i++) {
            int c = str.charAt(i) - 96;
            long toMultiply = c*zegob % 1234567891;
            sum+= toMultiply;
            zegob *= 31;
        }
        System.out.println(sum);
    }
}
