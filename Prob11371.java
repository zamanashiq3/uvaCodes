package uvaProblems;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Prob11371 {

	public static void main(String[] args) throws IOException{
		Scanner scanner = new Scanner(System.in);
		String number = "";
		while (scanner.hasNext()) {
			number = scanner.nextLine();
			char[] c = number.toCharArray();
			Arrays.sort(c);
			String max = new StringBuffer(String.valueOf(c)).reverse().toString();
			
			int i = 0;
			while (c[i] == '0')
				++i;
			if (i < c.length) {
				char t = c[i];
				c[i] = c[0];
				c[0] = t;
			}
			String min = String.valueOf(c);
			long diff = Long.parseLong(max) - Long.parseLong(min);
			System.out.println(max + " - " + min + " = " + diff + " = 9 * " + diff / 9);
			
		}
		
		
		scanner.close();
		System.exit(0);
	}

}
