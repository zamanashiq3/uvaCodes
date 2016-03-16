package uvaProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob11332 {

	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		while (!(line=reader.readLine().toString()).equals("0")) {
			System.out.println(sumDigit(line));
		}

	}
	
	public static long sumDigit(String number){
		long res =0;
		for (char numString : number.toCharArray()) {
			res += (int)(numString -48);
		}
		
		return (res<=9)?res:sumDigit(String.valueOf(res));
	}

}
