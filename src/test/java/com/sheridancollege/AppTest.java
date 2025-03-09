package com.sheridancollege;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testAddition() {
        assertEquals(5, App.add(2, 3), "2 + 3 should equal 5");
    }
}