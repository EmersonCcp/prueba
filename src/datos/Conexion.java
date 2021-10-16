package datos;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Conexion {

    public static Connection Conectar() {
        Connection link = null;
        try {

            Class.forName("com.mysql.jdbc.Driver");
            link = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/flexsystem", "root", "");
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de conexion " + e);
        }
        return link;
    }

    

}
