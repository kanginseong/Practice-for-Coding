import java.util.Scanner;

public class Q_1330 {

    public static void main(String[] args) {

        // 1330
        Scanner scv = new Scanner(System.in);

        int A = scv.nextInt();
        int B = scv.nextInt();

        if (A > B) {
            System.out.println(">");
        }

        else if (A < B) {
            System.out.println("<");
        }

        else if (A == B) {
            System.out.println("==");
        }
    }

}
