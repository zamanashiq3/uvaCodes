package uvaProblems;

import java.io.IOException;
import java.util.Scanner;

public class Prob11172 {

	public static void main(String[] args) throws IOException{
		Scanner scanner = new Scanner(System.in);
		
		int t = scanner.nextInt();
		while(t--!=0){
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			
			if (a>b) {
				System.out.println(">");
			}
			else if (a<b) {
				System.out.println("<");
			}
			else if(a==b){
				System.out.println("=");
			}
		}
		scanner.close();
		System.exit(0);

	}

}
