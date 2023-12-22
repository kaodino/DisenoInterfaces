package ies.naranjo.lopez.alejandro.bol7.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import ies.naranjo.lopez.alejandro.bol7.vista.AccView;
import ies.naranjo.lopez.alejandro.bol7.vista.LogInView;
import ies.naranjo.lopez.alejandro.bol7.vista.SignUpView;

public class LogInControlador implements ActionListener {
	private JButton btnLogIn, btnSignUp;
	private JTextField UserTf; // Campo de texto para el nombre de usuario
	private JPasswordField PassTf; // Campo de texto para la contraseña
	private LogInView logInView;

	public LogInControlador(LogInView logInView, JButton btnLogIn, JButton btnSignUp, JTextField UserTf,
			JPasswordField PassTf) {
		this.logInView = logInView;
		this.btnLogIn = btnLogIn;
		this.btnSignUp = btnSignUp;
		this.UserTf = UserTf;
		this.PassTf = PassTf;
	}

	public void init() {
		btnLogIn.addActionListener(this); // Asociar este controlador al botón de inicio de sesión
		btnSignUp.addActionListener(this); // Asociar este controlador al botón de registro
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnLogIn) {
			// Obtener el nombre de usuario introducido en el campo de texto
			String username = UserTf.getText();
			// Obtener la contraseña introducida en el campo de contraseña
			String password = PassTf.getText();

			if (username.isEmpty() || password.isEmpty()) {
				// Campos vacíos, mostrar un mensaje de advertencia
				JOptionPane.showMessageDialog(logInView, "Por favor, rellene ambos campos para continuar.",
						"Campos Vacíos", JOptionPane.WARNING_MESSAGE);
			} else {
				// Verificar las credenciales en la base de datos
				if (username.equals("kaodino") && password.equals("123456")) {
					// Credenciales válidas, cambiar a la pantalla AccView
					AccView accView = new AccView();
					accView.setVisible(true);
					logInView.dispose(); // Cierra la ventana actual
				} else {
					// Credenciales incorrectas, mostrar un mensaje de error
					JOptionPane.showMessageDialog(logInView,
							"Usuario o contraseña incorrectos. Por favor, inténtelo de nuevo.",
							"Credenciales Incorrectas", JOptionPane.ERROR_MESSAGE);
				}
			}

		} else if (e.getSource() == btnSignUp) {
			SignUpView signUpView = new SignUpView();
			signUpView.setVisible(true);
			logInView.dispose();
		}
	}
}
