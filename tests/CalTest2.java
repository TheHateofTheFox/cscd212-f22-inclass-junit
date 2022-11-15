import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalTest2 {

    Cal cal;

    @BeforeEach
    void setUp() {
        System.out.println("Before OUT");
        this.cal = new Cal(1.0/3.0, 1.0/3.0);
    }

    @Test
    void add() {
        System.out.println("add out");
        assertEquals(0,
                Double.compare(2.0/3.0, this.cal.add()));
    }

    @Nested
    class hello {
        @BeforeEach
        void setUp2() {
            System.out.println("Before IN");
        }

        @Test
        void ex() {
            System.out.println("EX IN");
        }
    }
}