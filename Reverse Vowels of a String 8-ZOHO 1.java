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
        char[] ch=s.toLowerCase().toCharArray();
        String vowel="aeiou";
        int i=0;
        int j=ch.length-1;
        while(i<j){
            if(!vowel.contains(String.valueOf(ch[i]))){
                i++;
            }
            else if(!vowel.contains(String.valueOf(ch[j]))){
                j--;
            }
            else{
                char temp=ch[i];
                ch[i]=ch[j];
                ch[j]=temp;
                i++;
                j--;
            }
        }
        for(char c:ch){
            System.out.print(c);
        }
        
    }
}
