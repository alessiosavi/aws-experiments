package it.alessiosavi.gym.datastructure;


public class Response {

    private Response.status status;
    private String description;
    private String error;


    public Response() {
    }

    public Response(String description, String error) {
        this.status = status.KO;
        this.description = description;
        this.error = error;
    }

    public Response(Response.status status, String description, String error) {
        this.status = status;
        this.description = description;
        this.error = error;
    }

    public Response.status getStatus() {
        return status;
    }

    public void setStatus(Response.status status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    @Override
    public String toString() {
        return "Response{" +
                "status=" + status +
                ", description='" + description + '\'' +
                ", error='" + error + '\'' +
                '}';
    }

    public enum status {
        OK, KO
    }
}
