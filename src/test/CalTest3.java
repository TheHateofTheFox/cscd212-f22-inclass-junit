import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalTest3
{
    Cal cal;

    @BeforeEach
    void setUp()
    {
        this.cal = new Cal(1,2);
    }

    @Test
    void notNull()
    {
        Throwable throwable = assertThrows(IllegalArgumentException.class, () ->{
            this.cal.notNull(null);}, "did not throw");

        assertEquals("Bad Args", throwable.getMessage());
    }

}
