import java.util.Arrays;

public class Encoding {
    Character[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H',
            'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
            'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X',
            'Y', 'Z'};

    public Character encryptCharacter(char character){
        int position = Arrays.asList(alphabet).indexOf(character);
        if(position +2 >= alphabet.length){
            position=Math.abs(alphabet.length -position-2);
        }else{
            position=  position+2;
        }
        return alphabet[position];
    }
    public Character encryptCharacterPlusTwentyThree(char character){
        int position = Arrays.asList(alphabet).indexOf(character);
        if(position +23 >= alphabet.length){
            position=Math.abs(alphabet.length -position-23);
        }else{
            position=  position+23;
        }
        return alphabet[position];
    }
    public Character encryptCharacterPlusTen(char character){
        int position = Arrays.asList(alphabet).indexOf(character);
        if(position +10 >= alphabet.length){
            position=Math.abs(alphabet.length -position-10);
        }else{
            position=  position+10;
        }
        return alphabet[position];
    }
    public String encryptWord(String word){
        char[] wordCharArray = word.toUpperCase().toCharArray();
        StringBuilder encryptedWord= new StringBuilder();
        for (char c : wordCharArray) {
            encryptedWord.append(encryptCharacter(c));
        }
        return encryptedWord.toString();
    }
    private int mkey;
    private String input;

    public int getMkey() {
        return mkey;
    }

    public String getInput() {
        return input;
    }

    public void setMkey(int mkey) {
        this.mkey = mkey;
    }

    public void setInput(String input) {
        this.input = input;
    }

}
