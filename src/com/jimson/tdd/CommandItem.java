package com.jimson.tdd;

public class CommandItem {
    private String name;
    private String value;

    CommandItem(String command) {
        String[] cmdParam = command.split(" ");
        this.name = cmdParam[0];
        this.value = cmdParam.length > 1 ? cmdParam[1] : null;

    }

    String getName() {
        return this.name;
    }

    public String getValue() {
        return value;
    }
}
