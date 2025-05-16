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
}
