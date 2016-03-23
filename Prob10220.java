package uvaProblems;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class Prob10220 {

	public static void main(String[] args) throws IOException{
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			BigInteger fact = BigInteger.ONE;
			
			for (int i = 2; i <= n; ++i)
				fact = fact.multiply(BigInteger.valueOf(i));
			char[] sfact = fact.toString().toCharArray();
			
			int sum = 0;
			for (int i = 0; i < sfact.length; ++i)
				sum += sfact[i] - '0';
			System.out.println(sum);
		}
		scanner.close();
		System.exit(0);

	}

}
