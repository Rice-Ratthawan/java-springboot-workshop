public class CircularBuffer {

    private int bufferSize = 10;
    //string array name buffer
    private String[] buffer;
    private int readPointer;
    private int writePointer;

    //Default constructure
    public CircularBuffer() {
        this(10);
    }
    //Overload constructure
    public CircularBuffer(int size) {
        this.bufferSize = size;
        this.buffer = new String[bufferSize];
    }

    public boolean isEmpty() {
        return readPointer == writePointer;
    }

    public void writeData(String input) {
        this.buffer[writePointer++] = input;
    }

    public boolean isFull() {
        return writePointer >= bufferSize;
    }

    public String readData() {
        return this.buffer[readPointer++];
    }
}
