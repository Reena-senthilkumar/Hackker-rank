import java.io.*;
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        if (str == null) {
            System.out.println("Your Password is Invalid");
            return;
        }
        if (str.length() < 4) {
            System.out.println("Your Password is Invalid");
            return;
        }
        if (Character.isDigit(str.charAt(0))) {
            System.out.println("Your Password is Invalid");
            return;
        }
        boolean hasUpper = false;
        boolean hasDigit = false;
        for (char ch : str.toCharArray()) {
            if (ch == ' ' || ch == '/') {
                System.out.println("Your Password is Invalid");
                return;
            }
            if (Character.isUpperCase(ch)) hasUpper = true;
            if (Character.isDigit(ch)) hasDigit = true;
        }
        if (hasUpper && hasDigit)
            System.out.println("Your Password is Valid");
        else
            System.out.println("Your Password is Invalid");
    }
}
