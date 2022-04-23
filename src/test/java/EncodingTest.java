import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EncodingTest {
    @Test
    public void encryptedCharacter_returnsCharAtPlusTwoPosition() {
        Encoding encoding= new Encoding();
        Character expected = 'D';
        assertEquals(expected, encoding.encryptCharacter('B'));
    }
}
