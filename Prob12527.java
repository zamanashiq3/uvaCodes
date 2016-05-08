package uvaProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob12527 {
	static boolean hasRepeated(int n) {
		boolean[] repeat = new boolean[10];
		while (n > 0) {
			int d = n % 10;
			if (repeat[d])
				return true;
			repeat[d] = true;
			n /= 10;
		}
		return false;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String line;
		while ((line = reader.readLine()) != null) {
			String[] parts = line.split("[ ]+");
			int N = Integer.parseInt(parts[0]);
			int M = Integer.parseInt(parts[1]);
			
			int ans = 0;
			for (int i = N; i <= M; ++i)
				if (!hasRepeated(i))
					++ans;
			System.out.println(ans);
		}
		
		reader.close();
		System.exit(0);
	}
}
