import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i=0; i<n; i++) {
            int target = sc.nextInt();

            int j=2;
            while (j <= target) {
                if(j==target) count++;
                if(target%j == 0) {
                    break;
                }
                j++;
            }
        }
        System.out.println(count);
    }
}
