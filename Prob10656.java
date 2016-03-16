package uvaProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Prob10656 {

	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line =null;
		while (!(line=reader.readLine().toString()).equals("0")) {
			int setSize = Integer.parseInt(line);
			ArrayList<Integer> list = new ArrayList<Integer>();
			while (setSize--!=0) {
				int z = Integer.parseInt(reader.readLine().toString());
				if(z!=0){
					list.add(z);
				}
				
			}
			Collections.sort(list);
			int a = list.get(list.size()-1);
			int b = list.get(list.size()-2);
			System.out.println(b+" "+a);
		}

	}

}
