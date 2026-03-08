package pizzeria;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import elementos.RoundedButton;

//Clase menu heredada JFrame
public class menu extends JFrame{
    private JPanel panel_contenido, fondo_titulo;
    private JLabel titulo_menu;

    //Metodo menu
    public menu(){
        //Se crea el JFrame
            setTitle("Menu");
            setLayout(new BorderLayout());
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setBackground(Color.white);
            setSize(900,600);
            setResizable(false);
            setLocationRelativeTo(null);

            //Se crea el panel naranja
            fondo_titulo =new JPanel();
            fondo_titulo.setBackground(Color.ORANGE);
            fondo_titulo.setPreferredSize(new Dimension(300,70));
            fondo_titulo.setLayout(null);

            //Panel gris del contenido
            panel_contenido = new contenidoMenu();

            titulo_menu = new JLabel("Menú");
            titulo_menu.setForeground(Color.BLACK);
            titulo_menu.setFont(new Font("BigFlorida",Font.BOLD,35));
            titulo_menu.setBounds(395,-90,380,250);


            //Se añaden los elementos al frame y posicion
            add(fondo_titulo,BorderLayout.NORTH);
            // Se añade el titulo al panel naranja
            fondo_titulo.add(titulo_menu);
            add(panel_contenido,BorderLayout.CENTER);
            setVisible(true);
    }

        // Clase del contenido heredad JPanel
        public class contenidoMenu extends JPanel{
        //Elementos
            JLabel imagen_menu;
            JButton btnSalir;

            //Metodo del panel contenido
            public contenidoMenu(){
                    setBackground(Color.gray);
                    setLayout(null);

                    //Se crea la imagen del menu
                    ImageIcon imageIcon = new ImageIcon(getClass().getResource("/imagenes/menu.png"));
                    Image scaledImage = imageIcon.getImage().getScaledInstance(700,700,Image.SCALE_SMOOTH);
                    ImageIcon resizedIcon = new ImageIcon(scaledImage);
                    imagen_menu = new JLabel(resizedIcon);
                    imagen_menu.setBounds(95,-35,700,700);

                    //Boton de salir
                    btnSalir = new RoundedButton("Salir");
                    btnSalir.setBackground(Color.RED);
                    btnSalir.setForeground(Color.WHITE);
                    btnSalir.setFont(new Font("Arial",Font.BOLD,21));
                    btnSalir.setBounds(795,440,100,40);
                    btnSalir.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

                    //Evento del btnSalir
                    btnSalir.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            //Se cierra el menu
                            cierreVentana();
                            //llama la clase login
                            new login();
                        }
                    });

                    //Se añaden los elementos al panel contenido
                    add(imagen_menu);
                    add(btnSalir);
            }
        }

        //Metodo cierre ventana
    public void cierreVentana(){
        setVisible(false);
    }

}
