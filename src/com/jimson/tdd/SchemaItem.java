package com.jimson.tdd;

class SchemaItem extends ArgItem{
    private String description;
    SchemaItem(String schemaString) {
        super(schemaString, ":");
        this.description = schemaString;
    }

    String getDescription() {
        return this.description;
    }

}
