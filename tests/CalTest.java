import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalTest {

    Cal cal;

    @BeforeEach
    void setUp() {
        this.cal = new Cal(1, 2);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("Check if 1 + 2 = 3")
    void add() {
        assertEquals(3, this.cal.add(), "We are not geting 3");
    }

    @Test
    void multiply() {
    }

    @Test
    void diff() {
    }
}