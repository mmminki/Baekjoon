import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String n = sc.nextLine();
            boolean symmetric = true;
            if(n.equals("0")) break;
 //            if(n.length()%2 == 0) {
//                System.out.println("no");
//                symmetric = false;
//                continue;
//            }
            for(int i=0; i<(n.length()/2); i++) {
                if(n.charAt(i)!=(n.charAt(n.length()-i-1))) {
                    System.out.println("no");
                    symmetric = false;
                    break;
                }
            }
            if(symmetric) System.out.println("yes");
        }
    }
}
