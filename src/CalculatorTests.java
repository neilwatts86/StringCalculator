import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CalculatorTests {

    @Test
    void AnEmptyStringReturnsZero() {

        // Arrange
        Calculator systemUnderTest = new Calculator();

        // Act
        int response = systemUnderTest.Add("");

        // Assert
        assertEquals(response, 0);
    }

    @Test
    void ASingleNumberReturnsItself() {
        // Arrange
        Calculator systemUnderTest = new Calculator();

        // Act
        int response = systemUnderTest.Add("1");

        // Assert
        assertEquals(response, 1);
    }

    @Test
    void twoNumbersReturnSum() {
        // Arrange
        Calculator systemUnderTest = new Calculator();

        // Act
        int response = systemUnderTest.Add("1,2");

        // Assert
        assertEquals(response, 3);
    }
}
