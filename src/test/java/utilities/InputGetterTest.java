package utilities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InputGetterTest {

    @Test
    public void testing_getString_method() {
        String expected = "This is a test";
        while (true) {
            System.out.print("Please enter: This is a test");
            String userInput = " This is a test ";
            String actual = userInput.trim();
            if (actual.isEmpty()) {
                System.err.println("Please enter your input.");
                break;
            }
            assertEquals(expected, actual);
            System.out.println(actual);
            break;
        }

    }

}