import java.sql.*;

public class query {

    public static void main(String[] args) throws SQLException {
        Connection connessione = con.getConnection();
        //String sql = "INSERT INTO users (username, password) VALUES (?,?)";
        String sql = "SELECT * FROM users";
        PreparedStatement preparedStatement = connessione.prepareStatement(sql);


        try(connessione; preparedStatement){
            //
            //preparedStatement.setString(1, "alessandro");
            //preparedStatement.setString(2, "aaaaa");
            //preparedStatement.executeUpdate();
            //System.out.println("riuscito");

            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                String user = resultSet.getString("username");
                String pass = resultSet.getString("password");
                System.out.println(user + ": " + pass);
            }
        }catch (Exception e){
            System.out.println("failed");
        }


    }
}
