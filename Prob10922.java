package uvaProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob10922 {

	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String number = new String();
		
		while (!(number=reader.readLine().toString()).equals("0")) {
			int sum = 0;
			for (char c : number.toCharArray())
				sum += c - '0';
			
			int degree = 0;
			if (sum % 9 == 0) {
				degree = 1;
				while (sum > 9 && sum % 9 == 0) {
					int tmp = 0;
					
					while (sum > 0) {
						tmp += sum % 10;
						sum /= 10;
					}
					sum = tmp;
					++degree;
				}
			}
			if (degree > 0)
				System.out.println(number + " is a multiple of 9 and has 9-degree " + degree + ".");
			else
				System.out.println(number + " is not a multiple of 9.");
		}

	}

}
