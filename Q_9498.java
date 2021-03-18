import java.util.Scanner;

public class Q_9498 {

	public static void main(String[] args) {

		// 9498
		Scanner scv = new Scanner(System.in);

		int score = 0;

		score = scv.nextInt();

		if (score <= 100 && score >= 90) {
			System.out.println("A");
		} else if (score < 90 && score >= 80) {
			System.out.println("B");
		} else if (score < 80 && score >= 70) {
			System.out.println("C");
		} else if (score < 70 && score >= 60) {
			System.out.println("D");
		} else if (score < 60) {
			System.out.println("F");
		}
	}

}
