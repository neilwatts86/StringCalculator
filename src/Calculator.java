import java.lang.reflect.Array;

public class Calculator {
    public int Add(String s) {

        String delimiter;
        String[] numbers;

        if (!s.contains("//")) {
             delimiter = ",|\n";
            numbers = s.split(delimiter);
        } else {
            delimiter = String.valueOf(s.charAt(2));
            String[] delimiterAndValues = s.split("\n");

            numbers = delimiterAndValues[1].split(delimiter);
        }

        if (s.equalsIgnoreCase("")) {
            return 0;
        }

        int result = 0;

        for (int num = 0; num < numbers.length ; num++) {
            result += Integer.parseInt(numbers[num]);
        }

        return result;
    }

    //Split string, parse and sum each string/int
}
