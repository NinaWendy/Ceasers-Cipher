import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecodingTest {
    @Test
    public void dicipheredCharacter_returnsPlainCharacterAtMinusTwo() {
        Decoding decoding=new Decoding();
        Character expected ='A';
        assertEquals(expected, decoding.diciperCharacter('C'));
    }
}
