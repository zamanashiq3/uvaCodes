package uvaProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob12243 {

	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line = new String();
		while (!(line=reader.readLine().toString()).equals("*")) {
			String[] words = line.split("[ ]");
			char initial = Character.toLowerCase(words[0].charAt(0));
			
			boolean ok = true;
			for (int i = 1; i < words.length; ++i)
				if (Character.toLowerCase(words[i].charAt(0)) != initial) {
					ok = false;
					break;
				}
			System.out.println(ok ? "Y" : "N");
		}

	}

}
