package uvaProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob12342 {

	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder ans = new StringBuilder();
		int T = Integer.parseInt(reader.readLine());
		for (int t = 1; t <= T; ++t) {
			int income = Integer.parseInt(reader.readLine());
			double tax = 0.0;
			
			if (income > 180000) {
				income -= 180000;
				if (income > 0) {
					int diff = Math.min(income, 300000);
					income -= diff;
					tax += 0.10 * diff;
				}
				if (income > 0) {
					int diff = Math.min(income, 400000);
					income -= diff;
					tax += 0.15 * diff;
				}
				if (income > 0) {
					int diff = Math.min(income, 300000);
					income -= diff;
					tax += 0.20 * diff;
				}
				if (income > 0)
					tax += 0.25 * income;
				
				tax = Math.max(2000.0, tax);
			}
			ans.append(String.format("Case %d: %d\n", t, (int)Math.ceil(tax)));
		}
		System.out.print(ans);
		
	}


}
