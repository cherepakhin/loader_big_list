package ru.perm.v.stat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class JavaVersionTest {

    @Test
    void getJavaVersion() {
        assertTrue(System.getProperty("java.version").contains("1.8"));
    }

}
