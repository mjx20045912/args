package com.jimson.tdd;

public class ArgItem {
    private String name;
    private String value;
    public ArgItem(String name, String value){
        this.name = name;
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}
