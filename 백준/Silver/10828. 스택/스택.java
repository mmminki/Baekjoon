import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// import java.sql.PreparedStatement; // 이 import는 필요 없습니다.

public class Main {
    public static void main(String[] args) throws IOException { // IOException 처리 필요
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); // n을 읽을 때도 readLine 사용

        Stack myStack = new Stack(n);

        for (int i=0; i<n; i++) {
            String str = br.readLine(); // 모든 입력을 readLine으로 처리

            if(str.startsWith("push")) {
                String[] splitedStr = str.split(" ");
                int a = Integer.parseInt(splitedStr[1]);
                myStack.push(a);
            } else if(str.equals("pop")) { // else if로 변경하여 효율성 높임
                System.out.println(myStack.pop());
            } else if(str.equals("size")) {
                System.out.println(myStack.size());
            } else if(str.equals("empty")) {
                myStack.empty();
            } else if(str.equals("top")) {
                myStack.top();
            }
        }
        // br.close(); // 자원 반납 (선택 사항이지만 좋은 습관)
    }

    public static class Stack {
        private int len;
        private int curPoint;
        private int[] stack; // stack 배열 선언 위치를 클래스 멤버로 옮김

        public Stack (int n){
            len = n;
            curPoint = 0;
            stack = new int[n];
        }

        public void push(int n) {
            // 스택이 가득 찼는지 확인하는 로직 추가 (선택 사항이지만 안전성 증가)
            if (curPoint < len) {
                stack[curPoint] = n;
                curPoint++;
            } else {
                // 스택 오버플로우 처리 (선택 사항)
                // System.out.println("Stack Overflow!");
            }
        }

        public int pop () {
            if(curPoint==0) return -1;
            int result = stack[curPoint-1];
            // 배열에서 값을 실제로 지우는 작업은 하지 않아도 덮어쓰므로 괜찮지만,
            // 명확하게 null 등으로 설정하는 경우도 있음 (참조 타입의 경우)
            curPoint--;
            return result;
        }

        public int size () {
            return curPoint;
        }

        public void empty() {
            if(curPoint == 0) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }

        public void top() {
            if(curPoint == 0) {
                System.out.println("-1");
            } else {
                System.out.println(stack[curPoint-1]);
            }
        }
    }
}