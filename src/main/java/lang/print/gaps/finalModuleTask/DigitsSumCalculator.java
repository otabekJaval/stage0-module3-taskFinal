package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        int print = 0;
        while (number > 0) {
            print += number % 10;
            number = number / 10;
        }
        System.out.println(print);
    }


}
