public class EncryptionDecryption {

    public static String encryptData(String data, int key) {
        StringBuilder encryptedData = new StringBuilder();
        String keyString = Integer.toString(key);
        // extracting digits
        // int firstDigit = key/100;
        // int secondDigit = (key/=10)%10;
        // int thirdDigit = key/10;
        int firstDigit=Integer.parseInt(String.valueOf(keyString.charAt(0)));
		int secondDigit=Integer.parseInt(String.valueOf(keyString.charAt(1)));
		int thirdDigit=Integer.parseInt(String.valueOf(keyString.charAt(2)));
		
		

        // encrypting data according to given encryption rules
        for(int len = 0; len < data.length(); len++) {
            char character = data.charAt(len);

            if(Character.isUpperCase(character)) {
                character -= firstDigit;
            } else if(Character.isLowerCase(character)) {
                character -= secondDigit;
            } else if(Character.isDigit(character)) {
                character -= thirdDigit;
            }

            encryptedData.append(character);
        }

        // returning encrypted data
        return encryptedData.toString();
    }

    public static String decryptData(String encryptData, int key) {
        StringBuilder decryptedData = new StringBuilder();
        String keyString = Integer.toString(key);
        // extracting digits
        // int firstDigit = key/100;
        // int secondDigit = (key/=10)%10;
        // int thirdDigit = key/10;
        int firstDigit=Integer.parseInt(String.valueOf(keyString.charAt(0)));
		int secondDigit=Integer.parseInt(String.valueOf(keyString.charAt(1)));
		int thirdDigit=Integer.parseInt(String.valueOf(keyString.charAt(2)));
		

        for(int len = 0; len < encryptData.length(); len++) {
            char character = encryptData.charAt(len);

            if(Character.isUpperCase(character+firstDigit)) {
                character += firstDigit;
            } else if(Character.isLowerCase(character+secondDigit)) {
                character += secondDigit;
            } else if(Character.isDigit(character+thirdDigit)) {
                character += thirdDigit;
            }

            decryptedData.append(character);
        }

        // returning decrypted data
        return decryptedData.toString();
    }
}