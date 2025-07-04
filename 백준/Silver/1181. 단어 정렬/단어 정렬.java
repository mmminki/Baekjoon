import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() == o2.length()) {
                    return  o1.compareTo(o2);
                }
                else {
                    return o1.length() - o2.length();
                }
            }
        });
        System.out.println(arr[0]);
        for(int j=1; j<n; j++) {
            if(arr[j-1].equals(arr[j])) continue;
            System.out.println(arr[j]);

        }
    }
}
