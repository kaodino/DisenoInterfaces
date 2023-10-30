package ej1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class SignUpView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField UserTf;
	private JTextField PassTf;
	private JTextField EmailTf;

	/**
	 * Launch the application.
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
	 * Create the frame.
	 */
	public SignUpView() {
		setResizable(false);
		setTitle("Registro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		UserTf = new JTextField();
		UserTf.setBounds(180, 79, 141, 20);
		contentPane.add(UserTf);
		UserTf.setColumns(10);
		
		JLabel lblUser = new JLabel("Usuario:");
		lblUser.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUser.setFont(new Font("SansSerif", Font.PLAIN, 14));
		lblUser.setBounds(103, 79, 64, 20);
		contentPane.add(lblUser);
		
		JLabel lblPass = new JLabel("Contraseña:");
		lblPass.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPass.setFont(new Font("SansSerif", Font.PLAIN, 14));
		lblPass.setBounds(80, 135, 87, 22);
		contentPane.add(lblPass);
		
		PassTf = new JTextField();
		PassTf.setColumns(10);
		PassTf.setBounds(180, 138, 141, 20);
		contentPane.add(PassTf);
		
		JLabel lblEmail = new JLabel("Correo:");
		lblEmail.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEmail.setFont(new Font("SansSerif", Font.PLAIN, 14));
		lblEmail.setBounds(103, 194, 64, 20);
		contentPane.add(lblEmail);
		
		EmailTf = new JTextField();
		EmailTf.setColumns(10);
		EmailTf.setBounds(180, 196, 141, 20);
		contentPane.add(EmailTf);
	}
}
