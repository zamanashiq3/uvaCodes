package uvaProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Math;
public class Prob11547 {
		public static void main(String[] args) throws IOException{
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			int t = Integer.parseInt(reader.readLine().toString());
			
			while (t--!=0) {
				int number = Integer.parseInt(reader.readLine().toString());
				System.out.println(magicMethod(number));
			}
			
		}
		
		public static int magicMethod(int number) {
			int digit =0;
			int div_number = (int) ((((((number*567)/9.0)+7492)*235)/47)-498);
			for (int i = 0; i < 2; i++) {
				digit = div_number%10;
				div_number /= 10;
			}
			
			return Math.abs(digit);
		}
}
