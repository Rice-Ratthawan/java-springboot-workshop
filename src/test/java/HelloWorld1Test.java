import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

import static org.junit.Assert.*;

public class HelloWorld1Test {

    @Test
    public void sayHi_should_return_Hello_World_from_Method() {
        HelloWorld1 h = new HelloWorld1();
        String result = h.sayHi();
        assertEquals("Hello World from Method", result);
    }

    @Test
    public void sayHi_with_ratthawan_should_return_Hello_Ratthawan() {
        HelloWorld1 h = new HelloWorld1();
        String result = h.sayHi("ratthawan");
        assertEquals("Hello Ratthawan", result);
    }

    @Test
    public void sayHi_with_rice_should_return_Hello_Rice() {
        HelloWorld1 h = new HelloWorld1();
        String result = h.sayHi("rice");
        assertEquals("Hello Rice", result);
    }
}