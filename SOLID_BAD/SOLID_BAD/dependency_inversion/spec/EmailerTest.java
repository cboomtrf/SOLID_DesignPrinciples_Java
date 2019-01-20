import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author CBoom (cboom.trf@gmail.com)
 */
public class EmailerTest {
    @Test
    public void testGeneratesAlertString() {
        Emailer emailer = new Emailer();
        assertEquals("It is sunny", emailer.generateWeatherAlert("sunny"));
    }
}
