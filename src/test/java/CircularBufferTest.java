import org.junit.Test;

import static org.junit.Assert.*;

public class CircularBufferTest {

    CircularBuffer cb = new CircularBuffer();

    @Test
    public void create_new_buffer_with_size(){
        cb = new CircularBuffer(5);
        boolean result = cb.isEmpty();
        assertTrue("Buffer is NOT available",result);
    }

    @Test
    public void create_new_buffer_should_empty(){
        boolean result = cb.isEmpty();
        assertTrue("Buffer is NOT available",result);
    }

    @Test
    public void create_new_buffer_with_default_size_should_10() {
        for(int i=0; i<10; i++) {
            cb.writeData("A"+i);
        }
        boolean result = cb.isFull();
        assertTrue("Buffer is NOT FULL",result);
    }

    @Test
    public void write_A_B_to_buffer_should_read_A_B_from_buffer(){
        cb.writeData("A");
        cb.writeData("B");
        assertEquals("A",cb.readData());
        assertEquals("B",cb.readData());
    }

//    @Test
//    public void replace_A_to_B_when_buffer_is_full(){
//        for(int i=0; i<10; i++) {
//            cb.writeData("A"+i);
//            cb.readData();
//        }
//        cb.writeData("B");
//        assertEquals("B", cb.readData());
//    }

    @Test
    public void check_array_full(){
        for(int i=0; i<10; i++) {
            cb.writeData("A"+i);
        }
        boolean result = cb.isFull();
        assertTrue("Buffer is FULL",result);
    }

    @Test
    public void check_array_not_empty(){
        cb.writeData("A");
        cb.writeData("B");
        cb.writeData("C");
        boolean result = cb.isEmpty();
        assertFalse("Buffer is NOT EMPTY",result);
    }

}