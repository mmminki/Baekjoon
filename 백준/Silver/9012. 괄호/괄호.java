import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer>myStack = new Stack<>();
        int tastcase = sc.nextInt();
        sc.nextLine();
        for (int i=0; i<tastcase; i++) {
            boolean isVPS = true;
            String str = sc.nextLine();

            for(int j=0; j<str.length(); j++) {
                if(str.charAt(j) == '(') {
                    myStack.push(1);
                }
                if(str.charAt(j) == ')') {
                    if(myStack.isEmpty()) {
                        isVPS=false;
                        break;
                    }
                    myStack.pop();
                }
            }
            if(isVPS && myStack.isEmpty()) System.out.println("YES");
            else System.out.println("NO");
            myStack.clear();
        }
    }
}
