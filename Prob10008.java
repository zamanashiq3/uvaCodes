package uvaProblems;

import java.io.IOException;
import java.util.Scanner;

public class Prob10008 {

	public static void main(String[] args) throws IOException{
		 Scanner scanner = new Scanner(System.in);
	        int[] freq = new int[256];

	        int N = Integer.parseInt(scanner.nextLine());
	        String txt = "";
	        while (N-- > 0) txt += scanner.nextLine();

	        for (int i = 0; i < txt.length(); ++i) {
	            char c = txt.charAt(i);
	            if (Character.isLetter(c)) c = Character.toUpperCase(c);
	            ++freq[c];
	        }
	        for (int i = 1; i <= 26; ++i) {
	            int max = 0;
	            char cmax = ' ';
	            for (char c = 'A'; c <= 'Z'; ++c) {
	                if (freq[c] > max) {
	                    max = freq[c];
	                    cmax = c;
	                }
	            }
	            if (max > 0) {
	                System.out.println(cmax + " " + max);
	                freq[cmax] = 0;
	            }

	        }
	        
	     scanner.close();
	     System.exit(0);
	}

}
