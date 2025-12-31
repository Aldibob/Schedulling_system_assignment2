import java.lang.String;

public class Organizer {
    private String name;
    private String eventNames;

    public Organizer(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return eventNames;
    }

}