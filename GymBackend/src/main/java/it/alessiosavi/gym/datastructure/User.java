package it.alessiosavi.gym.datastructure;

import java.time.ZonedDateTime;

public class User {
    private String username;
    private String name;
    private String surname;
    private String mail;
    private ZonedDateTime time;
    private ZonedDateTime registerDate;

    public User() {
    }

    public User(String username, String name, String surname, String mail, ZonedDateTime time, ZonedDateTime registerDate) {
        this.username = username;
        this.name = name;
        this.surname = surname;
        this.mail = mail;
        this.time = time;
        this.registerDate = registerDate;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public ZonedDateTime getTime() {
        return time;
    }

    public void setTime(ZonedDateTime time) {
        this.time = time;
    }

    public ZonedDateTime getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(ZonedDateTime registerDate) {
        this.registerDate = registerDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", mail='" + mail + '\'' +
                ", time=" + time +
                ", registerDate=" + registerDate +
                '}';
    }
}
