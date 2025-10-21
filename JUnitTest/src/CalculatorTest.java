import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void twoPlusTwoEqualsFourTest(){
        Calculator cal = new Calculator();
        double actual = cal.add(2, 2);
        assertEquals(4, actual);
    }

    @Test
    public void twoPlusZeroEqualsTwoTest(){

        Calculator cal = new Calculator();
        double actual = cal.add(2, 0);
        assertEquals(2, actual);
    }


    @Test
    public void fourDivideTwoEqualsTwoTest(){
        Calculator cal = new Calculator();
        double actual = cal.divide(4, 2);
        assertEquals(2, actual);

    }

    @Test
    public void fourDivideZeroTest(){
        Calculator cal = new Calculator();
        //double actual = cal.divide(4, 0);
        assertThrows(ArithmeticException.class, () -> cal.divide(4, 0)); // executable

    }

}