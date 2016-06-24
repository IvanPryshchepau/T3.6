import org.testng.annotations.DataProvider;

import static org.testng.Assert.*;

/**
 * Created by ivanpryshchepau on 6/23/16.
 */
public class _RunnerTest {

    @DataProvider(name = "data")
    public static Object[][] data() {
        return new Object[][]{
                {1,2,3,4.0},
                {1,-2,3,1.0},
        };
    }

    @org.testng.annotations.Test(dataProvider = "data")
    public void testCalculate(Object a,Object b,Object c, double result) throws Exception {
        assertEquals(_Runner.calculate(new String[]{String.valueOf(a), String.valueOf(b), String.valueOf(c)}), result);
    }

}