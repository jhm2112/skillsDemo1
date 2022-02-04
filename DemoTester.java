import static org.junit.Assert.*;
import org.junit.*;

public class DemoTester {
    Demo demo1 = new Demo();
    @Test
    public void multiply() {
        assertEquals(25, demo1.multiply(5,5));
    }
}
