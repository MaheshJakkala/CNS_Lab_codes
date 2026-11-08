//================= MD5============================
import java.security.*;
import java.util.*;

public class md5 {
    public static void main(String args[]) throws Exception 
    {
        String text = "Hii Rgukt"; 
         
        MessageDigest md = MessageDigest.getInstance("MD5"); 
        byte[] hash = md.digest(text.getBytes()); 
        
        // 4. Properly format bytes to a hexadecimal string
        String hex = "";
        for (byte b : hash)
            hex+=String.format("%02x", b);// Converts each byte to a 2-digit hex string and appends it
         
        System.out.println("Input: " + text);
        System.out.println("MessageDigest: " + hex);
    }
}

