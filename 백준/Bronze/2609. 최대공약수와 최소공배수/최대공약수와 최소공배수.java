import java.util.Scanner;

public class Main {

    static int GCD(int n1, int n2) {
        if(n1 == n2) {
            return n1;
        }
        int rest = n1 % n2;
        if(rest == 0) {
            return n2;
        }
        int result = GCD(n2, rest);
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int y = GCD(n1, n2);
        int b = n1*n2/y;

        System.out.println(y);
        System.out.println(b);
    }
}
