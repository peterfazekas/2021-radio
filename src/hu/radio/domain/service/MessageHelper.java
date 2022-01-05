package hu.radio.domain.service;

import java.util.List;
import java.util.stream.IntStream;

public class MessageHelper {

    private static String merged;

    public static String mergeMessages(List<String> messages) {
        merged = messages.get(0);
        messages.forEach(MessageHelper::mergeMessage);
        return merged;
    }

    private static void mergeMessage(String message) {
        StringBuilder mergedMessage = new StringBuilder();
        IntStream.range(0, message.length())
                .forEach(i -> mergedMessage.append(getCharacter(i, message, merged)));
        merged = mergedMessage.toString();
    }

    private static char getCharacter(int i, String message, String merged) {
        return message.charAt(i) != '#' ? message.charAt(i) : merged.charAt(i);
    }
}
