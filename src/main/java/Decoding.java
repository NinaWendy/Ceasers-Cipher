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
}

