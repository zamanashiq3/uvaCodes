package uvaProblems;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;


public class Prob10038{
    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int[] seq = new int[n];
            int[] dif = new int[n - 1];

            for (int i = 0; i < n; ++i)
                seq[i] = scanner.nextInt();

            for (int i = 0; i < n - 1; ++i)
                dif[i] = Math.abs(seq[i + 1] - seq[i]);
            Arrays.sort(dif);

            boolean valid = true;
            for (int i = 0; i < n - 1 && valid; ++i)
                if (dif[i] != i + 1) valid = false;

            System.out.println((!valid ? "Not j" : "J") + "olly");
        }
        scanner.close();
        System.exit(0);
    }
}