// =================== DES =================================
import javax.crypto.*;
import javax.crypto.spec.*;
import java.util.*;

public class des
{
	public static void main(String[] args) throws Exception
	{
		KeyGenerator kg = KeyGenerator.getInstance("DES");
		kg.init(56);
		SecretKey key = kg.generateKey();
		
		String text = "Helloworld";
		Cipher c = Cipher.getInstance("DES");
		
		c.init(Cipher.ENCRYPT_MODE,key);
		byte[] enc = c.doFinal(text.getBytes());
		
		System.out.println("Original: "+text);
		System.out.println("Encrypted: "+Base64.getEncoder().encodeToString(enc));
		
		c.init(Cipher.DECRYPT_MODE,key);
		byte[] dec = c.doFinal(enc);
		
		System.out.println("Decrypted: "+new String(dec));
		
		}
}
		
