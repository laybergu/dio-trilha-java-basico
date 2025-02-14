import java.util.Scanner;

public class Counter {
    public static void main(String[] args) throws Exception {

        Scanner terminal = new Scanner(System.in);

        System.out.print("Type the first parameter: ");

        int firsParam = terminal.nextInt();

        System.out.print("Type the second parameter: ");

        int secParam = terminal.nextInt();

        try {
            counter(firsParam, secParam);

        } catch (InvalidParamsException e) {

            System.out.println("The second param must be bigger than the first one.");
        }
    }

    static void counter(int firstVal, int finalVal) throws InvalidParamsException {
        boolean isException = firstVal > finalVal ? true : false;

        if (isException)
            throw new InvalidParamsException();

        int diference = finalVal - firstVal;

        for (int i = 0; i <= diference; i++) {
            System.out.println("Printing number " + i);
        }
    }
}
