import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner myEncryption = new Scanner(System.in);
        Encoding encoding=new Encoding();
        System.out.println("Enter text to encrypt:");
        String input = myEncryption.nextLine();
        encoding.setInput(input);

        System.out.println("Enter encryption key to use:");
        int key = myEncryption.nextInt();
        encoding.setMkey(key);
        System.out.println( "Plain Text:" + " " +encoding.getInput());
        System.out.println( "Encryption Key:" + " " +encoding.getMkey());
        System.out.println("Encrypted Text:"
                + " " +encoding.wordEncryption(input));

    }
}
