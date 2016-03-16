package uvaProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Prob10370 {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine().toString());
		
		while (n--!=0) {
			ArrayList<Double> list = new ArrayList<Double>();
			String[] lines = reader.readLine().toString().split(" ");
			double sum =0;
			for (int i = 1; i < lines.length; i++) {
				list.add(Double.parseDouble(lines[i]));
				sum+=Double.parseDouble(lines[i]);
			}
			double mean,count=0;
			mean=sum/list.size();
			for (Double d: list) {
				if (d>=mean) {
					count++;
				}
			}
			System.out.format("%.3f",(count/list.size()*100));
			System.out.println("%");
		}
	}
}
