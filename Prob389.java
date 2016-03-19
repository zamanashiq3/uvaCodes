package uvaProblems;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;



public class Prob389 {
    
	public static void main(String args[]) throws IOException{
        Scanner scanner = new Scanner(System.in);
        StringBuilder builder = new StringBuilder();
        while(scanner.hasNext()){
          String answer = scanner.next();
          int b1 = scanner.nextInt();
          int b2 = scanner.nextInt();
          BigInteger n = new BigInteger(answer,b1);
          answer = n.toString(b2);
          int len = answer.length();
          if( len > 7 ) builder.append("  ERROR" );
          else {
              for(int i = len ; i < 7 ; i++ ) builder.append(" ");
              builder.append(answer.toUpperCase());
          }
          builder.append("\n");
        }
        System.out.print(builder.toString());
        scanner.close();
        System.exit(0);
    }
}