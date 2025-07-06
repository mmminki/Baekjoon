import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[501];
        int count = 0;
        for(int i=1; i<=500; i++) {
            if(i%5 == 0) {
                count++;
            }
            if(i%25 == 0) {
                count++;
            }
            if(i%125 == 0) {
                count++;
            }
            arr[i] = count;
        }
        int n = in.nextInt();
        System.out.println(arr[n]);
    }
}
