package uvaProblems;

import java.io.IOException;
import java.util.Scanner;

public class Prob11877 {

	public static void main(String[] args) throws IOException{
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			int n = scanner.nextInt();
			if (n==0) {
				break;
			}
			int ans = 0;
			while (n > 1) {
				int d = n / 3;
				int r = n % 3;
				ans += d;
				n = d + r;
				if (n == 2)
					++n;
			}
			System.out.println(ans);
			
		}
		scanner.close();
		System.exit(0);

	}

}
