import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();

        char c = str.charAt(12);
        int sum = 0;

        if(c=='*') {
            // m 이 '*' 인 경우
            for (int i=0; i<12; i++) {
                char temp = str.charAt(i);
                int intTemp = (int)temp;
                if(i%2==0) {
                    sum+=intTemp;
                    continue;
                }
                sum+= intTemp * 3;
            }
            int result = 10 - (sum % 10);
            System.out.println(result);
            return;
        }

        int idx=0;
        for(int i=0; i<13; i++) {
            char temp = str.charAt(i);
            if(temp == '*') {
                idx = i;
                continue;
            }
            int n = Character.getNumericValue(temp);
            if(i%2==1) {
                sum+= 3*n;
                continue;
            }
            sum+=n;
        }
        int mod = sum % 10;
        int result=0;
        if(idx%2 ==0) {
            result = (10 - mod);
        }
        else {
            int target = 10 - mod;
            if(target == 10) result =0;
            else if(target == 1) result = 7;
            else if(target == 2) result = 4;
            else if(target == 3) result = 1;
            else if(target == 4) result = 8;
            else if(target == 5) result = 5;
            else if(target == 6) result = 2;
            else if(target == 7) result = 9;
            else if(target == 8) result = 6;
            else if(target == 9) result = 3;
//             10 - mod 가 만약에 7이야 그럼 27이 되게끔 해야하네
//            6이면 6 5면 15아니면 45 이런식으로
                // (result * 3)%10 = 10 - mod
        }
        System.out.println(result);



    }
}

