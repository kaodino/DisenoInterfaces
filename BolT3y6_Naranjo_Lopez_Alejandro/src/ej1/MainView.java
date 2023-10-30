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

public class MainView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
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
	 * Create the frame.
	 */
	public MainView() {
		setResizable(false);
		setTitle("Gestor de contraseñas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnLogIn = new JButton("Iniciar Sesion");
		btnLogIn.setBounds(258, 149, 103, 23);
		contentPane.add(btnLogIn);
		
		JButton btnSignUp = new JButton("Registrarse");
		btnSignUp.setBounds(54, 149, 89, 23);
		contentPane.add(btnSignUp);
		
		JLabel lblHead = new JLabel("Bienvenido al gestor de contraseñas local");
		lblHead.setFont(new Font("SansSerif", Font.PLAIN, 15));
		lblHead.setHorizontalAlignment(SwingConstants.CENTER);
		lblHead.setBounds(54, 57, 307, 49);
		contentPane.add(lblHead);
	}
}
