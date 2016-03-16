package uvaProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Math;

public class Prob579 {
		public static void main(String[] args) throws IOException{
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			String line = new String();
			
			while (!(line=bufferedReader.readLine().toString()).equals("0:00")) {
				String[] minHrStrings = line.split(":");
				double hour = Long.parseLong(minHrStrings[0]);
				double min = Long.parseLong(minHrStrings[1]);
				
				System.out.format("%.3f",calculateAngle(hour, min));
				System.out.println();
			}
			
		}
		public static double calculateAngle(double hour,double min) {
			double thetaHour = 0.5*(60*hour+min);
			double thetaMin = 6*min;
			double theta =  Math.abs((thetaHour-thetaMin));
			return Math.min(theta, 360-theta);
		}
}
