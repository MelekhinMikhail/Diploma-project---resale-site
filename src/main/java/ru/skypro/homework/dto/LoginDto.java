package ru.skypro.homework.dto;

import lombok.Data;

@Data
public class LoginDto {

    /**
     * Логин пользователя
     */
    private String username;


    /**
     * Пароль пользователя
     */
    private String password;

    public LoginDto(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
