import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrimeFactorsTest {

    PrimeFactor primeFactor;

    @BeforeEach
    public void setUp() {
        primeFactor = new PrimeFactor();
    }

    @Test
    void testPrimeFactorOf1() {
        assertEquals(Arrays.asList(), primeFactor.of(1));
    }
    @Test
    void testPrimeFactorOf2() {
        assertEquals(Arrays.asList(2), primeFactor.of(2));
    }


}
