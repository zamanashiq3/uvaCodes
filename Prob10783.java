package uvaProblems;

import java.io.IOException;
import java.util.Scanner;

public class Prob10783 {
		private static Scanner scanner;

		public static void main(String[] args) throws IOException,Exception{
			scanner = new Scanner(System.in);
			
			int t = scanner.nextInt();
			int x= 1;
			while(t--!=0){
				
				int a = scanner.nextInt();
				int b = scanner.nextInt();
				int sum=0;
				for (int i = a; i <=b; i++) {
					if (i%2!=0) {
						sum+=i;
					}
				}
				
					System.out.print("Case "+x+": "+sum);
				
				x++;
			}
			
		}
}
