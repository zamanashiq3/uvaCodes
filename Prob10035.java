package uvaProblems;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob10035 {

	public static void main(String[] args) throws IOException,FileNotFoundException,Exception{
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String line = new String();
		try {
			
			while (!(line=bufferedReader.readLine()).contentEquals("0 0")) {
				String[] nums = line.split(" ");
				long op1 = Long.parseLong(nums[0]);
				long op2 = Long.parseLong(nums[1]);
				int count =0;
				for (long i = op1; i <=op2; i++) {
//					if(isSquareNumber(i)){
//						count++;
//						
//					}
				}
				System.out.println(count);
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static int carryOpration(String s1,String s2){
		int len = 0,count=0;
		if(s1.length()>=s2.length()){
			len = s1.length();
		}
		else{
			len =s2.length();
		}
		for(int i=0;i<len;i++){
			
		}
		return count;
	}
}
