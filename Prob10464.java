package uvaProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Prob10464 {

	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(reader.readLine().toString());
		while (N--!=0) {
			String[] numbers = reader.readLine().toString().split(" ");
			BigDecimal a = new BigDecimal(numbers[0]);
			BigDecimal b = new BigDecimal(numbers[1]);
			System.out.println(a.add(b));
		}

	}

}
