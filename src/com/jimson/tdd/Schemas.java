package com.jimson.tdd;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Schemas {
    private Map<String, Object> schemas;

    public Schemas(String config) {
        schemas = new HashMap<>();
        Arrays.stream(config.split(",")).forEach(schema -> {
            String[] items = schema.split(":");
            schemas.put(items[0], items[1]);
        });
    }

    public Object getValue(String key, String value) {
        if (schemas.get(key).equals("bool"))
            return value.equalsIgnoreCase("true");
        if (schemas.get(key).equals("int"))
            return Integer.valueOf(value);
        return value;
    }
}
