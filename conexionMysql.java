package conexion;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

public class conexionMysql {
     Connection cn;
    
    public Connection conectar() {
        try {
            Class.forName ("com.mysql.jdbc.Driver");
            cn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/login_pds", "root", "");
            System.out.println("Conectado");
        } catch (Exception e) {
            System.out.println("Error de Conexion BD" +e);
        }
        return cn;
    }
    
}
