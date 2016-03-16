package uvaProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Prob11185 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String s = null;
		
		while (!(s = reader.readLine().toString()).startsWith("-")) {
			BigInteger N = new BigInteger(s);
			System.out.println(N.toString(3));
		}
		
	}

}
