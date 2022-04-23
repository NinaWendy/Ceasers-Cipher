import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecodingTest {
    @Test
    public void dicipheredCharacter_returnsPlainCharacterAtMinusTwo() {
        Decoding decoding=new Decoding();
        Character expected ='A';
        assertEquals(expected, decoding.diciperCharacterMinusTwo('C'));
    }
    @Test
    public void dicipheredCharacter_returnsPlainCharacterAtMinusTwentyThree() {
        Decoding decoding=new Decoding();
        Character expected ='T';
        assertEquals(expected, decoding.diciperCharacterMinusTwentyThree('Q'));
    }
    @Test
    public void dicipheredCharacter_returnsPlainCharacterAtMinusFour() {
        Decoding decoding=new Decoding();
        Character expected ='X';
        assertEquals(expected, decoding.diciperCharacterMinusFour('B'));
    }
    @Test
    public void dicipherWord_returnsOriginalWord_BOY() {
        Decoding decoding=new Decoding();
        String expected="BOY";
        assertEquals(expected, decoding.dicipheredWord("DQA"));
    }
    @Test
    public void dicipherWord_returnsOriginalWord_QUICK() {
        Decoding decoding=new Decoding();
        String expected="QUICK";
        assertEquals(expected, decoding.dicipherWord("NRFZH"));
    }
}
