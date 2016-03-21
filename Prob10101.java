package uvaProblems;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prob10101 {

	public static void main(String[] args) throws IOException{
		Scanner scanner = new Scanner(System.in);
		int caseNo = 1;
		
		while (scanner.hasNext()) {
			long n = scanner.nextLong();
			
			String[] names = {"shata", "hajar", "lakh", "kuti"};
			int[] mods = {10, 100, 100, 100};
			int ind = 0;
			
			if (n == 0) {
				System.out.printf("%4d. %d%n", caseNo, n);
			} else {
				List<Long> parts = new ArrayList<Long>();
				parts.add(n % 100);
				n /= 100;
				while (n > 0) {
					parts.add(n % mods[ind]);
					n /= mods[ind];
					ind = (ind + 1) % 4;
				}
				ind = 0;
				StringBuilder sb = new StringBuilder();
				if (parts.get(0) != 0)
					sb.append(" " + parts.get(0));
				for (int i = 1; i < parts.size(); ++i) {
					if (parts.get(i) == 0 && (i - 1) % 4 == 3)
						sb.insert(0, " " + names[(i - 1) % 4]);
					else if (parts.get(i) != 0)
						sb.insert(0, " " + parts.get(i) + " " + names[(i - 1) % 4]);
						
				}
				System.out.printf("%4d.%s%n", caseNo, sb.toString());
				}
			caseNo++;
		}
		
		scanner.close();
		System.exit(0);
	}

}
