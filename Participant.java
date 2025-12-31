public class Participant {
    private String name;
    private int age;
    private String eventName;

    public Participant(String name, int age, String eventName) {
        this.name = name;
        this.age = age;
        this.eventName = eventName;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public String oldEnough() {
        String oldYes = "You are old enough!";
        String oldNo = "You are not old enough!";

        if (this.age >= 18) {
            return oldYes;
        } else {
            return oldNo;
        }
    }
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }
    public String getEventName() {
        return eventName;
    }
}