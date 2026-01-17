import java.sql.*;


public class EventDAO {

    // CREATE
    public static void addEvent(String title, String date, int organizerId)
            throws SQLException {
        String sql = "INSERT INTO event (title, event_date, organizer_id) VALUES (?, ?, ?)";
        Connection conn = DatabaseConnection.connect();
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, title);
        ps.setDate(2, Date.valueOf(date));
        ps.setInt(3, organizerId);
        ps.executeUpdate();
        conn.close();
    }

    // READ
    public static void getEvents() throws SQLException {
        String sql = "SELECT * FROM event";
        Connection conn = DatabaseConnection.connect();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(sql);

        while (rs.next()) {
            System.out.println(
                    rs.getInt("id") + " | " +
                            rs.getString("title") + " | " +
                            rs.getDate("event_date")
            );
        }
        conn.close();
    }

    // UPDATE
    public static void updateEventTitle(int id, String newTitle)
            throws SQLException {
        String sql = "UPDATE event SET title = ? WHERE id = ?";
        Connection conn = DatabaseConnection.connect();
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, newTitle);
        ps.setInt(2, id);
        ps.executeUpdate();
        conn.close();
    }

    // DELETE
    public static void deleteEvent(int id) throws SQLException {
        String sql = "DELETE FROM event WHERE id = ?";
        Connection conn = DatabaseConnection.connect();
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        ps.executeUpdate();
        conn.close();
    }
}
