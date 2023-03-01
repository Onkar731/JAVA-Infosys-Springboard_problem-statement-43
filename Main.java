import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // accepting input from the user
        String inputData = sc.nextLine();

        // extracting values from the given data
        List<String> dataValues = Arrays.stream(inputData.split(",")).collect(Collectors.toList());

        String data = dataValues.get(0);
        int key = Integer.parseInt(dataValues.get(1));

        // encrypting using encryptData() method of EncryptionDecryption class
        String encryptedData = EncryptionDecryption.encryptData(data, key);

        // decrypting using decryptingData() method of EncryptionDecryption class
        String decryptedData = EncryptionDecryption.decryptData(encryptedData, key);

        // printing encrypted and decrypted data
        System.out.println(encryptedData + "," + decryptedData);

        // closing resource
        sc.close();
    }
}