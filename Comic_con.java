public class Comic_con extends Event{
    public Comic_con(String title,String date, String organizer, String location) {
        super(title,date,organizer,location);
    }

    @Override
    public void showTimeOfStart() {
        System.out.println("Time of start: 10:00 AM");
    }
    @Override
    public void showTimeOfEnd() {
        System.out.println("Time of end: 2:00 PM");
    }
    @Override
    public void showDate() {
        System.out.println("Date: " + date);
    }
    @Override
    public void showLocation() {
        System.out.println("Location: " + location);
    }
    @Override
    public void showOrganizer() {
        System.out.println("Organizer: " + organizer);
    }
    @Override
    public void showTitle() {
        System.out.println("Title: " + title);
    }
    public void displayInfoComic_con() {
        System.out.println("Title: " + title + ", Date: " + date + ", Organizer: " + organizer + ", Location: " + location);
    }
}