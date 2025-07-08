import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        int divideBy5 = N / 5;
        int remainder = N % 5;
        if(remainder == 0) {
            System.out.println(divideBy5);
            return;
        }
        if(remainder == 3) {
            int result = divideBy5 + 1;
            System.out.println(result);
            return;
        }

        int sol = 0;
        if(N % 10 == 1) {
            if(N == 1) {
                System.out.println(-1);
                return;
            }
            //21 일때 d5 = 4
            // 답은 d5-1 +2
            //41일때 d5 = 8
            // 답은 d5+1
            sol = divideBy5+1;
            System.out.println(sol);
            return;
        }
        if(N % 10 == 2) {
            if(N == 2) {
                System.out.println(-1);
                return;
            }
            //22일댸 d5 = 4
            // 답은 d5+2;
            sol = divideBy5+2;
            System.out.println(sol);
            return;
        }
        if(N % 10 == 3) {
            // 13은 안됨 어차피 맨위 에서 처리되네
            //23일댸 d5 = 4
            // 답은 5 1 3 6; d5 + 3
            sol = divideBy5+3;
            System.out.println(sol);
            return;
        }
        if(N % 10 == 4) {
            if(N == 4) {
                System.out.println(-1);
                return;
            }
            //14일때 가능
            //24 일댸 d5 = 4
            // 답은 5 3 3 3;
            sol = divideBy5+2;
            System.out.println(sol);
            return;
        }
        if(N % 10 == 6) {
//            6일때 3 2
//            16 일때 5 2 3 2 d5 = 3
//            26 일때 5 4 3 2 d5 = 5

            sol = divideBy5+1;
            System.out.println(sol);
            return;
        }
        if(N % 10 == 7) {
//            7일 때 불가
            if(N == 7) {
                System.out.println(-1);
                return;
            }
//            17일떄 d5 = 3 ;5 1 3 4
            sol = divideBy5+2;
            System.out.println(sol);
            return;
        }
        if(N % 10 == 9) {
            if(N == 9) {
                System.out.println(3);
                return;
            }
            // 19 일때 d5 = 3; 5 2 3 3
            sol = divideBy5+2;
            System.out.println(sol);
            return;
        }

    }
}

