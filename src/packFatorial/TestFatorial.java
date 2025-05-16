package packFatorial;

import static org.junit.Assert.*;

import org.junit.Test;

import src.packFatorial.CalculoFatorial;
import src.packFatorial.IllegalArgumentException;

public class TestFatorial {
    @Test
    public void factorialOfZeroIsOne() {
        assertEquals(1, CalculoFatorial.factorial(0));
    }

    @Test
    public void factorialOfOneIsOne() {
        assertEquals(1, CalculoFatorial.factorial(1));
    }

    @Test
    public void factorialOfFiveIs120() {
        assertEquals(120, CalculoFatorial.factorial(5));
    }

    @Test
    public void negativeInputThrows() {
        assertThrows(IllegalArgumentException.class, () -> CalculoFatorial.factorial(-1));
    }

    @Test
    public void largeInputThrows() {
        assertThrows(IllegalArgumentException.class, () -> CalculoFatorial.factorial(21));
    }
}
