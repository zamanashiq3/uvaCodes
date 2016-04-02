package uvaProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Prob11799 {

	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(reader.readLine().toString());
		int t = 1;
		while (T--!=0) {
			String line = reader.readLine().toString();
			StringTokenizer stk = new StringTokenizer(line);
			
			int max = 0;
			while (stk.hasMoreTokens())
				max = Math.max(max, Integer.parseInt(stk.nextToken()));
			
			System.out.println("Case " + t + ": " + max);
			
			t++;
		}

	}

}
