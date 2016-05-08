package uvaProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Prob12239 {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		while (true) {
			String line = reader.readLine();
			StringTokenizer stk = new StringTokenizer(line);
			
			int N = Integer.parseInt(stk.nextToken());
			int B = Integer.parseInt(stk.nextToken());
			
			if (N == 0 && B == 0)
				break;
			
			int[] bingo = new int[B];
			boolean[] found = new boolean[N + 1];
			line = reader.readLine();
			stk = new StringTokenizer(line);
			
			for (int i = 0; i < B; ++i)
				bingo[i] = Integer.parseInt(stk.nextToken());
			
			found[0] = true;
			boolean ok = true;
			
			for (int i = 0; i < B; ++i)
				for (int j = i + 1; j < B; ++j) {
					int diff = Math.abs(bingo[i] - bingo[j]);
					if (diff <= N)
						found[diff] = true;
				}
			
			for (int i = 0; i <= N; ++i)
				ok &= found[i];
			
			System.out.println(ok ? "Y" : "N");
		}
		
		reader.close();
		System.exit(0);
	}
	
}
