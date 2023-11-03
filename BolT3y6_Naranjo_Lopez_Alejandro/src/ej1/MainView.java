package ej1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainView extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    /**
     * Método principal para ejecutar la aplicación.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MainView frame = new MainView();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Constructor de la clase MainView. Crea la ventana principal de la aplicación.
     */
    public MainView() {
        // Configuración de la ventana
        setResizable(false); // No se puede redimensionar
        setIconImage(Toolkit.getDefaultToolkit().getImage(MainView.class.getResource("/imagenes/Logo.jpg"))); // Icono de la ventana
        setTitle("Smart Pass"); // Título de la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Comportamiento al cerrar
        setBounds(100, 100, 450, 300); // Tamaño y posición

        // Creación del panel principal
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        // Botón "Iniciar Sesión"
        JButton btnLogIn = new JButton("Iniciar Sesion");
        btnLogIn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Mostrar la ventana LogInView al hacer clic en el botón
                LogInView logInView = new LogInView();
                logInView.setVisible(true);
                dispose(); // Cierra la ventana actual
            }
        });
        btnLogIn.setBounds(321, 227, 103, 23);
        contentPane.add(btnLogIn);

        // Botón "Registrarse"
        JButton btnSignUp = new JButton("Registrarse");
        btnSignUp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Mostrar la ventana SignUpView al hacer clic en el botón
                SignUpView signUpView = new SignUpView();
                signUpView.setVisible(true);
                dispose(); // Cierra la ventana actual
            }
        });
        btnSignUp.setBounds(10, 227, 89, 23);
        contentPane.add(btnSignUp);

        // Etiqueta para el logo o encabezado
        JLabel lblHead = new JLabel("");
        lblHead.setIcon(new ImageIcon(MainView.class.getResource("/imagenes/Logo-removebg.png")));
        lblHead.setFont(new Font("SansSerif", Font.PLAIN, 15));
        lblHead.setHorizontalAlignment(SwingConstants.CENTER);
        lblHead.setBounds(54, 11, 314, 197);
        contentPane.add(lblHead);
    }
}
