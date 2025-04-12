package package3;

public class Attendee {
    String name;
    String email;
    String sessionTitle;

    public Attendee(String name,String email,String sessionTitle) {
        this.email = email;
        this.name = name;
        this.sessionTitle = sessionTitle;
    }

    @Override
    public String toString() {
        return "package3.Attendee{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", sessionTitle='" + sessionTitle + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getSessionTitle() {
        return sessionTitle;
    }
}
