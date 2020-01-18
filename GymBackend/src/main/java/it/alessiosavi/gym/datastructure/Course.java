package it.alessiosavi.gym.datastructure;

public abstract class Course {

    private String courseName;
    private int maxParticipant;
    private int participant;
    private String description;

    public Course() {
    }

    public Course(String courseName, int maxParticipant, int participant, String description) {
        this.courseName = courseName;
        this.maxParticipant = maxParticipant;
        this.participant = participant;
        this.description = description;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getMaxParticipant() {
        return maxParticipant;
    }

    public void setMaxParticipant(int maxParticipant) {
        this.maxParticipant = maxParticipant;
    }

    public int getParticipant() {
        return participant;
    }

    public void setParticipant(int participant) {
        this.participant = participant;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", maxParticipant=" + maxParticipant +
                ", participant=" + participant +
                ", description='" + description + '\'' +
                '}';
    }
}

