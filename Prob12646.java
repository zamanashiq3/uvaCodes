package uvaProblems;

import java.io.IOException;
import java.util.Scanner;

public class Prob12646 {

	public static void main(String[] args) throws IOException{
		
		Scanner  scanner = new Scanner(System.in);
		
		while (scanner.hasNext()) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int c = scanner.nextInt();
			
			int Zero = 0 , One = 0 ;
			
			if (a==0) {
				Zero++;
			} else {
				One++;
			}
			if (b==0) {
				Zero++;
			} else {
				One++;
			}
			
			if (c==0) {
				Zero++;
			} else {
				One++;
			}
			
			
	        if( One == 3 || Zero == 3 ) System.out.println("*");
	        else {
	            if( One > Zero ){
	                if(a == 0 ) System.out.println("A");
	                else if(b == 0 ) System.out.println("B");
	                else System.out.println("C");
	            }else{
	                if(a == 1 ) System.out.println("A");
	                else if(b == 1 ) System.out.println("B");
	                else System.out.println("C");
	            }
			
		}
	}

		scanner.close();
		System.exit(0);
	
	}
}
