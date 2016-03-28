package uvaProblems;

import java.io.IOException;
import java.util.Scanner;

public class Prob10550 {

	public static void main(String[] args) throws IOException{
		Scanner scanner = new Scanner(System.in);
		int p0,p1,p2,p3;
		while (true) {
			p0 = scanner.nextInt();
			p1 = scanner.nextInt();
			p2 = scanner.nextInt();
			p3 = scanner.nextInt();
			
			if(p0 == 0 && p1 == 0 && p2 == 0 && p3 == 0){
				break;
			}
			
			int res = 3 * 40;
		      if (p0 < p1)
		        res += 40 + p0 - p1;
		      else
		        res += p0 - p1;
		      if (p2 < p1)
		        res += 40 + p2 - p1;
		      else
		        res += p2 - p1;
		      if (p2 < p3)
		        res += 40 + p2 - p3;
		      else
		        res += p2 - p3;

		      res = res * 360 / 40;
		      System.out.println(res);
		}
		scanner.close();
		System.exit(0);
	}
	

}
