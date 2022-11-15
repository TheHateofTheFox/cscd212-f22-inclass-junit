import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalTest {

    Cal cal;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        this.cal = new Cal(1.0/3.0,1.0/3.0);
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void add() {
        assertEquals(0,Double.compare(2.0/3.0, this.cal.add()), "we gotnot get 3");
    }

    @org.junit.jupiter.api.Test
    void multiply() {
    }

    @org.junit.jupiter.api.Test
    void diff() {
    }

    @Nested
    class hello
    {
        @BeforeEach
        void setUp2()
        {

        }
        @Test
        void ex()
        {

        }
    }
}