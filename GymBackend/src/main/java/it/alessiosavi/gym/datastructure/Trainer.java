package it.alessiosavi.gym.datastructure;

import java.time.ZonedDateTime;
import java.util.List;

public class Trainer {

    private String name;
    private String surname;
    private ZonedDateTime date;
    private List<Course> courseList;

    public Trainer() {
    }

    public Trainer(String name, String surname, ZonedDateTime date, List<Course> courseList) {
        this.name = name;
        this.surname = surname;
        this.date = date;
        this.courseList = courseList;
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

    public ZonedDateTime getDate() {
        return date;
    }

    public void setDate(ZonedDateTime date) {
        this.date = date;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    @Override
    public String toString() {
        return "Trainer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", date=" + date +
                ", courseList=" + courseList +
                '}';
    }
}
