package com.jimson.tdd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Schemas {
    private List<SchemaItem> schemas;

    Schemas(String config) {
        schemas = new ArrayList<>();
        Arrays.stream(config.split(",")).forEach(schema -> {
            schemas.add(new SchemaItem(schema));
        });
    }

    Object getValue(String key, String value) {
        SchemaItem item = schemas.stream().filter(schema -> key.equalsIgnoreCase(schema.getName())).findFirst().orElse(null);
        return getSchemaValue(value, item);
    }

    private Object getSchemaValue(String value, SchemaItem item) {
        if (item == null) {
            return value;
        }
        if (item.getValue().equalsIgnoreCase("bool"))
            return "true".equalsIgnoreCase(value    );
        if (item.getValue().equals("int"))
            return Integer.valueOf(value);
        return value;
    }
}
