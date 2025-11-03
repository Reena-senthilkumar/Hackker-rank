import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine(); 
        int k=sc.nextInt();
        int i=0;
        int j=s.length()-k;
        char ch[]=s.toCharArray();
        while(i!=k && j!=s.length()){
            char temp=ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
            i++;
            j++;
        }
        for(char c:ch){
            System.out.print(c);
        }
    }
}
