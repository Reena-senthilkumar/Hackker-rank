import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] e=new int[n];
        for(int i=0;i<n;i++){
            e[i]=sc.nextInt();
        }
        int[] l=new int[n];
        for(int i=0;i<n;i++){
            l[i]=sc.nextInt();
        }
        int sum=0; int ans=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            sum+=(e[i]-l[i]);
            ans=Math.max(sum,ans);
        }
        System.out.println("Maximum number of guests within "+n+" hours is "+ans);
        
    }
}
