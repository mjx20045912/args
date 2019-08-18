package com.jimson.tdd;

import javafx.scene.control.TextInputControl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArgsHandler {
    public static Map<String,String> parse(String s) {
        HashMap<String, String> map = new HashMap<>();
        Arrays.stream(s.split("-")).filter(arg -> !arg.isEmpty()).forEach(arg->map.put(arg,""));
        return map;
    }
}
