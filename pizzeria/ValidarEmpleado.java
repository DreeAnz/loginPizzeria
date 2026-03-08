package pizzeria;

import java.sql.Connection;
import java.sql.PreparedStatement;

//Clase validarEmpleado
public class ValidarEmpleado {

    //Metodo vlaidar se necesita los parametros usuario y password
    public boolean validar(String usuario, String password){

        //Consulta sql para buscar los datos ingresados en la BD
        String sql = "SELECT * FROM empleados WHERE Usuario = ? AND Password = ?";

        //Objetos de la clase conexion
        conexion conn = new conexion();
        Connection con = conn.getConnection();


        try {
            // conexion, Se envian los datos a la BD
            //se interta un texto
            // los numeros corresponden al lugar de '?'
            //Obtiene al objeto de la clase Empelado
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,usuario);
            ps.setString(2,password);

            //ejecuta la consulta
            java.sql.ResultSet rs = ps.executeQuery();

            //si se mueve al siguiente registro
            if (rs.next()){
                return true; //si existe la fila
            }else {
                return false; //si no existe la fila
            }

            //en caso de algun error, deovlvera false
        } catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
}
