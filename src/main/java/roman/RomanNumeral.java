package roman;

import java.util.HashMap;
import java.util.Map;

public class RomanNumeral {

    private Map<Character, Integer> romanNumbers;

    public RomanNumeral() {
        romanNumbers = new HashMap<Character, Integer>();
        romanNumbers.put('I', 1);
        romanNumbers.put('V', 5);
        romanNumbers.put('X', 10);
        romanNumbers.put('L', 50);
        romanNumbers.put('C', 100);
    }

    public int convertRoman(String characters) {
        int accumulatedValue = 0;
        for (int index = 0; index < characters.length(); index++) {
            int actual = romanNumbers.get(characters.charAt(index));
            if (index < (characters.length() - 1)) {
                int after = romanNumbers.get(characters.charAt(index + 1));
                if (after > actual) {
                    actual *= -1;
                }
            }
            accumulatedValue += actual;
        }
        return accumulatedValue;
    }
}
