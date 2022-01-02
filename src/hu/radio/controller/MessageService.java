package hu.radio.controller;

import hu.radio.domain.model.RadioMessage;

import java.util.List;

public class MessageService {

    private final List<RadioMessage> messages;

    public MessageService(List<RadioMessage> messages) {
        this.messages = messages;
    }

    /**
     * 2. feladat
     */
    public int getFirstMessageReceiverId() {
        int first = 0;
        return messages.get(first).getReceiverId();
    }

    public int getLastMessageReceiverId() {
        int last = messages.size() - 1;
        return messages.get(last).getReceiverId();
    }

}