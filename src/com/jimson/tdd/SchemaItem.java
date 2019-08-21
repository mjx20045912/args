package com.jimson.tdd;

class SchemaItem {
    private String description;
    private String name;
    private String value;
    SchemaItem(String schemaString) {
        this.description = schemaString;
        String[] values = schemaString.split(":");
        this.name = values[0];
        this.value = values[1];
    }

    String getDescription() {
        return this.description;
    }

    String getName() {
        return this.name;
    }

    String getValue() {
        return this.value;
    }
}
