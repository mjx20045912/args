package com.jimson.tdd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SchemaItemTest {
    @Test
    public void should_get_bool_value() {
        SchemaItem schemaItem = new SchemaItem("l:bool");
        assertEquals(schemaItem.getDescription(), "l:bool");
        assertEquals(schemaItem.getName(), "l");
        assertEquals(schemaItem.getValue(), "bool");
    }

    @Test
    public void should_get_int_value() {
        SchemaItem schemaItem = new SchemaItem("p:int");
        assertEquals(schemaItem.getDescription(), "p:int");
        assertEquals(schemaItem.getName(), "p");
        assertEquals(schemaItem.getValue(), "int");
    }
}
