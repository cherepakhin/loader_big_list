package demo1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void appHasAGreeting() {
        App classUnderTest = new App();
        assertEquals(classUnderTest.getGreeting(), "Hello World!");
    }
}
