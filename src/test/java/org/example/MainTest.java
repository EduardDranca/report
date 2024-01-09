package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {
    @Test
    public void test() {

    }

    @Test
    public void test2() {
        String var1 = System.getenv("var1");
        String var2 = System.getenv("var2");
        Assertions.assertEquals("abc", var1);
        Assertions.assertEquals("def", var2);
    }
}