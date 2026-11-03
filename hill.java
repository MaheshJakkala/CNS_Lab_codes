// =================== hill =================================
import java.util.*;

public class hill {
    public static void main(String[] args) throws Exception {
        
        // FIX 1: Correctly convert String literal to char array
        char[] s = "hai".toCharArray(); 
        
        // Encryption matrix (3x3)
        int[][] key = {
            {6, 24, 1},
            {13, 16, 10},
            {20, 17, 15}
        };
        
        // FIX 2: Modular inverse matrix of the encryption key (mod 26)
        int[][] inverse = {
            {8, 5, 10},
            {21, 8, 21},
            {21, 12, 8}
        };
        
        int[] p = new int[3];
        int[] c = new int[3];
        int[] d = new int[3];
        
        // Map characters to 0-25 numerical values
        for (int i = 0; i < 3; i++) {
            p[i] = (s[i] - 'a') % 26;
        }
        
        // --- ENCRYPTION ---
        System.out.print("Ciphertext: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // FIX 3: Matrix multiplication indexing: Row i of key * Column vector p
                c[i] += key[i][j] * p[j]; 
            }
            c[i] = (c[i] % 26 + 26) % 26; // Handle potential negative values safely
            System.out.print((char) (c[i] + 'a'));
        }
        System.out.println();
        
        // --- DECRYPTION ---
        System.out.print("Decrypted Plaintext: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // FIX 3: Matrix multiplication indexing: Row i of inverse * Column vector c
                d[i] += inverse[i][j] * c[j]; 
            }
            d[i] = (d[i] % 26 + 26) % 26; // Handle potential negative values safely
            System.out.print((char) (d[i] + 'a'));
        }
        System.out.println();
    }
}

