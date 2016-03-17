package uvaProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Prob514 {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		while (true) {
			int N = Integer.parseInt(in.readLine());
			if (N == 0)
				break;
			
			while (true) {
				String line = in.readLine();
				if (line.equals("0"))
					break;
				String[] parts = line.split("[ ]+");
				int[] perm = new int[N];
				
				for (int i = 0; i < N; ++i)
					perm[i] = Integer.parseInt(parts[i]);
				int j = 0;
				
				Stack<Integer> S = new Stack<Integer>();
				for (int x = 1; x <= N; ++x) {
					S.push(x);
					while (!S.isEmpty() && S.peek() == perm[j]) {
						S.pop();
						++j;
					}
				}
				
				if (S.isEmpty())
					System.out.println("Yes");
				else
					System.out.println("No");
			}
			
			System.out.println();
		}
		
		in.close();
		System.exit(0);
	}

}
