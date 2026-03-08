package pizzeria;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import elementos.PlaceholderTextField;
import elementos.RoundedButton;

// Clase login heredada de JFrame
public class login extends JFrame {
    //Elementos
    private JPanel panelNaranja, panelBlanco;
    private JLabel lbImagen;

    //Metodo login donde se crea el Frame
    public login(){
        setTitle("Inicio de sesion o registro");
        setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBackground(Color.white);
        setSize(900,600);
        setResizable(false);
        setLocationRelativeTo(null);

        //Panel naranja derecho
        panelNaranja = new inicioSesion();

        //Panel  blanco con logo izquierdo
        panelBlanco = new JPanel();
        panelBlanco.setBackground(Color.white);
        panelBlanco.setPreferredSize(new Dimension(300,600));
        panelBlanco.setLayout(null);

        //Añadir, editar tamaño y forma del logo
        ImageIcon imageIcon = new ImageIcon(getClass().getResource("/imagenes/pizzaLogo.png"));
        Image scaledImage = imageIcon.getImage().getScaledInstance(200,200,Image.SCALE_SMOOTH);
        ImageIcon resizedIcon = new ImageIcon(scaledImage);
        lbImagen = new JLabel(resizedIcon);
        lbImagen.setBounds(50,150,200,200);

        //Añadimos logo a panel blanco
        panelBlanco.add(lbImagen);

        //Añadimos los paneles
        add(panelNaranja,BorderLayout.CENTER);
        add(panelBlanco,BorderLayout.WEST);

        //Hacemos visible el frame
        setVisible(true);
    }

    //Clase publica de inicio de sesion heredada de JPanel
    public class inicioSesion extends JPanel{

        //Elementos de Inicio de Sesion
        private JLabel bienvenida,titulo,usuario,contra, texto1, texto2;
        private JTextField usuarioText, contraText;
        private JButton btnEntrar, btnRegistrar;

        //Metodo de inicioSesion
        public inicioSesion(){

            setBackground(Color.ORANGE);
            setLayout(null);

            //Elementos del panel inicio de sesion
            bienvenida = new JLabel("¡Bienvenido!");
            bienvenida.setForeground(Color.BLACK);
            bienvenida.setFont(new Font("BigFlorida",Font.BOLD,40));
            bienvenida.setBounds(190,50,500,50);

            titulo = new JLabel("Inicio de Sesión");
            titulo.setForeground(Color.BLACK);
            titulo.setFont(new Font("Arial",Font.BOLD,30));
            titulo.setBounds(190,110,300,50);

            usuario = new JLabel("Usuario:");
            usuario.setForeground(Color.BLACK);
            usuario.setFont(new Font("Arial",Font.BOLD,25));
            usuario.setBounds(80,260,100,50);

            usuarioText = new PlaceholderTextField("Usuario",20);
            usuarioText.setBounds(220,270,280,30);

            contra = new JLabel("Contraseña:");
            contra.setForeground(Color.BLACK);
            contra.setFont(new Font("Arial",Font.BOLD,25));
            contra.setBounds(60,300,150,50);

            contraText = new PlaceholderTextField("Contraseña",20);
            contraText.setBounds(220,310,280,30);

            texto1 = new JLabel("¿Aun no tienes cuenta?");
            texto1.setForeground(Color.BLACK);
            texto1.setFont(new Font("Arial",Font.BOLD,15));
            texto1.setBounds(215,385,280,100);

            texto2 = new JLabel("Registrate para crear una");
            texto2.setForeground(Color.BLACK);
            texto2.setFont(new Font("Arial",Font.BOLD,15));
            texto2.setBounds(210,410,280,100);

            //Botones
            btnEntrar = new RoundedButton("Entrar");
            btnEntrar.setBackground(Color.RED);
            btnEntrar.setForeground(Color.WHITE);
            btnEntrar.setFont(new Font("Arial",Font.BOLD,15));
            btnEntrar.setBounds(250,360,100,30);
            btnEntrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

            btnRegistrar = new RoundedButton("Registrarse");
            btnRegistrar.setBackground(Color.RED);
            btnRegistrar.setForeground(Color.WHITE);
            btnRegistrar.setFont(new Font("Arial",Font.BOLD,15));
            btnRegistrar.setBounds(228,490,150,30);
            btnRegistrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

            // Evento de boton entrar
            btnEntrar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    //Se verifica los datos de usuario y password
                    String usuario = usuarioText.getText();
                    String password = contraText.getText();

                    //Se llama a la clase ValidarEmpleado
                    ValidarEmpleado vale = new ValidarEmpleado();

                    //Si usuario y password coinciden
                    if(vale.validar(usuario,password)){
                        //Se llama la clase menu
                        new menu();
                        //Se cierra la venta login
                        cierreVentana();

                    } else {
                        //Mensaje de datos incorrectos
                        JOptionPane.showMessageDialog(null, "Datos incorrectos");
                        //Se limpian los campos de texto
                        usuarioText.setText(" ");
                        contraText.setText(" ");
                    }
                }
            });


            // Evento de btnRegistrar
            btnRegistrar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    //Llama la clase registro
                    new formulario_registro();
                    //Cierra la ventana login
                    cierreVentana();
                }
            });

            //Agregar elementos al panel
            add(bienvenida);
            add(titulo);
            add(usuario);
            add(usuarioText);
            add(contra);
            add(contraText);
            add(texto1);
            add(texto2);

            //botones
            add(btnEntrar);
            add(btnRegistrar);
        }
    }

    //Meotodo cerrar ventana
    public void cierreVentana(){
        setVisible(false);
    }

}

