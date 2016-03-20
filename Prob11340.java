package uvaProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Prob11340 {

	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader((System.in)));

        int T = Integer.parseInt(reader.readLine());
        
        while (T-- > 0) {
        	Map<Character, Long> prices = new HashMap<Character, Long>();
        	
            int K = Integer.parseInt(reader.readLine());
            for (int k = 0; k < K; ++k) {
             	String line = reader.readLine().trim();
              	StringTokenizer stk = new StringTokenizer(line);

              	prices.put(stk.nextToken().charAt(0), Long.parseLong(stk.nextToken()));
            }
            long total = 0;
            int M = Integer.parseInt(reader.readLine());
            for (int k = 0; k < M; ++k) {
                String line = reader.readLine();
                
                for (char c : line.toCharArray())
                	if (prices.containsKey(c))
                		total += prices.get(c);
            }
            System.out.printf("%.2f$%n", (double)total / 100.0);
        }
        reader.close();
        System.exit(0);

    }

	

}
