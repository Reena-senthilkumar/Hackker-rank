import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        int[] frequency1=new int[26];
        for(char ch:s1.toLowerCase().toCharArray()){
            frequency1[ch-'a']++;
        }
        int[] frequency2=new int[26];
        for(char ch:s2.toLowerCase().toCharArray()){
            frequency2[ch-'a']++;
        }
        for(int i=0;i<26;i++){
            if(frequency1[i]!=frequency2[i]){
                System.out.print(s1+" and "+s2+" are Not Anagrams."); return;
            }
        }
        System.out.print(s1+" and "+s2+" are Anagrams.");
        
    }
}
