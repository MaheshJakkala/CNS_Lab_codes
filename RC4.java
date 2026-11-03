//-------------RC4 ----------------------------------------------

import java.util.*;
import javax.crypto.*;
import javax.crypto.spec.*;

public class RC4
{
	public static void main(String[] args) throws Exception
	{
		SecretKey key = new SecretKeySpec("mysecretkey".getBytes(),"RC4");
		
		String text = "Hello World";
		Cipher c = Cipher.getInstance("RC4");
		
		c.init(Cipher.ENCRYPT_MODE,key);
		byte[] enc = c.doFinal(text.getBytes());
		
		System.out.println("Original: "+text);
		System.out.println("Encrypted: "+Base64.getEncoder().encodeToString(enc));
		
		c.init(Cipher.DECRYPT_MODE,key);
		byte[] dec = c.doFinal(enc);
		
		System.out.println("Decrypted: "+new String(dec));
	}
}
		
