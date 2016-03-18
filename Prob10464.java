package uvaProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Prob10464 {

	public static void main(String[] args) throws IOException{
        BufferedReader bufferReader=new BufferedReader(new InputStreamReader(System.in));
        StringBuffer stringBuffer = new StringBuffer("");
        int cases=Integer.parseInt(bufferReader.readLine());
        for(int i=0;i<cases;i++) {
            String[] lines=bufferReader.readLine().split(" ");
            BigDecimal a=new BigDecimal(lines[0]);
            a=a.add(new BigDecimal(lines[1]));
            StringBuilder temp=new StringBuilder(a.toString());
            stringBuffer.append(resizingString(temp)).append("\n");
        }
        System.out.print(stringBuffer);
    }
     static String resizingString(StringBuilder s){
         int index=s.length()-1;
         while(s.charAt(index)=='0' && s.charAt(index-1)!='.'){
             index--;
         }
        
        return s.substring(0,index+1);
    }
}


