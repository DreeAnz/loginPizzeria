package pizzeria;

import java.sql.Connection;
import java.sql.PreparedStatement;

//Clase añadir_empleado
public class añadir_empleado {

    // consulta sql para añadir los datos del registro a  la tabla empleados
    private static final String SQL_INSERT = "INSERT INTO empleados (Usuario,Password,Nombre,Apellido,Edad,Telefono,Colonia,Calle,Numero,Rol,RFC,nss)" +
            // los ? son los datos que el usuario ingresa
             "value(?, ?, ?, ?, ?, ?, ?, ?, ?, ? ,?, ?)";

    // metodo insertar empleados
    public boolean insertarEmpleado(Empleado emp){
        //objeto de la conexion
    conexion conn = new conexion();
    Connection con = conn.getConnection();

    try {
        //conexion, se prepara para ejecutar una consulta 'insertar'
        PreparedStatement ps = con.prepareStatement(SQL_INSERT);

        // SE INSERTAN LOS DATOS
        //se interta un texto
        // los numeros corresponden al lugar de '?'
        //Obtiene al objeto de la clase Empelado
        ps.setString(1, emp.getUsuario());
        ps.setString(2, emp.getPassword());
        ps.setString(3, emp.getNombre());
        ps.setString(4, emp.getApellido());
        ps.setInt(5, emp.getEdad());
        ps.setString(6, emp.getTelefono());
        ps.setString(7, emp.getColonia());
        ps.setString(8, emp.getCalle());
        ps.setInt(9, emp.getNumero());
        ps.setString(10, emp.getRol());
        ps.setString(11, emp.getRfc());
        ps.setString(12, emp.getnss());

        ps.executeUpdate();

        //El empleado se guardo correctamente
        return true;

        //En caso de que ocurra un error, devolvera false
    } catch (Exception e){
        e.printStackTrace();
        return false;
        }
    }
}


