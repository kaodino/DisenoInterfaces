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
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class AddAccView extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField webSiteTf;
    private JTextField textField;
    private JTextField textField_1;
    private LogInView logIn = new LogInView();

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    AddAccView frame = new AddAccView();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public AddAccView() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        // Etiqueta para el nombre del sitio web
        JLabel lblWebSite = new JLabel("Nombre del sitio web:");
        lblWebSite.setBounds(72, 63, 108, 32);
        contentPane.add(lblWebSite);

        // Campo de texto para el nombre del sitio web
        webSiteTf = new JTextField();
        webSiteTf.setBounds(190, 69, 137, 20);
        contentPane.add(webSiteTf);
        webSiteTf.setColumns(10);

        // Campo de texto para el nombre de usuario
        textField = new JTextField();
        textField.setColumns(10);
        textField.setBounds(190, 120, 137, 20);
        contentPane.add(textField);

        // Campo de texto para la contraseña
        textField_1 = new JTextField();
        textField_1.setColumns(10);
        textField_1.setBounds(190, 172, 137, 20);
        contentPane.add(textField_1);

        // Etiqueta para el usuario
        JLabel lblUser = new JLabel("Usuario:");
        lblUser.setVerticalAlignment(SwingConstants.BOTTOM);
        lblUser.setHorizontalAlignment(SwingConstants.RIGHT);
        lblUser.setBounds(72, 108, 108, 32);
        contentPane.add(lblUser);

        // Etiqueta para la contraseña
        JLabel lblPass = new JLabel("Contraseña:");
        lblPass.setVerticalAlignment(SwingConstants.BOTTOM);
        lblPass.setHorizontalAlignment(SwingConstants.RIGHT);
        lblPass.setBounds(72, 160, 108, 32);
        contentPane.add(lblPass);

        // Botón para agregar una cuenta
        JButton btnAdd = new JButton("Añadir");
        btnAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Obtener el nombre de usuario introducido en LogInView
                LogInView logInView = new LogInView();
                String enteredUsername = logInView.getEnteredUsername();

                // Obtener el contenido de los campos de texto
                String webSite = webSiteTf.getText();
                String username = textField.getText();
                String password = textField_1.getText();

                // Verificar si los campos están llenos
                if (!webSite.isEmpty() && !username.isEmpty() && !password.isEmpty()) {
                    // Obtener la instancia de la base de datos de cuentas del usuario actual
                    userAccDataBase userAccDataBase = new userAccDataBase(enteredUsername);

                    // Agregar la cuenta a la base de datos
                    userAccDataBase.addAccount(webSite, username, password);

                    // Mostrar un mensaje de éxito
                    JOptionPane.showMessageDialog(AddAccView.this, "Cuenta agregada exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);

                } else {
                    // Mostrar un mensaje de error si algún campo está vacío
                    JOptionPane.showMessageDialog(AddAccView.this, "Por favor, complete todos los campos para agregar una cuenta.", "Campos Vacíos", JOptionPane.WARNING_MESSAGE);
                }
            }
        });
        btnAdd.setBounds(311, 212, 89, 23);
        contentPane.add(btnAdd);

        // Botón para cancelar
        JButton btnBack = new JButton("Cancelar");
        btnBack.setBounds(65, 212, 89, 23);
        contentPane.add(btnBack);
    }
}
