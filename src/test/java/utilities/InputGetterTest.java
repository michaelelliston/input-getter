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

            }
            assertEquals(expected, actual);
            System.out.println(actual);
            break;
        }
    }

//    @Test
//    public void test_run_getString_method() {
//        String expected = "This is a test";
//
//        String actual = InputGetter.getString1(" This is a test ");
//
//        assertEquals(expected, actual);
//        System.out.println(actual);
//    }
}