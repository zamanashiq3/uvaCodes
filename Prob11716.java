package uvaProblems;

import java.io.IOException;
import java.util.Scanner;

public class Prob11716 {

	public static void main(String[] args) throws IOException{
		Scanner scanner = new Scanner(System.in);
		
		int T = Integer.parseInt(scanner.nextLine());
		while (T-- > 0) {
			String code = scanner.nextLine();
			int n = code.length();
			int sqrt = (int)Math.round(Math.sqrt(n));
			
			if (sqrt * sqrt != n)
				System.out.println("INVALID");
			else {
				char[][] decode = new char[sqrt][sqrt];
				int k = 0;
				for (int i = 0; i < sqrt; ++i)
					for (int j = 0; j < sqrt; ++j)
						decode[i][j] = code.charAt(k++);
				char[] res = new char[n];
				k = 0;
				for (int j = 0; j < sqrt; ++j)
					for (int i = 0; i < sqrt; ++i)
						res[k++] = decode[i][j];
				System.out.println(String.valueOf(res));
			}
		}
		scanner.close();
		System.exit(0);
	}

}
