package com.jimson.tdd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArgsHandlerTest {
    @Test
    public void should_get_length_3_when_3_dash() {
        assertEquals(ArgsHandler.parse("-a -b -c").size(), 3);
    }
    @Test
    public void should_get_length_0_when_0_dash() {
        assertEquals(ArgsHandler.parse("").size(), 0);
    }

    @Test
    public void should_get_length_1_when_1_dash() {
        assertEquals(ArgsHandler.parse("-a 123").size(), 1);
    }
}