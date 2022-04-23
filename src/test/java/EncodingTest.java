import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EncodingTest {
    @Test
    public void encryptedCharacter_returnsCharAtPlusTwoPosition() {
        Encoding encoding= new Encoding();
        Character expected = 'D';
        assertEquals(expected, encoding.encryptCharacter('B'));
    }
    @Test
    public void encryptedCharacter_returnsCharAtPlusTwentyThreePosition() {
        Encoding encoding= new Encoding();
        Character expected = 'E';
        assertEquals(expected, encoding.encryptCharacterPlusTwentyThree('H'));
    }
    @Test
    public void encryptedCharacter_returnsCharAtPlusTenPosition() {
        Encoding encoding= new Encoding();
        Character expected = 'Y';
        assertEquals(expected, encoding.encryptCharacterPlusTen('O'));
    }
    @Test
    public void encryptedWord_returnEncryptedWordEachLetterAtPlusTwoPosition() {
        Encoding encoding= new Encoding();
        String expected ="DQA";
        assertEquals(expected, encoding.encryptWord("BOY"));
    }
}
