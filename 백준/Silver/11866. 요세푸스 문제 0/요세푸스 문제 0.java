import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();
        Queue<Integer> solQueue = new LinkedList<>();
        Queue<Integer> queue = new LinkedList<>();

        for (int i=1; i<=n; i++) {
            queue.add(i);
        }

        while(!queue.isEmpty()) {
            for(int i=0; i<k-1; i++){
                queue.add(queue.poll());
            }
            solQueue.add(queue.poll());
        }
        System.out.print("<");
        for (int i=0; i<n-1; i++) {
            System.out.print(solQueue.poll() + ", ");
        }
        System.out.print(solQueue.poll() + ">");

    }
}
