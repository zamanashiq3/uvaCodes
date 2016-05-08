package uvaProblems;

import java.io.IOException;
import java.util.Scanner;

public class Prob108 {

	public static void main(String[] args) throws IOException{
		Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            int N = scanner.nextInt();
            int[][] mat = new int[N][N];

            for (int i = 0; i < N; ++i)
                for (int j = 0; j < N; ++j)
                    mat[i][j] = scanner.nextInt();
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < N; ++i) {
                for (int j = 0; j < N; ++j) {
                    int[] sumc = new int[N - j];
                    int[] sumr = new int[N - j];
                    for (int m = i; m < N; ++m) {
                        for (int n = j; n < N; ++n) {
                            sumc[n - j] = (n - j - 1 >= 0 ? sumc[n - j - 1] : 0) + mat[m][n];
                            sumr[n - j] += sumc[n - j];
                            max = Math.max(max, sumr[n - j]);
                        }
                    }
                }
            }
            System.out.println(max);

        }
        scanner.close();
        System.exit(0);

	}

}
