import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] nums = new int[num];
        int min=0, max=0;

        for (int i=0; i<num; i++) {
            nums[i] = scanner.nextInt();
            if(i==0) min = nums[i];
            if(i==0) max = nums[i];
            if(nums[i] < min) min = nums[i];
            if(nums[i] > max) max = nums[i];
        }

        System.out.print(min +" "+ max);
    }
}
