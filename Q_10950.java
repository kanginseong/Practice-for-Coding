import java.util.Scanner;

public class Q_10950 {

    public static void main(String[] args) {

        Scanner scv = new Scanner(System.in);

        int count = scv.nextInt();

        int[] AB = new int[count];

        for (int i = 0; i < AB.length; i++) {
            int A = scv.nextInt();
            int B = scv.nextInt();

            AB[i] = A + B;
        }

        for (int i : AB) {
            System.out.println(i);
        }

    }
}

// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// import java.io.IOException;
// import java.util.StringTokenizer;

// public class Main {

// public static void main(String[] args) throws IOException {

// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

// int N = Integer.parseInt(br.readLine());

// StringTokenizer st;
// StringBuilder sb = new StringBuilder();

// for (int i = 0; i < N; i++) {
// st = new StringTokenizer(br.readLine(), " ");
// sb.append(Integer.parseInt(st.nextToken()) +
// Integer.parseInt(st.nextToken()));
// sb.append('\n');
// }

// System.out.println(sb);
// }
// }
