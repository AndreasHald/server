import javax.xml.bind.ParseConversionEvent;

import config.Configurations;


public class encryption {

	public String decrypt(byte[] b)
	{
		Configurations CF = new Configurations();
		System.out.println(CF.getFfcryptkey());
		String crypKey = CF.getFfcryptkey();
		System.out.println(crypKey);
		double gladKo = Double.parseDouble(crypKey);
		byte ff = (byte) gladKo;
		for(int i = 0 ; i<b.length ; i++)
		{
			b[i] = (byte)(b[i]^ff);
		}
		String encrypted = new String(b).trim();
		return encrypted;
	}
	
	public String encrypt(byte[] b)
	{
		
	}
}
