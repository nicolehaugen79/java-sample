import org.junit.*;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class MyTest {

    @Test
    public void VerifyMethod1() {
        assertTrue(true);
    }

    @Test
    public void VerifyMethod2() {
        assertTrue(true);
        HelloWorldLib lib = new HelloWorldLib();
        String result = lib.Method2();
        assertEquals("Verified method2", result, "hello world");
    }

    @Test
    public void VerifyMethod3() {
        HelloWorldLib lib = new HelloWorldLib();
        boolean result = lib.Method3();
        assertTrue("Verified Method3", result);
    }

    @Test
    public void VerifyMethod4() {
        assertTrue(true);
    }

    @Test
    public void VerifyMethod5() {
        assertTrue(true);
    }
}