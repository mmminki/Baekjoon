import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();

        int sum = 0;

        Stack<Integer> myStack = new Stack<>();

        for (int i=0; i<k; i++) {
            int input = in.nextInt();
            if(input == 0){
                sum -= myStack.pop();
                continue;
            }
            sum += input;
            myStack.push(input);
        }
        System.out.println(sum);
    }
}
