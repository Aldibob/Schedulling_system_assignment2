public class Event {
    private int id;
    private String title;
    private String date;
    private int organizerId;

    public Event(int id, String title, String date, int organizerId) {
        this.id = id;
        this.title = title;
        this.date = date;
        this.organizerId = organizerId;
    }

    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getDate() { return date; }
    public int getOrganizerId() { return organizerId; }
}
