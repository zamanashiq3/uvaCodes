package uvaProblems;

import java.util.Scanner;

public class Prob10079 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			long N = scanner.nextLong();
			
			if (N<0) {
				break;
			}
			
			long res = 1;
			for (long i = 0; i <= N; ++i)
				res += i;
			System.out.println(res);
			
		}
		
		
		scanner.close();
		System.exit(0);
	}

}
