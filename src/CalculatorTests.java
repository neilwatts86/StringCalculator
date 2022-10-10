import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTests {

    Calculator systemUnderTest;

    void setUp() {
        systemUnderTest = new Calculator();
    }
    @Test
    void AnEmptyStringReturnsZero() {

        //Arrange
        setUp();
        // Act
        int response = systemUnderTest.Add("");

        // Assert
        assertEquals(response, 0);
    }

    @Test
    void ASingleNumberReturnsItself() {

        //Arrange
        setUp();

        // Act
        int response = systemUnderTest.Add("1");

        // Assert
        assertEquals(response, 1);
    }

    @ParameterizedTest
    @CsvSource({
            "'1,2',3",
            "'1,3',4",
            "'12,6',18"})
    void twoNumbersReturnSum(String csv, int expectedResponse) {

        //Arrange
        setUp();

        // Act
        int response = systemUnderTest.Add(csv);

        // Assert
        assertEquals(response, expectedResponse);
    }

    @ParameterizedTest
    @CsvSource({
            "'1,2,3',6",
            "'1,2,10',13",
            "'50,150,100',300"
    })
    void AnyAmountOfNumbersReturnSum(String csv, int expectedResponse) {

        //Arrange
        setUp();

        // Act
        int response = systemUnderTest.Add(csv);

        // Assert
        assertEquals(response, expectedResponse);
    }

    @Test
    void CsvAndNewLineStringReturnsSum() {

        //Arrange
        setUp();

        // Act
        int response = systemUnderTest.Add("1\n2,3");

        // Assert
        assertEquals(response, 6);
    }

    @Test
    void changedDelimiter() {
        setUp();

        int response = systemUnderTest.Add("//;\n1;2");

        assertEquals(response, 3);
    }
}
