package uvaProblems;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Prob458 {
	public static void main(String[] args) throws IOException,FileNotFoundException,Exception{
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String line = new String();
		try {
			StringBuilder sr = new StringBuilder();
			while ((line=bufferedReader.readLine())!=null) {
				char[] chars = line.toCharArray();
				for (int i = 0; i < chars.length; i++) {
					char c = chars[i];
					int k = (int)c;
					if(k==13||k==10){
						System.out.println(c);
					}
					else{
						k =k-7;
						char x = (char)k;
						System.out.print(x);
					}
				}
				System.out.println();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
}
	
}
