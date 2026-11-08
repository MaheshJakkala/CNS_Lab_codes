//======================= SHA-1==============================================
import java.util.*;
import java.security.*;

public class sha1 {
    public static void main(String args[]) throws Exception 
    {

        String text = "Hii Rgukt"; 

        MessageDigest md = MessageDigest.getInstance("SHA-1"); 
        byte[] hash = md.digest(text.getBytes());
        
        String hex ="";
        for (byte b : hash)
            hex+=String.format("%02x", b);// Converts each byte to a 2-digit hex string and appends it
        
        System.out.println("input: " + text);
        System.out.println("MessageDigest: " + hex);
    }
}

