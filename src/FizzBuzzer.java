public class FizzBuzzer {
    private int sequenceNumber;

    public FizzBuzzer(){
        sequenceNumber = 1;
    }

    public int next(){
        return this.sequenceNumber++;
    }
}
