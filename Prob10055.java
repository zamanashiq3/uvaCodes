package uvaProblems;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob10055 {
	
	public static void main(String[] args) throws IOException,FileNotFoundException,Exception{
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String line = new String();
		try {
			while ((line=bufferedReader.readLine())!=null) {
				String[] nums = line.split(" ");
				long op1 = Long.parseLong(nums[0]);
				long op2 = Long.parseLong(nums[1]);
				System.out.println(Math.abs(op2-op1));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
}
}
