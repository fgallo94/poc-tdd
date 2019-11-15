package numbers;

import java.util.Objects;

public class BiggerAndSmaller {

    private int bigger = Integer.MIN_VALUE;
    private int smaller = Integer.MAX_VALUE;

    public void find(int[] numbers) {
        if (Objects.nonNull(numbers) && numbers.length > 0) {
            for (int n : numbers) {
                if (n > bigger) {
                    bigger = n;
                }
                if (n < smaller) {
                    smaller = n;
                }
            }
        } else {
            bigger = 0;
            smaller = 0;
        }
    }

    public int getBigger() {
        return bigger;
    }

    public int getSmaller() {
        return smaller;
    }
}
