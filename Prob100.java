package uvaProblems;

import java.util.Arrays;
import java.util.Scanner;

public class Prob100 {
	static int resArr[] = new int[1000001];
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int i, j;
		int curAns,maxAns;
		
		Arrays.fill(resArr, -1);

		while (sc.hasNext()) {
			i = sc.nextInt();
			j = sc.nextInt();

			maxAns = -1;
			for(int k = Math.min(i, j);k<=Math.max(i, j);k++){
				curAns = solve(k);
				
				if(curAns > maxAns) maxAns = curAns;
			}
			
			System.out.println(i + " " + j + " " + maxAns);
		}
	}

	static int solve(long n) {
		int count = 0;
		int index = (int) n;
		
		if(resArr[index] != -1) return resArr[index];

		while (n != 1) {
			count++;
			if (n % 2 != 0)
				n = 3 * n + 1;
			else
				n = n / 2;
		}
		count++;

		resArr[index] = count;
		return count;
	}

}