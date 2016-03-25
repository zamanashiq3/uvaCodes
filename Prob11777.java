package uvaProblems;

import java.io.IOException;
import java.util.Scanner;

public class Prob11777 {

	public static void main(String[] args) throws IOException{
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		int caseNo =1;
		while (T--!=0) {
			int[] nums = new int[7];
			for (int i = 0; i <= nums.length-1; i++) {
				nums[i] = scanner.nextInt();
			}
			 int classTest1 = Math.max(Math.max(nums[4], nums[5]), nums[6]);  
	         int classTest2 = nums[4] + nums[5] + nums[6] - classTest1  - Math.min(Math.min(nums[4], nums[5]), nums[6]);  
	         double classTest = (classTest1 + classTest2) / 2.0;  
	  
			double sum = nums[0]+nums[1]+nums[2]+nums[3]+classTest;
			System.out.printf("Case %d: %c\n",caseNo,getLetterGrade(sum));
			caseNo++;
		}
		scanner.close();
		System.exit(0);
	}
	public static char getLetterGrade(double grade) {  
        if (grade >= 90)  
            return 'A';  
        if (grade >= 80)  
            return 'B';  
        if (grade >= 70)  
            return 'C';  
        if (grade >= 60)  
            return 'D';  
        else  
            return 'F';  
    }  

}
