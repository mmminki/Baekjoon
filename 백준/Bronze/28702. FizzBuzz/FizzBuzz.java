import java.util.Scanner;

public class Main {
    public static boolean isStr(String str) {
        if(str.equals("Fizz")) return true;
        if(str.equals("Buzz")) return true;
        if(str.equals("FizzBuzz")) return true;
        return false;
    }

    public static String calSol(int n) {
        if(n%3 == 0 && n%5 ==0) return "FizzBuzz";
        if(n%3 == 0) return "Fizz";
        if(n%5 == 0) return "Buzz";
        String str = n+"";
        return str;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str1 = in.nextLine();
        String str2 = in.nextLine();
        String str3 = in.nextLine();

        if(!isStr(str1)) {
            int sol = Integer.parseInt(str1) + 3;
            String result = calSol(sol);
            System.out.println(result);
            return;
        }
        if(!isStr(str2)) {
            int sol = Integer.parseInt(str2) + 2;
            String result = calSol(sol);
            System.out.println(result);
            return;
        }
        if(!isStr(str3)) {
            int sol = Integer.parseInt(str3) + 1;
            String result = calSol(sol);
            System.out.println(result);
            return;
        }
    }
}
