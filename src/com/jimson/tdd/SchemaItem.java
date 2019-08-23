package com.jimson.tdd;

class SchemaItem extends ArgItem {
    private String description;

    SchemaItem(String schemaString) {
        super(getSplit(schemaString)[0], getSplit(schemaString).length > 1 ? getSplit(schemaString)[1] : null);
        this.description = schemaString;
    }

    private static String[] getSplit(String schemaString) {
        return schemaString.split(":");
    }

    String getDescription() {
        return this.description;
    }

}
