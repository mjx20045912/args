package com.jimson.tdd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArgsTest {
    @Test
    public void should_get_value() {
        Args args = new Args("l:bool,d:string,p:int", "-l true -d /usr/local -p 80");
        assertEquals(args.getValue("l"), Boolean.TRUE);
        assertEquals(args.getValue("d"), "/usr/local");
        assertEquals(args.getValue("p"), 80);
    }

    @Test
    public void should_get_default_value() {
        Args args = new Args("l:bool,d:string,p:int", "-l -d /usr/local -p 80");
        assertEquals(args.getValue("l"), Boolean.FALSE);
        assertEquals(args.getValue("d"), "/usr/local");
        assertEquals(args.getValue("p"), 80);
    }
}