// =================== Ceaser Cipher =================================
import java.util.*;

public class caesar {
    public static void main(String[] args) {
        String s = "hello";
        int key = 3;
        
        System.out.print("Encrypted: ");
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isUpperCase(c)) {
                char encrypted = (char) ((c - 'A' + key) % 26 + 'A');
                System.out.print(encrypted);
            } else if (Character.isLowerCase(c)) {
                char encrypted = (char) ((c - 'a' + key) % 26 + 'a');
                System.out.print(encrypted);
            }
        }
        
        System.out.println();
        System.out.print("Decrypted: ");
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isUpperCase(c)) {
                char decrypted = (char) ((c - 'A' - key + 26) % 26 + 'A');
                System.out.print(decrypted);
            } else if (Character.isLowerCase(c)) {
                char decrypted = (char) ((c - 'a' - key + 26) % 26 + 'a');
                System.out.print(decrypted);
            }
        }
        System.out.println();
    }
}

