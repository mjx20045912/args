package com.jimson.tdd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SchemasTest {
    @Test
    public void should_get_bool_value() {
        Schemas schemas = new Schemas("l:bool");
        assertEquals(schemas.getValue("l","true"), true);
        assertEquals(schemas.getValue("l","false"), false);
        assertEquals(schemas.getValue("l",""), false);
    }

    @Test
    public void should_get_int_value() {
        Schemas schemas = new Schemas("l:int");
        assertEquals(schemas.getValue("l","1"), 1);
        assertEquals(schemas.getValue("l","-1"), -1);
    }

    @Test
    public void should_get_string_value() {
        Schemas schemas = new Schemas("l:string");
        assertEquals(schemas.getValue("l","hello"), "hello");
        assertEquals(schemas.getValue("l",""), "");
    }
}
