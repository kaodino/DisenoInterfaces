package ej1;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class SignUpView extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField UserTf; // Campo de texto para el nombre de usuario
    private JTextField PassTf; // Campo de texto para la contraseña
    private JTextField EmailTf; // Campo de texto para la dirección de correo
    private JButton btnNewButton; // Botón para el registro
    private JButton btnCancelar; // Botón para cancelar el registro

    /**
     * Método principal para ejecutar la ventana de registro.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    SignUpView frame = new SignUpView();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Constructor de la clase SignUpView. Crea la ventana de registro.
     */
    public SignUpView() {
        setResizable(false); // No se puede redimensionar
        setTitle("Registro"); // Título de la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Comportamiento al cerrar
        setBounds(100, 100, 450, 300); // Tamaño y posición

        // Creación del panel principal
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        // Campo de texto para el nombre de usuario
        UserTf = new JTextField();
        UserTf.setBounds(180, 45, 141, 20);
        contentPane.add(UserTf);
        UserTf.setColumns(10);

        // Etiqueta para el nombre de usuario
        JLabel lblUser = new JLabel("Usuario:");
        lblUser.setHorizontalAlignment(SwingConstants.RIGHT);
        lblUser.setFont(new Font("SansSerif", Font.PLAIN, 14));
        lblUser.setBounds(103, 45, 64, 20);
        contentPane.add(lblUser);

        // Etiqueta para la contraseña
        JLabel lblPass = new JLabel("Contraseña:");
        lblPass.setHorizontalAlignment(SwingConstants.RIGHT);
        lblPass.setFont(new Font("SansSerif", Font.PLAIN, 14));
        lblPass.setBounds(80, 89, 87, 22);
        contentPane.add(lblPass);

        // Campo de texto para la contraseña
        PassTf = new JTextField();
        PassTf.setColumns(10);
        PassTf.setBounds(180, 92, 141, 20);
        contentPane.add(PassTf);

        // Etiqueta para la dirección de correo
        JLabel lblEmail = new JLabel("Correo:");
        lblEmail.setHorizontalAlignment(SwingConstants.RIGHT);
        lblEmail.setFont(new Font("SansSerif", Font.PLAIN, 14));
        lblEmail.setBounds(103, 138, 64, 20);
        contentPane.add(lblEmail);

        // Campo de texto para la dirección de correo
        EmailTf = new JTextField();
        EmailTf.setColumns(10);
        EmailTf.setBounds(180, 140, 141, 20);
        contentPane.add(EmailTf);

        // Botón para registrarse
        btnNewButton = new JButton("Registrarse");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = UserTf.getText();
                String password = PassTf.getText();
                String email = EmailTf.getText();

                if (username.isEmpty() || password.isEmpty() || email.isEmpty()) {
                    // Campos vacíos, mostrar un mensaje de advertencia
                    JOptionPane.showMessageDialog(SignUpView.this, "Por favor, rellene todos los campos para continuar.", "Campos Vacíos", JOptionPane.WARNING_MESSAGE);
                } else {
                    // Crear una instancia de UsersDataBase para agregar las credenciales del usuario
                    UsersDataBase dataBase = new UsersDataBase();
                    dataBase.addUserCredentials(username, password);

                    // Mostrar la ventana de inicio de sesión (LogInView) después de registrarse
                    LogInView logInView = new LogInView();
                    logInView.setVisible(true);
                    dispose(); // Cierra la ventana actual
                }
            }
        });
        btnNewButton.setBounds(262, 208, 89, 23);
        contentPane.add(btnNewButton);

        // Botón para cancelar el registro
        btnCancelar = new JButton("Cancelar");
        btnCancelar.setBounds(103, 208, 89, 23);
        contentPane.add(btnCancelar);
    }
}
