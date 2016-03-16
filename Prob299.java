package uvaProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Prob299 {
	public static void main(String[] args) throws IOException,Exception{
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(reader.readLine().toString());
		
		while (t--!=0) {
			int k = Integer.parseInt(reader.readLine().toString());
			String line = reader.readLine();
			String[] splitList = line.split(" ");
			ArrayList<Integer> list = new ArrayList<Integer>();
			for (int i = 0; i < k; i++) {
				list.add(Integer.parseInt(splitList[i]));
			}
			System.out.println(sortSwapCount(list));
		}
}
	
	public static int sortSwapCount(ArrayList<Integer> numbers) {
		int count=0,temp=0,i,j;
		for ( j = 0; j < numbers.size()-1; j++) {
			for ( i = 0; i < j; i++) {
				if (numbers.indexOf(i)>numbers.indexOf(i+1)) {
					temp = numbers.indexOf(i);
					numbers.add(numbers.indexOf(i+1));
					numbers.add(temp);
					count++;
				}
			}
		}
		return count;
	}
}
