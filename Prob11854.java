package uvaProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Prob11854 {


	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		while (true) {
			StringTokenizer stk = new StringTokenizer(in.readLine());
			int a = Integer.parseInt(stk.nextToken());
			int b = Integer.parseInt(stk.nextToken());
			int c = Integer.parseInt(stk.nextToken());
			
			if (a == 0 && b == 0 && c == 0)
				break;
			
			boolean isRight = a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a;
			System.out.println(isRight ? "right" : "wrong");
		}
		
		in.close();
		System.exit(0);

	}

}
