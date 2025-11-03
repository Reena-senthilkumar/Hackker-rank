import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase().replaceAll("\\s", "");
        
        int[] frequency = new int[26];
        for (char ch : s.toCharArray()) {
            if(ch>='a' && ch<='z')
                frequency[ch - 'a']++;
        }
        
        for (int i = 0; i < 26; i++) {
            if (frequency[i] == 0) {
                System.out.print("Not Pangrams");
                return;
            }
        }
        System.out.print("Pangrams");
    }
}
