package pizzeria;

import elementos.PlaceholderTextField;
import elementos.RoundedButton;

import javax.swing.*;
import java.awt.*;


    //Clase formulario_registro heredada de JFrame
    public class formulario_registro extends JFrame {
        //Elementos
        private JLabel titulo, direccion, datosPerso, datosVivienda, datosLaborales;
        private JLabel nombre,apellido, edad,telefono,colonia,calle,numero,rol,Rfc,nss,usuario,password;
        private JTextField txtNombre, txtApellido, txtEdad, txtTelefono, txtCol, txtCalle, txtNum, txtRol, txtRfc, txtnss, txtUsuario,txtPassword;
        private JPanel formularioPanel;
        private JButton btnGuardar;

        //Metodo formulario_registro
        public formulario_registro(){
            setTitle("Registro");
            setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            setBackground(Color.gray);
            setSize(600,800);
            setResizable(false);
            setLocationRelativeTo(null);

            //Se crea panel
            formularioPanel = new JPanel();
            formularioPanel.setLayout(null);


            //Elementos del registro
            titulo = new JLabel("Pizzeria (Nombre)");
            titulo.setFont(new Font("Arial", Font.BOLD,30));
            titulo.setForeground(Color.ORANGE);
            titulo.setBounds(155,10,300,50);

            direccion = new JLabel("Sucursal (1), Ubicados en Av. Palmas #1002 Joyas del Oceano");
            direccion.setFont(new Font("Arial", Font.ITALIC, 15));
            direccion.setForeground(Color.black);
            direccion.setBounds(90,40,500,50);

            datosPerso = new JLabel("Ingresa tus datos Personales");
            datosPerso.setFont(new Font("Arial", Font.ITALIC, 15));
            datosPerso.setForeground(Color.BLACK);
            datosPerso.setBounds(50,80,250,50);


            // Etiquetas (todo que tenga txt son campos de texto)
            //Datos personales
            nombre = new JLabel("Nombre: ");
            nombre.setFont(new Font("Arial", Font.BOLD,15));
            nombre.setBounds(50,130,70,30);

            txtNombre = new PlaceholderTextField("Nombre",15);
            txtNombre.setBounds(120,130,400,25);


            apellido = new JLabel("Apellido: ");
            apellido.setFont(new Font("Arial", Font.BOLD,15));
            apellido.setBounds(50,160,70,35);

            txtApellido = new PlaceholderTextField("Apellido", 15);
            txtApellido.setBounds(120,160,400,25);


            edad = new JLabel("Edad: ");
            edad.setFont(new Font("Arial", Font.BOLD,15));
            edad.setBounds(50,190,70,35);

            txtEdad = new PlaceholderTextField("Edad", 15);
            txtEdad.setBounds(100,190,140,25);


            telefono = new JLabel("Telefono: ");
            telefono.setFont(new Font("Arial", Font.BOLD,15));
            telefono.setBounds(250,190,100,35);

            txtTelefono = new PlaceholderTextField("Telefono", 15);
            txtTelefono.setBounds(330,190,200,25);


            //Datos de vivienda
            datosVivienda = new JLabel("Datos de Vivienda");
            datosVivienda.setFont(new Font("Arial", Font.ITALIC, 15));
            datosVivienda.setForeground(Color.BLACK);
            datosVivienda.setBounds(50,230,250,50);

            calle = new JLabel("Calle: ");
            calle.setFont(new Font("Arial", Font.BOLD,15));
            calle.setBounds(50,280,70,35);

            txtCalle = new PlaceholderTextField("Calle", 15);
            txtCalle.setBounds(100,280,240,25);


            numero = new JLabel("Numero: ");
            numero.setFont(new Font("Arial", Font.BOLD,15));
            numero.setBounds(50,310,240,35);

            txtNum = new PlaceholderTextField("Numero",15);
            txtNum.setBounds(120,310,240,25);


            colonia = new JLabel("Colonia: ");
            colonia.setFont(new Font("Arial", Font.BOLD,15));
            colonia.setBounds(50,340,240,35);

            txtCol = new PlaceholderTextField("Colonia", 15);
            txtCol.setBounds(120,340,240,25);

            //Datos laborales
            datosLaborales = new JLabel("Datos Laborales");
            datosLaborales.setFont(new Font("Arial", Font.ITALIC, 15));
            datosLaborales.setForeground(Color.BLACK);
            datosLaborales.setBounds(50,380,250,50);

            rol = new JLabel("Rol: ");
            rol.setFont(new Font("Arial", Font.BOLD,15));
            rol.setBounds(50,430,70,35);

            txtRol = new PlaceholderTextField("Rol",15);
            txtRol.setBounds(95,430,150,25);

            Rfc = new JLabel("Rfc:");
            Rfc.setFont(new Font("Arial", Font.BOLD,15));
            Rfc.setBounds(50,460,70,35);

            txtRfc = new PlaceholderTextField("Rfc", 15);
            txtRfc.setBounds(95,460,150,25);

            nss = new JLabel("nss:");
            nss.setFont(new Font("Arial", Font.BOLD,15));
            nss.setBounds(50,490,70,35);

            txtnss = new PlaceholderTextField("nss", 15);
            txtnss.setBounds(95,490,150,25);

            usuario = new JLabel("Usuario:");
            usuario.setFont(new Font("Arial", Font.BOLD,15));
            usuario.setBounds(50,520,70,35);

            //Datos de cuenta
            txtUsuario = new PlaceholderTextField("Usuario", 15);
            txtUsuario.setBounds(120,520,170,25);

            password = new JLabel("Password:");
            password.setFont(new Font("Arial", Font.BOLD,15));
            password.setBounds(50,550,150,35);

            txtPassword = new PlaceholderTextField("Password", 15);
            txtPassword.setBounds(140,550,170,25);


            //Boton guardar
            btnGuardar = new RoundedButton("Guardar datos");
            btnGuardar.setBackground(Color.BLUE);
            btnGuardar.setForeground(Color.WHITE);
            btnGuardar.setFont(new Font("Arial",Font.BOLD,20));
            btnGuardar.setBounds(200,650,200,45);
            btnGuardar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

            //Evento del btnGuardar
            btnGuardar.addActionListener(e -> {
                // Se crea un objeto de la clase Empleado
                Empleado emp = new Empleado();

                //Consigue los datos del registro y los manda a los setters
                emp.setUsuario(txtUsuario.getText());
                emp.setPassword(txtPassword.getText());
                emp.setNombre(txtNombre.getText());
                emp.setApellido(txtApellido.getText());
                emp.setEdad(Integer.parseInt(txtEdad.getText()));
                emp.setTelefono(txtTelefono.getText());
                emp.setCalle(txtCalle.getText());
                emp.setNumero(Integer.parseInt(txtNum.getText()));
                emp.setColonia(txtCol.getText());
                emp.setRol(txtRol.getText());
                emp.setRfc((txtRfc.getText()));
                emp.setnss((txtnss.getText()));

                //Objeto de la clase añadir_empleado
                añadir_empleado añadir = new añadir_empleado();
                //Se utiliza un metodo de la clase añadir_empleado para insertar los datos en la BD
                añadir.insertarEmpleado(emp);


                //Se llama la clase login
                new login();
                //Se quita el registro
                setVisible(false);
            });

            //Se añaden los elementos al panel del formulario
            formularioPanel.add(titulo);
            formularioPanel.add(direccion);
            formularioPanel.add(datosPerso);
            formularioPanel.add(datosVivienda);

            //datos personales
            formularioPanel.add(nombre);
            formularioPanel.add(txtNombre);
            formularioPanel.add(apellido);
            formularioPanel.add(txtApellido);
            formularioPanel.add(edad);
            formularioPanel.add(txtEdad);
            formularioPanel.add(telefono);
            formularioPanel.add(txtTelefono);

            // Datos de la vivienda
            formularioPanel.add(calle);
            formularioPanel.add(txtCalle);
            formularioPanel.add(numero);
            formularioPanel.add(txtNum);
            formularioPanel.add(colonia);
            formularioPanel.add(txtCol);

            //Datos laborales
            formularioPanel.add(datosLaborales);
            formularioPanel.add(rol);
            formularioPanel.add(txtRol);
            formularioPanel.add(Rfc);
            formularioPanel.add(txtRfc);
            formularioPanel.add(nss);
            formularioPanel.add(txtnss);

            //Datos de cuenta
            formularioPanel.add(usuario);
            formularioPanel.add(txtUsuario);
            formularioPanel.add(password);
            formularioPanel.add(txtPassword);

            //bton
            formularioPanel.add(btnGuardar);

            setContentPane(formularioPanel);
            setVisible(true);
        }

    }

