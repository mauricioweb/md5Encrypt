package br.com.trevisan.md5;

import static org.junit.Assert.*;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.apache.commons.codec.digest.DigestUtils;
import org.junit.Test;

public class md5Test {

	@Test
	public void shouldEncriptMD5() throws NoSuchAlgorithmException {
		String messageToEncrypt = "message";
		MessageDigest md5 = MessageDigest.getInstance("MD5");
		md5.update(messageToEncrypt.getBytes());
		
		System.out.println(md5.digest());
	}
	
	@Test
	public void shouldEncryptMD5WithCommonsCodec(){
		String data = "message";
		String encrypted  = "78e731027d8fd50ed642340b7c9a63b3";
		assertEquals( encrypted, DigestUtils.md5Hex(data));
	}

}
