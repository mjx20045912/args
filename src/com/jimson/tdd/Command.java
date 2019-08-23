package com.jimson.tdd;

import java.util.*;

class Command {

    private List<CommandItem> commands;

    Command(String commandLine) {
        commands = new ArrayList<>();

        ListIterator<String> iterator = Arrays.asList(commandLine.split("\\s")).listIterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            if(iterator.hasNext()) {
                String value = iterator.next();
                if (isCommandName(value)) {
                    commands.add(new CommandItem(name.replace("-", ""), null));
                    iterator.previous();
                } else {
                    commands.add(new CommandItem(name.replace("-", ""), value));
                }
            }
        }
    }

    private boolean isCommandName(String value) {
        return value.matches("-[a-zA-Z]");
    }

    String getValue(String key) {
        CommandItem item = commands.stream().filter(cmd -> key.equalsIgnoreCase(cmd.getName())).findFirst().orElse(null);
        return item == null ? null : item.getValue();
    }
}
