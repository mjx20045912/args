package com.jimson.tdd;

import java.util.*;

class Command {

    private List<CommandItem> commands;

    Command(String commandLine) {
        commands = new ArrayList<>();
        Arrays.stream(commandLine.split("-")).filter(a -> !a.isEmpty()).forEach(cmd -> {
            commands.add(new CommandItem(cmd));
        });
    }

    String getValue(String key) {
        CommandItem item = commands.stream().filter(cmd -> key.equalsIgnoreCase(cmd.getName())).findFirst().orElse(null);
        return item == null ? null : item.getValue();
    }
}
