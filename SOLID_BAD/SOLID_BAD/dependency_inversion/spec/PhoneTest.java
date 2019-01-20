import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author CBoom (cboom.trf@gmail.com)
 */
public class PhoneTest {
    @Test
    public void testGeneratesAlertString() {
        MobileDevice phone = new MobileDevice();
        assertEquals("It is rainy", phone.generateWeatherAlert("rainy"));
    }
}
