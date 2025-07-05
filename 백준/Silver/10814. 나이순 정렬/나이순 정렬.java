import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        ArrayList<User> users = new ArrayList<>();
        for(int i=0; i<N; i++) {
            int age = sc.nextInt();
            String name = sc.nextLine();
            User newUser = new User(age, name);
            users.add(newUser);
        }

        users.sort((m1, m2)->(m1.age==m2.age) ? 0: (m1.age>m2.age) ? 1 : -1);
        for (User user : users) {
            System.out.println(user.age + user.name);
        }
    }

    public static class User {
        private int age;
        private String name;

        public User(int age, String name) {
            this.age = age;
            this.name = name;
        }


    }
}
