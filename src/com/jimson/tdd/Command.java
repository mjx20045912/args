package com.jimson.tdd;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Command {

    private Map<String, String> map = null;

    public Command(String commandLine) {
        map = new HashMap<>();
        Arrays.stream(commandLine.split("-")).filter(a->!a.isEmpty()).forEach(cmd -> {
            String[] item = cmd.split(" ");
            map.put(item[0],item.length > 1 ? item[1] : "");
        });
    }

    public String getValue(String key) {
        return map.get(key);
    }
}
