package uvaProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Prob113 {

	public static void main(String[] args) throws IOException{
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String line = new String();
		
		while (!(line=bufferedReader.readLine().toString()).equals(null)) {
			Integer b1 = new Integer(line);
			BigInteger b2 = new BigInteger(bufferedReader.readLine().toString());
			BigInteger b3 = b2.pow(b1);
			System.out.println(b3);
		}

	}

}
