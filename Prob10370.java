package uvaProblems;

import java.io.IOException;
import java.util.Scanner;

public class Prob10370 {
	public static void main(String[] args) throws IOException{
		Scanner scanner = new Scanner(System.in);

        int C = scanner.nextInt();
        while (C-- > 0) {
            int N = scanner.nextInt();
            int[] arry = new int[N];
            double avg = 0.0;
            for (int i = 0; i < N; ++i) {
                arry[i] = scanner.nextInt();
                avg += arry[i];
            }
            avg /= N;
            int count = 0;
            for (int i = 0; i < N; ++i)
                if (arry[i] > avg)
                    ++count;
            System.out.printf( "%.3f", 100.0 * count / N);
            System.out.println("%");
        }
        scanner.close();
        System.exit(0);
	}
}
