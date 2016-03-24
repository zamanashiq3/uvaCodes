package uvaProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Prob12250 {

	public static void main(String[] args) throws IOException{
		int t =1;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line = new String();
		Map<String, String> laguageMap = new HashMap<String, String>();
		laguageMap.put("HELLO", "ENGLISH");
		laguageMap.put("HOLA", "SPANISH");
		laguageMap.put("HALLO", "GERMAN");
		laguageMap.put("BONJOUR", "FRENCH");
		laguageMap.put("CIAO", "ITALIAN");
		laguageMap.put("ZDRAVSTVUJTE", "RUSSIAN");
		while (!(line=reader.readLine().toString()).equals("#")) {
			System.out.println("Case " + t + ": " + (laguageMap.containsKey(line) ? laguageMap.get(line) : "UNKNOWN"));
			++t;
		}

	}

}
