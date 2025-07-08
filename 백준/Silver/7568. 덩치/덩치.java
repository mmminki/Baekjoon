import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static class Human {
        private int weight;
        private int height;

        public Human(int weight, int height) {
            this.weight = weight;
            this.height = height;
        }

        public int getWeight() {
            return weight;
        }

        public int getHeight() {
            return height;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        Human[] humanArr = new Human[n];
        int[] biggerCount = new int[n];
        Arrays.fill(biggerCount, 1);

        for (int i = 0; i < n; i++) {
            int weight = in.nextInt();
            int height = in.nextInt();

            humanArr[i] = new Human(weight, height);
        }

        for (int j = 0; j < n; j++) {
            for (int k = j + 1; k < n; k++) {
                if (humanArr[j].getHeight() > humanArr[k].getHeight() &&
                        humanArr[j].getWeight() > humanArr[k].getWeight()) {
                    biggerCount[k]++;
                    continue;
                }
                if (humanArr[j].getHeight() < humanArr[k].getHeight() &&
                        humanArr[j].getWeight() < humanArr[k].getWeight()) {
                    biggerCount[j]++;
                    continue;
                }
            }
        }
        for(int l=0; l<n; l++) {
            System.out.print(biggerCount[l] +" ");
        }
    }
}
