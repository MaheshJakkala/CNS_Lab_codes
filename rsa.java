// =================== RSA =================================
import javax.crypto.*;
import java.util.*;
import java.security.*;

public class rsa
{
	public static void main(String args[]) throws Exception
	{
		KeyPairGenerator kg = KeyPairGenerator.getInstance("RSA");
		kg.initialize(2048);
		KeyPair kp = kg.generateKeyPair();
		
		String text = "Hello world";
		Cipher c = Cipher.getInstance("RSA");
		
		c.init(Cipher.ENCRYPT_MODE,kp.getPublic());
		byte[] enc = c.doFinal(text.getBytes());
		
		System.out.println("Encrypted: "+Base64.getEncoder().encodeToString(enc));
		
		c.init(Cipher.DECRYPT_MODE,kp.getPrivate());
		byte[] dec = c.doFinal(enc);
		
		System.out.println("Decrypted: "+new String(dec));
	}
}

