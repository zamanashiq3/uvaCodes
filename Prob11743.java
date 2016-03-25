package uvaProblems;

import java.io.IOException;
import java.util.Scanner;

public class Prob11743 {

	public static void main(String[] args) throws IOException{
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		while (T--!=0) {
			int sum = 0;
	        
	        for (int i = 0; i < 4; ++i)
	        {
	            int num = scanner.nextInt();
	       
	            for (int j = 0; j < 2; ++j)
	            {
	                sum += num % 10;
	                num /= 10;
	                sum += num * 2 % 10;
	                sum += (num % 10 * 2 / 10);
	                num /= 10;
	            }
	        }
	        
	        if ((sum % 10)== 0){
	        	System.out.println("Valid");
	        }
	        else{
	        	System.out.println("Invalid");
	        }
	    }
		
		scanner.close();
		System.exit(0);
		
	}

}
