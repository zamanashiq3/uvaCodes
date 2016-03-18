package uvaProblems;

import java.io.IOException;
import java.util.Scanner;

public class Prob10591 {

	public static void main(String[] args) throws IOException{
		Scanner scanner = new Scanner(System.in);
		int Case = 1;
		int t = scanner.nextInt();
		while (t--!=0) {
			long number = scanner.nextLong();
			String answer = "Case #"+Case+": ";
			System.out.println(isHappy(calculateHappy(number))?answer+number+" is a Happy number.":answer+number+" is an Unhappy number.");
			Case++;
		}
		scanner.close();
		System.exit(0);

	}
	public static long calculateHappy(long num) {
		long x= num;
		long res=0;
		while(x!=0){
			long g = x%10;
			res+=(g*g);
			x/=10;
		}
		return (res<=9)?res:calculateHappy(res);
	}
	
	public static boolean isHappy(long num) {
		return (num==1)?true:false;
	}

}
