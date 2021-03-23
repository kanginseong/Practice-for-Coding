import java.util.Scanner;

public class Q_14681 {

    public static void main(String[] args) {

        Scanner scv = new Scanner(System.in);
        int x = scv.nextInt();
        int y = scv.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("1");
        } else if (x < 0 && y > 0) {
            System.out.println("2");
        } else if (x < 0 && y < 0) {
            System.out.println("3");
        } else if (x > 0 && y < 0) {
            System.out.println("4");
        }

    }
}
