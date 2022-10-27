package ecEgovBoot;

import egovframework.let.utl.sim.service.EgovFileScrty;

public class EgovEncryptTest {

	public static void main(String[] args) throws Exception{
		String src = "1";
		String salt = "admin";
		
		String enc = EgovFileScrty.encryptPassword(src, salt);
		
		System.out.println(enc);
	}

}
