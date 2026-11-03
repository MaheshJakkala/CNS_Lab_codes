// =================== RSA =================================
// import javax.crypto.*;
// import java.util.*;
// import java.security.*;

// public class rsa
// {
// 	public static void main(String args[]) throws Exception
// 	{
// 		KeyPairGenerator kg = KeyPairGenerator.getInstance("RSA");
// 		kg.initialize(2048);
// 		KeyPair kp = kg.generateKeyPair();
		
// 		String text = "Hello world";
// 		Cipher c = Cipher.getInstance("RSA");
		
// 		c.init(Cipher.ENCRYPT_MODE,kp.getPublic());
// 		byte[] enc = c.doFinal(text.getBytes());
		
// 		System.out.println("Encrypted: "+Base64.getEncoder().encodeToString(enc));
		
// 		c.init(Cipher.DECRYPT_MODE,kp.getPrivate());
// 		byte[] dec = c.doFinal(enc);
		
// 		System.out.println("Decrypted: "+new String(dec));
// 	}
// }


// RSA using BigInteger
import java.math.BigInteger;
import java.util.*;

class RSA {
    public static void main(String[] args) {
        BigInteger p = BigInteger.valueOf(3);
        BigInteger q = BigInteger.valueOf(11);

        BigInteger n = p.multiply(q);
        BigInteger phi = p.subtract(BigInteger.ONE)
                          .multiply(q.subtract(BigInteger.ONE));

        BigInteger e = BigInteger.valueOf(3);
        BigInteger d = e.modInverse(phi);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        BigInteger msg = sc.nextBigInteger();

        BigInteger enc = msg.modPow(e, n);
        BigInteger dec = enc.modPow(d, n);

        System.out.println("Encrypted: " + enc);
        System.out.println("Decrypted: " + dec);
    }
}

