public class CircularBuffer {

    private int bufferSize = 10;
    //string array name buffer
    private String[] buffer;
    private int readPointer;
    private int writePointer;

    //Default constructure
    public CircularBuffer() {
        this.buffer = new String [10];
    }

    public boolean isEmpty() {
        //buffer should have 10 space
        return bufferSize == 10;
    }

    public void writeData(String input) {
        //receive input then decrease space
        bufferSize--;
        this.buffer[writePointer++] = input;
    }

    public boolean isFull() {
        //check from bufferSize if =0 so now it's full
        return bufferSize == 0;
    }

    public String readData() {
        return this.buffer[readPointer++];
    }

}
