package com.jimson.tdd;

class Args {
    private Schemas schemas;
    private Command command;

    Args(String schema, String commandLine) {
        this.schemas = new Schemas(schema);
        this.command = new Command(commandLine);
    }

    Object getValue(String key) {
        return schemas.getValue(key,command.getValue(key));
    }
}
