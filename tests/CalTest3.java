import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalTest3 {

    Cal cal;

    @BeforeEach
    void setUp() {
        this.cal = new Cal(1, 3);
    }

    @Test
    void notNull() {
        Throwable throwable = assertThrows(IllegalArgumentException.class, () -> {
            this.cal.notNull(null);
        }, "Did not throw");
        assertEquals("Bad Args", throwable.getMessage());
    }
}