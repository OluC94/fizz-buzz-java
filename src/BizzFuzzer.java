public class BizzFuzzer {
    private int sequenceNumber;
    private final String firstWord;
    private final String secondWord;
    private final int firstNumber;
    private final int secondNumber;

    public BizzFuzzer(String firstWord, String secondWord, int firstNumber, int secondNumber){
        sequenceNumber = 1;
        this.firstWord = firstWord;
        this.secondWord = secondWord;
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    private boolean isMultipleOf(int num){
        return sequenceNumber % num == 0;
    }

    private String generateFizzBuzz(){
        if (isMultipleOf(firstNumber) && isMultipleOf(secondNumber)) return firstWord + secondWord;
        if (isMultipleOf(firstNumber)) return firstWord;
        if (isMultipleOf(secondNumber)) return secondWord;
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
