package uvaProblems;

import java.io.IOException;
import java.lang.Math;
import java.util.Scanner;

public class Prob10924 {

	private static Scanner scanner;

	public static void main(String[] args) throws IOException{
		scanner = new Scanner(System.in);
		
		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			int sum = 0;
			char[] lineArr = line.toCharArray();
			for (char c : lineArr) {
				int i = (int)c;
				if(i>=97 && i<=122){
					sum+=(i-96);
				}
				if(i>=65 && i<=90){
					sum+=(i-38);
				}
			}
			if (isPrime(sum)) {
				System.out.println("It is a prime word.");
			} else {
				System.out.println("It is not a prime word.");
			}
			
			 
		}
	}
	
	public static boolean isPrime(int n) {
		   if (n==1) {
			return true;
		}
			if (n <= 1) {
		       return false;
		   }
		   for (int i = 2; i <(int) Math.sqrt(n); i++) {
		       if (n % i == 0) {
		           return false;
		       }
		   }
		   return true;
		}

}
