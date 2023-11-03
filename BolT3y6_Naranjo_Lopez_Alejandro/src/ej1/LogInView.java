package ej1;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JPasswordField;

public class LogInView extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    public JTextField UserTf; // Campo de texto para el nombre de usuario
    private JPasswordField PassTf; // Campo de texto para la contraseña

    /**
     * Método principal para ejecutar la aplicación.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    LogInView frame = new LogInView();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Constructor de la clase LogInView. Crea la ventana de inicio de sesión.
     */
    public LogInView() {
        // Configura el comportamiento al cerrar la ventana
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Establece el tamaño y la posición de la ventana
        setBounds(100, 100, 450, 300);

        // Crea un panel que actuará como el contenido de la ventana
        contentPane = new JPanel();

        // Establece un borde vacío alrededor del contenido
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        // Asigna el panel como contenido de la ventana
        setContentPane(contentPane);

        // Configura componentes de la ventana
        contentPane.setLayout(null);

        // Etiqueta para "Usuario"
        JLabel lblUser = new JLabel("Usuario:");
        lblUser.setBounds(117, 59, 47, 17);
        contentPane.add(lblUser);

        // Etiqueta para "Contraseña"
        JLabel lblPass = new JLabel("Contraseña: ");
        lblPass.setBounds(101, 110, 63, 17);
        contentPane.add(lblPass);

        // Campo de texto para el nombre de usuario
        UserTf = new JTextField();
        UserTf.setBounds(174, 57, 86, 20);
        contentPane.add(UserTf);
        UserTf.setColumns(10);

        // Botón "Iniciar Sesión"
        JButton btnLogIn = new JButton("Iniciar Sesion");
        btnLogIn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Obtener el nombre de usuario introducido en el campo de texto
                String username = UserTf.getText();
                // Obtener la contraseña introducida en el campo de contraseña
                String password = PassTf.getText();

                if (username.isEmpty() || password.isEmpty()) {
                    // Campos vacíos, mostrar un mensaje de advertencia
                    JOptionPane.showMessageDialog(LogInView.this, "Por favor, rellene ambos campos para continuar.", "Campos Vacíos", JOptionPane.WARNING_MESSAGE);
                } else {
                    // Verificar las credenciales en la base de datos
                    UsersDataBase dataBase = new UsersDataBase();

                    if (dataBase.checkUserCredentials(username, password)) {
                        // Credenciales válidas, cambiar a la pantalla AccView
                        AccView accView = new AccView();
                        accView.setVisible(true);
                        dispose(); // Cierra la ventana actual
                    } else {
                        // Credenciales incorrectas, mostrar un mensaje de error
                        JOptionPane.showMessageDialog(LogInView.this, "Usuario o contraseña incorrectos. Por favor, inténtelo de nuevo.", "Credenciales Incorrectas", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });
        btnLogIn.setBounds(260, 182, 104, 23);
        contentPane.add(btnLogIn);

        // Botón "Atrás"
        JButton btnBack = new JButton("Atras");
        btnBack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MainView mainView = new MainView();
                mainView.setVisible(true);
                dispose();
            }
        });
        btnBack.setBounds(75, 182, 89, 23);
        contentPane.add(btnBack);

        // Campo de contraseña
        PassTf = new JPasswordField();
        PassTf.setBounds(174, 108, 86, 20);
        contentPane.add(PassTf);
    }

    // Método para obtener el nombre de usuario introducido
    public String getEnteredUsername() {
        return UserTf.getText();
    }
}
