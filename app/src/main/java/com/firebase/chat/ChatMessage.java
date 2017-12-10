package com.firebase.chat;

/**
 * Created by ahmedjerbi on 21/10/17.
 */

public class ChatMessage {

    public String name;
    public String message;

    public ChatMessage() {
    }

    public ChatMessage(String name, String message) {
        this.name = name;
        this.message = message;
    }
}