import java.lang.reflect.Array;

public class Calculator {
    public int Add(String s) {


        if (s.equalsIgnoreCase("")) {
            return 0;
        }
        String[] numbers = s.split(",");

        int result = 0;

        for (int num = 0; num < numbers.length ; num++) {
            result += Integer.parseInt(numbers[num]);
        }

        return result;
    }

    //Split string, parse and sum each string/int
}
