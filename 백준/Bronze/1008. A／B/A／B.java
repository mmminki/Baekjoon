import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        double result;
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        result = num1/num2;
        System.out.println(result);
    }
}