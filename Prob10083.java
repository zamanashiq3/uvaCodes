package uvaProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Prob10083 {

	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder ans = new StringBuilder();
		
		String line;
		while ((line = in.readLine()) != null) {
			String[] parts = line.split("[ ]+");
			int t = Integer.parseInt(parts[0]);
			int a = Integer.parseInt(parts[1]);
			int b = Integer.parseInt(parts[2]);
			
			ans.append("(" + t + "^" + a + "-1)/(" + t + "^" + b + "-1) ");
			if (t == 1)
				ans.append("is not an integer with less than 100 digits.");
			else if (a == b)
				ans.append("1");
			else if (a < b)
				ans.append("is not an integer with less than 100 digits.");
			else if(Math.floor((a - b) * Math.log10(t)) + 1 >= 100)
				ans.append("is not an integer with less than 100 digits.");
			else if (a % b != 0)
				ans.append("is not an integer with less than 100 digits.");
			else {
				BigInteger tb = BigInteger.valueOf(t);
				BigInteger div = tb.pow(a).subtract(BigInteger.ONE).divide(
						         tb.pow(b).subtract(BigInteger.ONE));
				ans.append(div);
			}
			ans.append("\n");
		}
		System.out.print(ans);
		
		in.close();
		System.exit(0);

	}

}
