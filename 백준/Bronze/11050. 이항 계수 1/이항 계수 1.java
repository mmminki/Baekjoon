import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n =in.nextInt();
        int k = in.nextInt();

        int result, mom = 1, son = 1;
        for(int i=1; i<=n-k; i++) {
            mom *= n-i+1;
            son *= i;
        }
        result = mom / son;
        System.out.println(result);


    }
}
