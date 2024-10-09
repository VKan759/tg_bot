package ru.bot.model;

import java.util.Objects;

public class User {
    private int id;
    private int chatId;
    private int clientId;

    public User() {
    }

    public User(int id, int chatId, int clientId) {
        this.id = id;
        this.chatId = chatId;
        this.clientId = clientId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getChatId() {
        return chatId;
    }

    public void setChatId(int chatId) {
        this.chatId = chatId;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return id == user.id && chatId == user.chatId && clientId == user.clientId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, chatId, clientId);
    }
}
