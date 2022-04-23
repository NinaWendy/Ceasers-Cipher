import java.util.Arrays;

public class Decoding {
    Character[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H',
            'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
            'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X',
            'Y', 'Z'};

    public Character diciperCharacterMinusTwentyThree(char c) {
        int position = Arrays.asList(alphabet).indexOf(c);
        int deShiftKey;
        int shiftKey=23;

        if (position-shiftKey < 0){
            deShiftKey= position-shiftKey;
            position=alphabet.length+deShiftKey;
        }else{
            position=position-shiftKey;
        }
        return alphabet[position];
    }
    public Character diciperCharacterMinusTwo(char c) {
        int position = Arrays.asList(alphabet).indexOf(c);
        int deShiftKey;
        int shiftKey=2;

        if (position-shiftKey < 0){
            deShiftKey= position-shiftKey;
            position=alphabet.length+deShiftKey;
        }else{
            position=position-shiftKey;
        }
        return alphabet[position];
    }
    public Character diciperCharacterMinusFour(char c) {
        int position = Arrays.asList(alphabet).indexOf(c);
        int deShiftKey;
        int shiftKey=4;

        if (position-shiftKey < 0){
            deShiftKey= position-shiftKey;
            position=alphabet.length+deShiftKey;
        }else{
            position=position-shiftKey;
        }
        return alphabet[position];
    }
    public String dicipherWord(String word){
        char[] wordCharArray = word.toUpperCase().toCharArray();
        StringBuilder dicipherWord= new StringBuilder();
        for (char c : wordCharArray) {
            dicipherWord.append(diciperCharacterMinusTwentyThree(c));
        }
        return dicipherWord.toString();
    }
    public String dicipheredWord(String word){
        char[] wordCharArray = word.toUpperCase().toCharArray();
        StringBuilder dicipherWord= new StringBuilder();
        for (char c : wordCharArray) {
            dicipherWord.append(diciperCharacterMinusTwo(c));
        }
        return dicipherWord.toString();
    }
    private int shiftkey;
    private String encodedText;

    public int getShiftkey() {
        return shiftkey;
    }

    public void setShiftkey(int shiftkey) {
        this.shiftkey = shiftkey;
    }

    public String getEncodedText() {
        return encodedText;
    }

    public void setEncodedText(String encodedText) {
        this.encodedText = encodedText;
    }

    public Character characterDecryption(char c) {
        int position = Arrays.asList(alphabet).indexOf(c);
        int deShiftKey;
        int shiftKey = getShiftkey();

        if (position - shiftKey < 0) {
            deShiftKey = position - shiftKey;
            position = alphabet.length + deShiftKey;
        } else {
            position = position - shiftKey;
        }
        return alphabet[position];

    }

    public String wordDecryption(String encodedText) {
        char[] wordCharArray = encodedText.toUpperCase().toCharArray();
        StringBuilder decryptedWord = new StringBuilder();
        for (char c : wordCharArray) {
            if (Character.isLetter(c)) {
                decryptedWord.append(characterDecryption(c));
            } else {
                decryptedWord.append(c);
            }
        }
        return decryptedWord.toString();
    }
}

