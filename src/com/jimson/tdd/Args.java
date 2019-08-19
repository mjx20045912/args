package com.jimson.tdd;

public class Args {
    private Schemas schemas;
    private Command command;
    public Args(String schema, String commandLine) {
        this.schemas = new Schemas(schema);
        this.command = new Command(commandLine);
    }

    public Object getValue(String key) {
        return schemas.getValue(key,command.getValue(key));
    }
}
