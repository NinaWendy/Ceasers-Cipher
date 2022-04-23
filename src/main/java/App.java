import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner myEncryption = new Scanner(System.in);
        Decoding decoding=new Decoding();

        System.out.println("Enter text to decrypt:");
        String encodedText = myEncryption.nextLine();
        decoding.setEncodedText(encodedText);

        System.out.println("Enter key used to encrypt:");
        int shiftKey = myEncryption.nextInt();
        decoding.setShiftkey(shiftKey);

        System.out.println( "Input:" + " " +decoding.getEncodedText());
        System.out.println( "Encryption Key:" + " " +decoding.getShiftkey());
        System.out.println("Encrypted text:"
                + " " +decoding.wordDecryption(encodedText));
    }
}
