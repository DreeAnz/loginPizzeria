package pizzeria;


public class Empleado {
    //Variables
    private String usuario,password,nombre,apellido, telefono,colonia,calle,rol,Rfc,nss;
    private  int edad,numero;

    // Getters
    public String getUsuario() {return usuario;}
    public String getPassword() {return password;}
    public String getNombre() {return nombre;}
    public String getApellido() {return apellido;}
    public int getEdad() {return edad;}
    public String getTelefono() {return telefono;}
    public String getCalle() {return calle;}
    public int getNumero(){return numero;}
    public String getColonia() {return colonia;}
    public String getRol() {return  rol;}
    public String getRfc() {return Rfc;}
    public String getnss() {return nss;}

    //Setters
    public void setUsuario(String usuario){ this.usuario = usuario;}
    public void setPassword(String password){ this.password = password;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setApellido(String apellido) {this.apellido = apellido;}
    public void setEdad(int edad) {this.edad = edad;}
    public void setTelefono(String telefono) {this.telefono = telefono;}
    public void setCalle(String calle) {this.calle = calle;}
    public void setNumero(int numero) {this.numero = numero;}
    public void setColonia(String colonia) {this.colonia = colonia;}
    public void setRol(String rol) {this.rol = rol;}
    public void setRfc(String Rfc) {this.Rfc = Rfc;}
    public void setnss(String nss) {this.nss = nss;}

}
