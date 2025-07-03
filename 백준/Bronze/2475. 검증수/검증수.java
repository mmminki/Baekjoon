import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[5];
        int result = 0;
        for(int i=0; i<nums.length; i++){
            nums[i] = scanner.nextInt();

            result+=nums[i] * nums[i];
        }
        result %= 10;
        System.out.println(result);
    }
}
