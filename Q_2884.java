import java.util.Scanner;

public class Q_2884 {

    public static void main(String[] args) {

        Scanner scv = new Scanner(System.in);
        int H = scv.nextInt();
        int M = scv.nextInt();

        if (M < 45) {
            H--;
            M = M + 15;

            if (H < 0) {
                H = 23;
            }
            System.out.println(H + " " + M);
        } else {
            M = M - 45;
            System.out.println(H + " " + M);
        }

    }
}
