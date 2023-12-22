package ies.naranjo.lopez.alejandro.bol7.vista;

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

import ies.naranjo.lopez.alejandro.bol7.controlador.AddAccControlador;
import ies.naranjo.lopez.alejandro.bol7.controlador.LogInControlador;
import ies.naranjo.lopez.alejandro.bol7.dataBase.userAccDataBase;

public class AddAccView extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField webSiteTf;
    private JTextField usernameTf;
    private JTextField passwordTf;
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
        usernameTf = new JTextField();
        usernameTf.setColumns(10);
        usernameTf.setBounds(190, 120, 137, 20);
        contentPane.add(usernameTf);

        // Campo de texto para la contraseña
        passwordTf = new JTextField();
        passwordTf.setColumns(10);
        passwordTf.setBounds(190, 172, 137, 20);
        contentPane.add(passwordTf);

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
        btnAdd.setBounds(311, 212, 89, 23);
        contentPane.add(btnAdd);

        // Botón para cancelar
        JButton btnBack = new JButton("Atrás");
        btnBack.setBounds(65, 212, 89, 23);
        contentPane.add(btnBack);
        
        AddAccControlador controlador = new AddAccControlador(this, btnAdd, btnBack, usernameTf, passwordTf, webSiteTf);
        controlador.init();
    }
}
