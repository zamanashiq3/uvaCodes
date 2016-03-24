package uvaProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob272 {
	public static void main(String[] args) throws IOException,Exception{
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String line = new String();
		boolean isStart = true;
		boolean isEnd = false;
		while ((line=bufferedReader.readLine()) != null) { 
			char[] chars = line.toCharArray();
			StringBuilder st = new StringBuilder();
			for(int i=0;i<chars.length;i++){
				if(chars[i]=='"'){
				
					if (isStart&&!isEnd) {
						chars[i]='`';
						st.append(chars[i]);
						st.append(chars[i]);
						isStart=false;
						isEnd = true;
					} else if(!isStart&&isEnd) {
						chars[i]='\'';
						st.append(chars[i]);
						st.append(chars[i]);
						isStart=true;
						isEnd=false;
					}
				
				}
				else{
					st.append(chars[i]);
				}
			}
			System.out.println(st);
		}
	}
}
