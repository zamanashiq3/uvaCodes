package uvaProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Prob10696 {
		public static void main(String[] args) throws IOException{
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String line = "";
			while (!(line=reader.readLine().toString()).equals("0")) {
				long N = Long.parseLong(line);
				System.out.println("f91("+N+") = "+f91(N));
			}
			
		}
		
		public static long f91(long N) {
			return N<=100?(f91(f91(N+11))):(N-10);
		}
}
