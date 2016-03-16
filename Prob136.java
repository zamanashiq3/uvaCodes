package uvaProblems;

public class Prob136 {

	public static void main(String[] args) {
		
		System.out.println("The 1500'th ugly number is 859963392.");
		uglyNumber(1500);
	}
	
	public static void uglyNumber(long position) {
		int a=1;
		for (long i = 1; position!=0; i++) {
			if(isUgly(i)){
				System.out.println(a+" "+i);
				position--;
				a++;
			}
		}
	}
	public static boolean isUgly(long number) {
		if(number==1) 
			return true;
		else
			return (number%2==0||number%3==0||number%5==0)?true:false;
	}

}
