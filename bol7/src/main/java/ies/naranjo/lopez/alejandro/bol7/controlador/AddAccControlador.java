package ies.naranjo.lopez.alejandro.bol7.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import ies.naranjo.lopez.alejandro.bol7.dataBase.userAccDataBase;
import ies.naranjo.lopez.alejandro.bol7.modelo.Account;
import ies.naranjo.lopez.alejandro.bol7.vista.AccView;
import ies.naranjo.lopez.alejandro.bol7.vista.AddAccView;
import ies.naranjo.lopez.alejandro.bol7.vista.LogInView;

public class AddAccControlador implements ActionListener{

	private AddAccView addAccView;
	private JButton btnAdd, btnBack;
	private JTextField usernameTf, passwordTf,webSiteTf;
	
	
    public AddAccControlador(AddAccView addAccView, JButton btnAdd, JButton btnBack, JTextField usernameTf,
			JTextField passwordTf, JTextField webSiteTf) {
		super();
		this.addAccView = addAccView;
		this.btnAdd = btnAdd;
		this.btnBack = btnBack;
		this.usernameTf = usernameTf;
		this.passwordTf = passwordTf;
		this.webSiteTf = webSiteTf;
	}

	public AddAccControlador(AddAccView addAccView) {
        this.addAccView = addAccView;
    }
    
    public void init() {
		btnAdd.addActionListener(this); // Asociar este controlador al botón de inicio de sesión
		btnBack.addActionListener(this); // Asociar este controlador al botón de registro
	}

    @Override
    public void actionPerformed(ActionEvent e) {
    	ArrayList<Account> AccList = new ArrayList<>();
        if (e.getSource() == btnAdd) {
            // Obtener el nombre de usuario introducido en LogInView
            LogInView logInView = new LogInView();
            String enteredUsername = logInView.getEnteredUsername();

            // Obtener el contenido de los campos de texto
            String webSite = webSiteTf.getText();
            String username = usernameTf.getText();
            String password = passwordTf.getText();

            // Verificar si los campos están llenos
            if (!webSite.isEmpty() && !username.isEmpty() && !password.isEmpty()) {
                // Obtener la instancia de la base de datos de cuentas del usuario actual
                userAccDataBase userAccDataBase = new userAccDataBase(enteredUsername);

                // Agregar la cuenta a la base de datos
                userAccDataBase.addAccount(webSite, username, password);

                // Mostrar un mensaje de éxito
                JOptionPane.showMessageDialog(addAccView, "Cuenta agregada exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);

            } else {
                // Mostrar un mensaje de error si algún campo está vacío
                JOptionPane.showMessageDialog(addAccView, "Por favor, complete todos los campos para agregar una cuenta.", "Campos Vacíos", JOptionPane.WARNING_MESSAGE);
            }
        } else if (e.getSource() == btnBack) {
            // Lógica para el botón de cancelar
            // Cerrar la ventana actual y volver a la ventana anterior, por ejemplo, LogInView
            addAccView.dispose();
            AccView AccView = new AccView();
            AccView.setVisible(true);
        }
    }
}
