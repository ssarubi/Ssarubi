package TechRegistNo;


//import com.tmax.jce.provider.JCEBlockCipher.ARIA;

public class CryptARIA {

	// 암호화(data, key)
	public static String encryptkey(String data,String key){
		try{
			/**
	         * 암호키 생성
	         */
			byte[] masterKey = new byte[32];
			masterKey = key.getBytes();
	        /**
	         * Aria 초기화
	         */
	        CryptoARIA aria256 = new CryptoARIA(masterKey);

	        /**
             * 복호화
             */
            data = aria256.encrypt(data);
            
		}catch(Exception e){
			System.out.println("암호화 에러 : " +e);
		}

		return data;
	}

	// 복호화(data, key)
	public static String decryptkey(String data,String key){
		try{
			/**
	         * 암호키 생성
	         */
			byte[] masterKey = new byte[32];
			masterKey = key.getBytes();

	        /**
	         * Aria 초기화
	         */
	        CryptoARIA aria256 = new CryptoARIA(masterKey);

	        /**
             * 복호화
             */
            data = aria256.decrypt(data);

		}catch(Exception e){
			System.out.println("복호화 에러 : " +e);
		}

		return data;
	}

}
