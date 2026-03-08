package pizzeria;
import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion {

        //Variable host                     conexion de java con una BD
        private static final String host = "jdbc:mysql://localhost/";
        //Usuario
        private static final String user = "root";
        //Contraseña
        private static final String password = "";

        public Connection getConnection(){
            try {
                // puente entre java y la BD
                Class.forName("com.mysql.cj.jdbc.Driver");
                // Direccion de la BD URL, usuario y contraseña
                return DriverManager.getConnection("jdbc:mysql://localhost:3306/gestorpizzeria", "root", "");

                //*Si todo funcina bien devolvera un obj Connection

                //En caso de errores se usa catch y devuelve null
            } catch (ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al conectar la base de datos");
                return null;
            }
        }

    // Ejecutable del programa
    public static void main(String[]args){
            //Ejecuta la clase login
        SwingUtilities.invokeLater(() -> new login());

    }
}
