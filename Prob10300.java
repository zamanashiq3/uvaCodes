package uvaProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob10300 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		long t = Long.parseLong(reader.readLine().toString());
		while (t--!=0) {
			long farmer = Long.parseLong(reader.readLine().toString());
			long answer =0,sum;
			while (farmer--!=0) {
				String[] lines = reader.readLine().toString().split(" ");
				long a = Long.parseLong(lines[0]);
				long b = Long.parseLong(lines[1]);
				long c = Long.parseLong(lines[2]);
				sum = a*c;
				answer+=sum;
			}
			System.out.println(answer);
		}
	} 
	
}
