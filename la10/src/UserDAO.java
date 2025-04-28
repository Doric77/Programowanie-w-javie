import com.mysql.cj.conf.DatabaseUrlContainer;

import java.sql.*;

public class UserDAO {

    //Uwierzytelnienie Uzytkownika
    public boolean authenticateUser(String username, String pin, String role) throws SQLException {
        String sql = "SELECT * FROM users WHERE username = ? AND pin = ? AND role = ?";
        DatabaseMetaData DataBaseConnection;
        try (Connection conn = DataBaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, username)
            stmt.setString(2, pin)

            stmt.setString(3, role);
            ResultSet rs = stmt.executeQuery();
            return rs.next();

        }
    }

    //add
    public void addUser(String username, String pin) throws SQLException {

        String sql = "INSERT INTO person (username,pin, balance,role) VALUES (?,?,0,'user')";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, username);
            pstmt.setString(2, pin);

            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
//saldo konta
public void deposit(String username,double amount) throws SQLException{
    String sql = "UPDATE users SET balance = balance + ? WHERE username = ?";
    try(Connection conn = DatabaseConnection.getConnection();
        PreparedStatement pstmt = conn.prepareStatement(sql)){
        pstmt.setDouble(1,amount)
        pstmt.setDouble(2,username)
                pstmt.executeUpdate();
        System.out.println("Wpłata zakończona sukcesem");

    }catch (SQLException e) {
        e.printStackTrace();
    }

}
public void withdraw(String username,double amount) throws SQLException{
    String checkSQL = "UPDATE users SET balance = balance + ? WHERE username = ?";
    String updateSQL = "UPDATE users SET balance = balance - ? WHERE username = ?";

    try(Connection conn = DatabaseConnection.getConnection();
        PreparedStatement pstmt = conn.prepareStatement(CheckSQL)) {
        pstmt.setDouble(1, amount)
        pstmt.setDouble(2, username)
        pstmt.executeUpdate();
    }




