import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connect {
    public static Connection getConnection() throws SQLException {
        // Creo un metodo getConnection che usa come interfaccia Connection
        String jdbcUrl = "jdbc:postgresql://localhost:5432/postgres"; // Assegno ad una stringa l'url del DB dove:
        // jdbc: che sta per Java DataBase Connectivity
        // postgresql: ossia il DBMS che sta per DataBase Managment System, in questo caso PostgreSQL
        // localhost: host del DB
        // 5433: la porta del DB
        String username = "postgres";
        String password = "";
        return DriverManager.getConnection(jdbcUrl, username, password);
    }
}
