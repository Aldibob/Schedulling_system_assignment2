public abstract class Event {
    protected String title;
    protected String date;
    protected String organizer;
    protected String location;

    public Event(String title, String date, String organizer, String location) {
        this.title = title;
        this.date = date;
        this.organizer = organizer;
        this.location = location;
    }

    public abstract void showTimeOfStart();
    public abstract void showTimeOfEnd();

    public void showTitle() {
        System.out.println();;
    }
    public void showDate() {
        System.out.println("Date" + date);
    }
    public void showOrganizer() {
        System.out.println("Organizer" + organizer);
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public void showLocation() {
        System.out.println("Location " + location);
    }
}