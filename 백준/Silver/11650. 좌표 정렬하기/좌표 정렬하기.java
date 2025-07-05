import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        Coordinate[] coordinates = new Coordinate[n];

        for(int i=0; i<n; i++) {
            int x = in.nextInt();
            int y = in.nextInt();

            coordinates[i] = new Coordinate(x,y);
        }

        Arrays.sort(coordinates, new Comparator<Coordinate>() {
            @Override
            public int compare(Coordinate o1, Coordinate o2) {
                if(o1.x > o2.x) return 1;
                if(o1.x < o2.x) return -1;
                else {
                    if(o1.y > o2.y) return 1;
                    if(o1.y < o2.y) return -1;
                    else return 0;
                }
            }
        });
        for(int j=0; j<n; j++) {
            System.out.println(coordinates[j].x + " " + coordinates[j].y);
        }

    }

    public static class Coordinate {
        private int x, y;

        public Coordinate (int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
