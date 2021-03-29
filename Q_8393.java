import java.util.Scanner;

public class Q_8393 {

    public static void main(String[] args) {

        Scanner scv = new Scanner(System.in);

        int n = scv.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println(sum);
    }
}