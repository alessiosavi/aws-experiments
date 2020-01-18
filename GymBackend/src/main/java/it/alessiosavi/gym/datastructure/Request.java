package it.alessiosavi.gym.datastructure;

public class Request {

    private requestType requestType;
    private String name;
    private String surname;
    private String mail;
    private String description;
    private String participant;

    public Request() {
    }

    public Request(Request.requestType requestType, String name, String surname, String mail, String description, String participant) {
        this.requestType = requestType;
        this.name = name;
        this.surname = surname;
        this.mail = mail;
        this.description = description;
        this.participant = participant;
    }

    public Request.requestType getRequestType() {
        return requestType;
    }

    public void setRequestType(Request.requestType requestType) {
        this.requestType = requestType;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getParticipant() {
        return participant;
    }

    public void setParticipant(String participant) {
        this.participant = participant;
    }

    @Override
    public String toString() {
        return "Request{" +
                "requestType=" + requestType +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", mail='" + mail + '\'' +
                ", description='" + description + '\'' +
                ", participant='" + participant + '\'' +
                '}';
    }

    private enum requestType {
        add_user,
        add_course,
        add_trainer,
        get_users,
        get_courses,
        get_trainer
    }
}
