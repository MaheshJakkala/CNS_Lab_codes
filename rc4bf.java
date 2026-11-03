import java.util.*;
import java.io.*;
import javax.crypto.*;
import java.security.*;

public class rc4bf
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter password: ");
        char[] pass = sc.nextLine().toCharArray();
        
        KeyStore ks = KeyStore.getInstance("JCEKS");
		ks.load(new FileInputStream("blowfish.jceks"),pass);
		
		SecretKey key = (SecretKey)ks.getKey("blowfishkey",pass);
		
		String text = "Hello Worlld";
		Cipher c = Cipher.getInstance("Blowfish");
		
		c.init(Cipher.ENCRYPT_MODE,key);
		byte[] enc = c.doFinal(text.getBytes());
		
		System.out.println("Encrypted: "+Base64.getEncoder().encodeToString(enc));
		
		c.init(Cipher.DECRYPT_MODE,key);
		byte[] dec = c.doFinal(enc);
		
		System.out.println("Decrypted: "+new String(dec));
		
	}
}
