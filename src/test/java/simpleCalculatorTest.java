import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class simpleCalculatorTest {

    @Test
    void Addition() {
        //assertEquals(4,simpleCalculator.Addition(2,2));
        //assertEquals(15,simpleCalculator.Addition(5,4));
    }
    @Test
    void Multiple(){
        //assertEquals(20,simpleCalculator.Multiple(10,2));
        assertEquals(15,simpleCalculator.Multiple(5,3));
    }

}
