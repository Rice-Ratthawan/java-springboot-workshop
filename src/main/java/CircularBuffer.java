public class CircularBuffer {

    private final int bufferSize;
    //string array name buffer
    private final String[] buffer;
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
