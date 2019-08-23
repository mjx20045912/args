package com.jimson.tdd;

public class ArgItem {
    private String name;
    private String value;
    public ArgItem(String stringArg, String spilter) {
        String[] argItems = stringArg.split(spilter);
        this.name = argItems[0];
        this.value = argItems.length > 1 ?  argItems[1] : null;
    }

    public String getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}
