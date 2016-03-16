package uvaProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Prob11854 {

	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line = "";
		while (!(line=reader.readLine().toString()).equals("0 0 0")) {
			String[] numbers = line.split(" ");
			ArrayList<Integer> list = new ArrayList<Integer>();
			for (String s: numbers) {
				list.add(Integer.parseInt(s));
			}
			Collections.sort(list);
			int a = list.get(0);
			int b = list.get(1);
			int c = list.get(2);
			
			if ((c*c)==((a*a)+(b*b))) {
				System.out.println("right");
			} else {
				System.out.println("wrong");
			}
			
		}

	}

}
