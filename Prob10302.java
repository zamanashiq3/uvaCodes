package uvaProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Prob10302 {
	public static void main(String[] args) throws IOException,Exception{
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Scanner scanner = new Scanner(System.in);
		
		String line = new String();
		
		while ((line=reader.readLine())!=null) {
			long number = Long.parseLong(line);
			System.out.println((number*(number+1)/2)*(number*(number+1)/2));
		}
		
	}
}
