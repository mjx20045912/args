package com.jimson.tdd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArgItemTest {
    @Test
    public void should_get_value_by_spliter() {
        ArgItem argItem = new ArgItem("b", "bool");

        assertEquals(argItem.getName(),"b" );
        assertEquals(argItem.getValue(),"bool" );
    }
}
