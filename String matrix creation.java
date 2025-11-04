import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) throws IOException{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
        String s=sc.readLine();
        int n=Integer.parseInt(sc.readLine());
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray()){
            sb.append(ch);
        }
        if(sb.length()%n!=0) 
        {
            for(int i=0;i<n-sb.length()%2;i++){
            sb.append("-");
        }
        }
        for(int i=0;i<=sb.length()-n;i=i+n){
            for(int j=i;j<i+n;j++){
                System.out.print(sb.charAt(j)+" ");
            }
            System.out.println();
        }        
    }
}
