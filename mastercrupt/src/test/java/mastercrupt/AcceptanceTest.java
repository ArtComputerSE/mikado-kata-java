package mastercrupt;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import ui.UI;

public class AcceptanceTest {
    @Test
    public void testLeeting() throws Exception {
        UI ui = new UI(new Application());
        assertEquals("Leeted: S3cr3t", ui.leetMessage("Secret"));
    }
}