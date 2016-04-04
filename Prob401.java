package uvaProblems;

import java.util.Scanner;

public class Prob401 {

	public static String reverse(String s) {
        String rev = "";
        int n = s.length();

        for (int i = n - 1; i >= 0; --i)
           rev += s.charAt(i);
        return rev;
    }

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	try {

            String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789";
            String mirror  = "A   3  HIL JM O   2TUVWXY51SE Z  8 ";

            while (scanner.hasNextLine()) {
                String str = scanner.nextLine().trim();
                boolean isPal = false;
                boolean isMir = false;

                if (str.equals(reverse(str))) isPal = true;

                String mir = "";
                for (int i = 0; i < str.length(); ++i)
                    for (int j = 0; j < mirror.length(); ++j)
                        if (str.charAt(i) == letters.charAt(j)) {
                            mir += mirror.charAt(j);
                            break;
                        }

                if (str.equals(reverse(mir))) isMir = true;

                System.out.print(str);
                if (!isPal && !isMir) System.out.println(" -- is not a palindrome.");
                if (isPal && !isMir) System.out.println(" -- is a regular palindrome.");
                if (!isPal && isMir) System.out.println(" -- is a mirrored string.");
                if (isPal && isMir)  System.out.println(" -- is a mirrored palindrome.");
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
        finally{
        	scanner.close();
        	System.exit(0);
        }
    }
}
