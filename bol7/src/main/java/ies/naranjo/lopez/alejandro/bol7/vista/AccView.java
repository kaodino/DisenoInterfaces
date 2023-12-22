package ies.naranjo.lopez.alejandro.bol7.vista;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;
import java.util.Map;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import ies.naranjo.lopez.alejandro.bol7.dataBase.userAccDataBase;
import ies.naranjo.lopez.alejandro.bol7.modelo.Account;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.List;

public class AccView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private HashMap<String, Account> userAccounts; // HashMap para almacenar las cuentas de usuario
	private LogInView logInView = new LogInView(); // Ventana de inicio de sesión

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AccView frame = new AccView();
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
	public AccView() {
		// Obtener la instancia de la base de datos de cuentas del usuario
		userAccDataBase userDB = userAccDataBase.getInstance();
		// Obtener las cuentas de usuario almacenadas en la base de datos
		HashMap<String, Account> userAccounts = (HashMap<String, Account>) userDB.getAccounts();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		// Botón para agregar una cuenta
		JButton btnAdd = new JButton("Añadir cuenta");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Abrir la ventana de agregar cuenta
				AddAccView addAccView = new AddAccView();
				addAccView.setVisible(true);
				dispose(); // Cerrar la ventana actual
			}
		});
		btnAdd.setBounds(143, 205, 166, 22);
		contentPane.add(btnAdd);
		
		DefaultListModel<String> modelList = new DefaultListModel<>();
		// Lista para mostrar las cuentas de usuario
		JList<String> list = new JList<>(modelList);
		list.setToolTipText("Cuentas guardadas");
		list.setBounds(143, 42, 166, 157);
		contentPane.add(list);
	}
}
