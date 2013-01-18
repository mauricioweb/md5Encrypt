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
	
	@Test
	public void shouldEncryptMD5WithSpecifiedPasswords(){
		String data = "md5salt#um0v.p4ss#@c3ntu4��o";
		String encrypted  = "856dceaf0adb371141a669c79f09db24";
		assertEquals( encrypted, DigestUtils.md5Hex(data));
	}

}
