//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static final FizzBuzzer myFizzBuzzer = new FizzBuzzer();
    static final BizzFuzzer myBizzFuzzer = new BizzFuzzer("Boop", "Schnoop", 2, 3);

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        System.out.println("FizzBuzz output");
        for (int i = 0; i < 19; i++) {
            System.out.println(myFizzBuzzer.next());
        }

        System.out.println("reset");
        myFizzBuzzer.reset();
        for (int i = 0; i < 5; i++) {
            System.out.println(myFizzBuzzer.next());
        }

        System.out.println("BizzFuzz output");
        for (int i = 0; i < 12; i++) {
            System.out.println(myBizzFuzzer.next());
        }

        System.out.println("reset");
        myBizzFuzzer.reset();
        for (int i = 0; i < 5; i++) {
            System.out.println(myBizzFuzzer.next());
        }


    }
}