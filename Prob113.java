package uvaProblems;

import java.io.IOException;
import java.util.Scanner;

public class Prob113 {

	public static void main(String[] args) throws IOException{
		Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            int n = Integer.parseInt(scanner.nextLine());
            Double p = Double.parseDouble(scanner.nextLine());
            Double k = Math.exp(Math.log(p) / n);
            System.out.println(Math.round(k));
        }
        
        scanner.close();
        System.exit(0);
	}

}
