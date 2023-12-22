package ies.naranjo.lopez.alejandro.bol7.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import ies.naranjo.lopez.alejandro.bol7.vista.LogInView;
import ies.naranjo.lopez.alejandro.bol7.vista.SignUpView;

public class SignUpControlador implements ActionListener{
	private JTextField UserTf; // Campo de texto para el nombre de usuario
    private JTextField PassTf; // Campo de texto para la contraseña
    private JTextField EmailTf; // Campo de texto para la dirección de correo
    private JButton btnSignUp; // Botón para el registro
    private JButton btnCancelar; // Botón para cancelar el registro
    private SignUpView signUpView;
	
    public void init() {
		btnCancelar.addActionListener(this); // Asociar este controlador al botón de inicio de sesión
		btnSignUp.addActionListener(this); // Asociar este controlador al botón de registro
	}
    
	public SignUpControlador(SignUpView signUpView ,JTextField userTf, JTextField passTf, JTextField emailTf, JButton btnSignUp,
			JButton btnCancelar) {
		super();
		UserTf = userTf;
		PassTf = passTf;
		EmailTf = emailTf;
		this.btnSignUp = btnSignUp;
		this.btnCancelar = btnCancelar;
		this.signUpView = signUpView;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnSignUp) {
			String username = UserTf.getText();
            String password = PassTf.getText();
            String email = EmailTf.getText();

            if (username.isEmpty() || password.isEmpty() || email.isEmpty()) {
                // Campos vacíos, mostrar un mensaje de advertencia
                JOptionPane.showMessageDialog(signUpView, "Por favor, rellene todos los campos para continuar.", "Campos Vacíos", JOptionPane.WARNING_MESSAGE);
            } else {

                // Mostrar la ventana de inicio de sesión (LogInView) después de registrarse
                LogInView logInView = new LogInView();
                logInView.setVisible(true);
                signUpView.dispose(); // Cierra la ventana actual
            }
        } else if (e.getSource() == btnCancelar) {
        	LogInView logInView = new LogInView();
			logInView.setVisible(true);
			signUpView.dispose();
        }
		
	}

}
