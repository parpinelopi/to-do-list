package test;

import org.junit.Test;
import java.util.Date;
import static org.junit.Assert.assertEquals;

public class DateInputTest {

    @Test
    public void dateIsValid() {
        Date date = new Date (2020, 2, 9);
        assertEquals("09/02/2020", date.toString());


    }
}
