import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
        String s=sc.readLine();
        int n=Integer.parseInt(sc.readLine());
        int result=0;
        for(int i=0;i<=s.length()-n;i=i+n){
            int count=0;
            for(int j=i;j<i+n;j++){
                if(s.charAt(j)=='a')
                count++;
            }
            // System.out.println ();
            result=Math.max(count,result);
        }
        System.out.print (result);
    }
}
