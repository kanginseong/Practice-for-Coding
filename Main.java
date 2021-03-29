import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Scanner;

public class Main {

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
