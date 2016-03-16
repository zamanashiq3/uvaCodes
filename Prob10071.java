package uvaProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Prob10071 {
	public static void main(String[] args) throws IOException,Exception{
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		Scanner scanner = new Scanner(System.in);
		String line = new String();
		while ((line=bufferedReader.readLine()) != null) { 
			String[] uv = line.split(" ");
			long u = Long.parseLong(uv[0]);
			long v = Long.parseLong(uv[1]);
			System.out.println(2*u*v);
		}
	}
}
