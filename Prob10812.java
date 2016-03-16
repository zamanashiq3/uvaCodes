package uvaProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob10812 {

	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(reader.readLine().toString());
		while (t--!=0) {
			String line[] = reader.readLine().toString().split(" "); 
			int s = Integer.parseInt(line[0]);
			int d = Integer.parseInt(line[1]);
			if (s<d) {
				System.out.println("impossible");
			} else {
				int x =(s+d)/2;
				int y = s-x;
				System.out.println(x+" "+y);
			}
			
			
			
		}

	}

}
