package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        String res = "";
        while (number > 0) {
            res += number % 10;
            number /= 10;
        }
        System.out.println(res);
    }


}
