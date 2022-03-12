package Test;
import money.Cards;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTypeTest {

    @Test
    public void testDetection() {
        assertEquals(Cards.VISA, Cards.check("4000056655665556"));
        assertEquals(Cards.VISA, Cards.check("4242424242424242"));

        assertEquals(Cards.AMERICAN_EXPRESS,  Cards.check("371449635398431"));
 
    }
}
