package uvaProblems;

import java.io.IOException;
import java.util.Scanner;

public class Prob494 {
    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            int cnt = 0;
            int i = 0;
            while (i < line.length()) {
                if (Character.isLetter(line.charAt(i))) {
                    ++cnt;
                    while (Character.isLetter(line.charAt(i))) ++i;
                }
                ++i;
            }
            System.out.println(cnt);
        }
        scanner.close();
        System.exit(0);
    }
} 