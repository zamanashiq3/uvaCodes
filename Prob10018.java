package uvaProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Prob10018 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Scanner scanner = new Scanner(reader.readLine());
		
		int t = scanner.nextInt();
		while(t--!=0){
			int count = 0;
			long sum = 0;
			String line = reader.readLine().toString();
			while(!istPalindrom(line.toCharArray())){
				String lineRev = new StringBuilder(line).reverse().toString();
				//System.out.println(line+" "+lineRev+" "+istPalindrom(line.toCharArray()));
				sum = (Long.parseLong(line)+Long.parseLong(lineRev));
				count++;
				line = String.valueOf(sum);
			}
			System.out.println(count+" "+sum);
		}
	
	}
	public static boolean istPalindrom(char[] word){
	    int i1 = 0;
	    int i2 = word.length - 1;
	    while (i2 > i1) {
	        if (word[i1] != word[i2]) {
	            return false;
	        }
	        ++i1;
	        --i2;
	    }
	    return true;
	}
}
