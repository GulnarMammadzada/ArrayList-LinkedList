package package3;

public class Session {
    String title;
    String SpeakerName;
    String time;


    public Session(String title,String speakerName, String time) {
        this.SpeakerName = speakerName;
        this.time = time;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Session{" +
                "SpeakerName='" + SpeakerName + '\'' +
                ", title='" + title + '\'' +
                ", time='" + time + '\'' +
                '}';
    }

}
