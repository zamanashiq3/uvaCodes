package uvaProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Prob11059 {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String line;
		int t = 1;
		while ((line = in.readLine()) != null) {
			int N = Integer.parseInt(line);
			StringTokenizer stk = new StringTokenizer(in.readLine());
			in.readLine();
			
			int[] sequence = new int[N];
			long max = 0;
			int i = 0;
			while (stk.hasMoreTokens())
				sequence[i++] = Integer.parseInt(stk.nextToken());
			
			for (int j = 0; j < N; ++j) {
				long prod = 1;
				for (int k = j; k < N; ++k) {
					prod *= sequence[k];
					max = Math.max(max, prod);
				}
			}
			System.out.println("Case #" + t + ": The maximum product is " + max + ".");
			System.out.println();
			++t;
		}
		
		in.close();
		System.exit(0);
	}
}
