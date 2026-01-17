public class Main {
    public static void main(String[] args) {
        try {
            EventDAO.addEvent("Math Conference", "2026-05-20", 1);
            EventDAO.getEvents();
            EventDAO.updateEventTitle(1, "Updated Conference");
            EventDAO.deleteEvent(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
