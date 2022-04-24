import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner myEncryption = new Scanner(System.in);
        Encoding encoding= new Encoding();
        Decoding decoding= new Decoding();

        System.out.println("Enter text");
        String input = myEncryption.nextLine();
        encoding.setInput(input);

        System.out.println("Enter key");
        int key = myEncryption.nextInt();
        encoding.setMkey(key);
        decoding.setShiftkey(key);

        System.out.println( "Plain Text:" + " " +encoding.getInput());
        System.out.println( "Encryption Key:" + " " +encoding.getMkey());
        System.out.println("Encrypted Text:"
                + " " +encoding.wordEncryption(input));

        String encodedText= encoding.wordEncryption(input);
        decoding.setEncodedText(encodedText);
        System.out.println("Decrypted Text:"
                + " " +decoding.wordDecryption(encodedText));

    }
}
