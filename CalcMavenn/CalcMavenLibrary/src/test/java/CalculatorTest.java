import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {
    private final double eps = 1e-9;
    private static Calculator calc;
    @BeforeClass                            //создаем объект для всех тестов
    public static void createCalc(){        // можно взять аннотацию @Before, тогда объект будет создаваться перед
        calc = new Calculator(4,2);   //каждым тестом
    }
    @Test
    public void shouldReturn6Add(){
        Assert.assertEquals(6,calc.add(),eps);
    }
    @Test
    public void shouldReturn2Sub(){
        Assert.assertEquals(2,calc.sub(),eps);
    }
    @Test
    public void shouldReturn8Mult(){
        Assert.assertEquals(8,calc.mult(),eps);
    }
    @Test
    public void shouldReturn2Div(){
        Assert.assertEquals(2,calc.div(),eps);
    }

}
