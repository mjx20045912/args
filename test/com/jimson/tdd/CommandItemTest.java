package com.jimson.tdd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CommandItemTest {
    @Test
    public void should_get_info_from_commandline() {
        CommandItem commandItem = new CommandItem("l", "true");
        assertEquals(commandItem.getName(), "l");
        assertEquals(commandItem.getValue(), "true");
    }
}
