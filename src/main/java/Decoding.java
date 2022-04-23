import java.util.Arrays;

public class Decoding {
    Character[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H',
            'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
            'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X',
            'Y', 'Z'};

    public Character diciperCharacter(char c) {
        int position = Arrays.asList(alphabet).indexOf(c);
        if(position -2 >= alphabet.length){
            position=Math.abs(alphabet.length -position+2);
        }else{
            position=  position-2;
        }
        return alphabet[position];
    }
}
