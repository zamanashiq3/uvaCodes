package uvaProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Prob11356 {

	public static void main(String[] args) throws IOException, ParseException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String[] months = {"January", "February", "March", "April", "May", "June", "July", "August",
				"September", "October", "November", "December"};
		
		int T = Integer.parseInt(reader.readLine());
		for (int t = 1; t <= T; ++t) {
			String line = reader.readLine();
			int K = Integer.parseInt(reader.readLine());
			
			int m = 0;
			String[] parts = line.split("[-]");
			for (int i = 0; i < 12; ++i)
				if (months[i].equals(parts[1])) {
					m = i + 1;
					break;
				}
			
			String date = parts[0] + "-" + String.format("%02d", m) + "-" + parts[2];
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			c.setTime(sdf.parse(date));
			c.add(Calendar.DATE, K);
			String newDate = sdf.format(c.getTime());
			
			parts = newDate.split("[-]");
			String ans = parts[0] + "-" + months[Integer.parseInt(parts[1]) - 1] + "-" + parts[2];
			
			System.out.println("Case " + t + ": " + ans);
		}
		
		System.exit(0);
	}


}
