package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        long reversedNum = 0;
        long input_long = number;

        while (input_long != 0) {
            reversedNum = reversedNum * 10 + input_long % 10;
            input_long = input_long / 10;
        }
        System.out.println(reversedNum);
    }

}
