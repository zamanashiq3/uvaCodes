package uvaProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob371 {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		while (true) {
			String line = in.readLine().trim();
			String[] parts = line.split("[ ]+");
			
			long L = Integer.parseInt(parts[0]);
			long H = Integer.parseInt(parts[1]);
			
			if (L == 0 && H == 0)
				break;
			
			long V = -1;
			int S = -1;
			for (long i = Math.min(L, H); i <= Math.max(L, H); ++i) {
				int tmp = ackermann(i);
				if (tmp > S) {
					V = i;
					S = tmp;
				}
			}
			System.out.println("Between " + Math.min(L, H) + " and " + Math.max(L, H) + ", " + V + " generates the longest sequence of " + S + " values.");
		}
		
		in.close();
		System.exit(0);
		
		
		
	}
	
	public static int ackermann(long S) {
		int cnt = 0;
		
		while (true) {
			if (S % 2 == 0)
				S /= 2;
			else
				S = 3 * S + 1;
			++cnt;
			if (S == 1)
				break;
		}
		
		return cnt;
	}

}
