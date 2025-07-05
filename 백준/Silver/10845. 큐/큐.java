import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException { // IOException 처리 필수
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); // 첫 줄에 있는 명령의 개수를 읽음

        Queue myQueue = new Queue(n); // 큐 생성

        for (int i = 0; i < n; i++) {
            String str = br.readLine(); // 각 명령을 한 줄씩 읽음

            // 'push' 명령 처리
            if (str.startsWith("push")) {
                String[] splitedStr = str.split(" ");
                int num = Integer.parseInt(splitedStr[1]);
                myQueue.push(num);
            }
            // 'pop' 명령 처리
            else if (str.equals("pop")) { // else if로 효율적인 조건 검사
                System.out.println(myQueue.pop());
            }
            // 'size' 명령 처리
            else if (str.equals("size")) {
                System.out.println(myQueue.size());
            }
            // 'empty' 명령 처리
            else if (str.equals("empty")) {
                System.out.println(myQueue.empty());
            }
            // 'front' 명령 처리
            else if (str.equals("front")) {
                System.out.println(myQueue.front());
            }
            // 'back' 명령 처리
            else if (str.equals("back")) {
                System.out.println(myQueue.back());
            }
        }
        br.close(); // BufferedReader 자원 반납 (좋은 습관)
    }

    public static class Queue {
        private int front; // 큐의 맨 앞(데이터가 나가는 곳) 인덱스
        private int back;  // 큐의 맨 뒤(데이터가 들어오는 곳) 인덱스
        private int[] queue; // 큐 데이터를 저장할 배열

        public Queue(int n) {
            front = 0;
            back = 0;
            queue = new int[n]; // 큐의 최대 크기 n으로 배열 초기화
        }

        // 큐에 요소 추가
        public void push(int n) {
            // 실제 문제에서는 큐가 가득 차는 경우는 고려하지 않거나 N이 충분히 크므로 별도 체크 안 해도 됨
            // 만약 오버플로우를 처리해야 한다면 'if (back < queue.length)' 조건 추가
            queue[back] = n;
            back++; // 뒤쪽 인덱스 증가
        }

        // 큐에서 요소 제거 및 반환
        public int pop() {
            if (front == back) { // 큐가 비어있으면
                return -1;
            }
            int returnVal = queue[front]; // 맨 앞 요소 가져오기
            front++; // 앞쪽 인덱스 증가
            return returnVal;
        }

        // 큐의 맨 앞 요소 반환 (제거 안 함)
        public int front() {
            if (front == back) { // 큐가 비어있으면
                return -1;
            }
            return queue[front];
        }

        // 큐의 맨 뒤 요소 반환 (제거 안 함)
        public int back() {
            if (front == back) { // 큐가 비어있으면
                return -1;
            }
            return queue[back - 1]; // back은 다음 요소가 들어갈 위치이므로, 실제 마지막 요소는 back-1
        }

        // 큐의 현재 크기 반환
        public int size() {
            return back - front; // 들어온 요소 수 - 나간 요소 수
        }

        // 큐가 비어있는지 확인
        public int empty() {
            if (front == back) { // front와 back이 같으면 큐는 비어있음
                return 1; // 비어있으면 1 반환
            }
            return 0; // 비어있지 않으면 0 반환
        }
    }
}