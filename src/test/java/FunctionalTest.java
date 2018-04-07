import org.junit.Assert;
import org.junit.Test;

public class FunctionalTest {
    private static final double DELTA = 0.001;

    @Test
    public void testLinear() {
        Function function = new FunctionLinear(1, 0);
        Functional functional = new FunctionalIntegral(0, 2);
        Assert.assertEquals(functional.calculate(function), 3., DELTA);
        Assert.assertEquals(functional.definiteIntegral(function), 2., DELTA);
    }

    @Test
    public void testSquare() {
        FunctionSquare function = new FunctionSquare(1, 0);
        Functional functional = new FunctionalIntegral(1, 2);
        Assert.assertEquals(functional.calculate(function), 7.25, DELTA);
        Assert.assertEquals(functional.definiteIntegral(function), 2.3333, DELTA);
    }

    @Test
    public void testCos() {
        Function function = new FunctionCos();
        Functional functional = new FunctionalIntegral(0, Math.PI);
        Assert.assertEquals(functional.calculate(function), 0., DELTA);
        Assert.assertEquals(functional.definiteIntegral(function), 0., DELTA);
    }

}
