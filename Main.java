import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try {

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str, " ");
			int dan = Integer.parseInt(st.nextToken());

			for (int i = 1; i < 10; i++) {
				System.out.println(dan + " * " + i + " = " + i * dan);
			}

		} catch (IOException e) {

		}

	}
}
