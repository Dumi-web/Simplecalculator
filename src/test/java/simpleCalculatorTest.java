import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class simpleCalculatorTest {

    @Test
    //this test, tests multiple integers with the aid of the Add method in producing a passed condition or failed condition based on the expected value set and the sum of integers.
    void Addition() {
        assertEquals(4,simpleCalculator.Add(2,2));
        assertEquals(15,simpleCalculator.Add(5,-5,-3,5));
        assertEquals(20,simpleCalculator.Add(5,5,5,5));
        assertEquals(15,simpleCalculator.Add(5,5));
        assertEquals(-60,simpleCalculator.Add(-10,-10,-10,-10,-10,-10));
    }
    @Test
        //this test, tests multiple integers with the aid of the Multiply method in producing a passed condition or failed condition based on the expected value set and the sum of integers.
    void Multiple(){
        assertEquals(20,simpleCalculator.Multiply(10,2));
        assertEquals(15,simpleCalculator.Multiply(5,5));
        assertEquals(40,simpleCalculator.Multiply(5,-5,6,4));
        assertEquals(100,simpleCalculator.Multiply(5,10,2));
        assertEquals(-10,simpleCalculator.Multiply(-5,2));
        assertEquals(-100000,simpleCalculator.Multiply(-10,10,10,10,10));
    }

}
