import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTests {

    @Test
    void AnEmptyStringReturnsZero() {

        //Arrange
        Calculator systemUnderTest = new Calculator();

        //Act
        int response =  systemUnderTest.Add("");

        //Assert
        assertEquals(response,0);
    }

    @Test
    void ASingleNumberReturnsItself(){
        //Arrange
        Calculator systemUnderTest = new Calculator();

        //Act
        int response =  systemUnderTest.Add("1");

        //Assert
        assertEquals(response,1);
    }
}
