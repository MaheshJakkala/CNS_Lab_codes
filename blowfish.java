// ===================Blowfish =================================
import java.util.*;
import javax.crypto.*;
import javax.crypto.spec.*;

public class blowfish
{
	public static void main(String args[]) throws Exception
	{
		KeyGenerator kg = KeyGenerator.getInstance("Blowfish");
		kg.init(128);
		SecretKey key = kg.generateKey();
		
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
		
