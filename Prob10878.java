package uvaProblems;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob10878 {

	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line;
		int i;
		char value, b;
		while ((line = in.readLine()) != null)
		{
			if (line.indexOf("_") >= 0){
				continue;
			}
			
			line = line.replace("|", "");
			line = line.replace(".", "");
			
			value = 0;
			b = 1;
			for (i=7; i>=0; i--){
				if (line.charAt(i) == 'o'){
					value += b;
				}
				b *=2;
			}
			
			System.out.print(value);
		}	

	}

}
