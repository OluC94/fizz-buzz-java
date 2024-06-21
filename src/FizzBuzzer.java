public class FizzBuzzer {
    private int sequenceNumber;

    public FizzBuzzer(){
        sequenceNumber = 1;
    }

    private boolean isMultipleOf(int num){
        return sequenceNumber % num == 0;
    }

    private String generateFizzBuzz(){
        if (isMultipleOf(3) && isMultipleOf(5)) return "FizzBuzz";
        if (isMultipleOf(3)) return "Fizz";
        if (isMultipleOf(5)) return "Buzz";
        return String.valueOf(sequenceNumber);
    }

    public String next(){
        String fizzBuzzOutput = generateFizzBuzz();
        sequenceNumber++;
        return fizzBuzzOutput;
    }

    public void reset(){
        this.sequenceNumber = 1;
    }
}
