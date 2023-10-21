package bolt1y2;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSeparator;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Ej3 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ej3 frame = new Ej3();
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
	public Ej3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1021, 768);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JLabel logoTwitter = new JLabel();
//		logoTwitter.setIcon(new ImageIcon("C:\\Users\\kaodino\\Documents\\GitHub\\Interfaces\\recursos\\Xlogo.webp"));
		logoTwitter.setBounds(55, 145, 270, 284);
		getContentPane().add(logoTwitter);
//		contentPane.add(logoTwitter);
		ImageIcon icon = new ImageIcon("C:\\Users\\kaodino\\Documents\\GitHub\\Interfaces\\recursos\\logo-white.png");
		Image img = icon.getImage().getScaledInstance(logoTwitter.getWidth(), logoTwitter.getHeight(), Image.SCALE_SMOOTH);
        logoTwitter.setIcon(new ImageIcon(img));
        
        
        
        JLabel logoGoogle = new JLabel("");
		logoGoogle.setForeground(new Color(255, 255, 255));
		logoGoogle.setIcon(new ImageIcon(Ej3.class.getResource("assets/7123025_logo_google_g_icon.png")));
		logoGoogle.setBounds(471, 288, 48, 35);
		contentPane.add(logoGoogle);
		
		JButton registroGoogle = new JButton("Registrarse con Google");
		registroGoogle.setBounds(440, 300, 257, 23);
		contentPane.add(registroGoogle);
		
		JButton registroApple = new JButton("Registrarse con Apple");
		registroApple.setBounds(440, 346, 257, 23);
		contentPane.add(registroApple);
		
		JButton crearCuenta = new JButton("Crear cuenta");
		crearCuenta.setBounds(440, 406, 257, 23);
		contentPane.add(crearCuenta);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(440, 393, 116, 2);
		contentPane.add(separator);
		
		JLabel uneteHoylbl = new JLabel("Únete Hoy");
		uneteHoylbl.setFont(new Font("SansSerif", Font.BOLD, 40));
		uneteHoylbl.setForeground(new Color(255, 255, 255));
		uneteHoylbl.setBounds(440, 225, 201, 52);
		contentPane.add(uneteHoylbl);
		
		JLabel head1 = new JLabel("Lo que está");
		head1.setFont(new Font("Tahoma", Font.BOLD, 60));
		head1.setForeground(new Color(255, 255, 255));
		head1.setBounds(440, 47, 360, 57);
		contentPane.add(head1);
		
		JLabel lblPasandoAhora = new JLabel("pasando ahora");
		lblPasandoAhora.setForeground(Color.WHITE);
		lblPasandoAhora.setFont(new Font("Tahoma", Font.BOLD, 60));
		lblPasandoAhora.setBounds(440, 129, 477, 62);
		contentPane.add(lblPasandoAhora);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(581, 393, 116, 2);
		contentPane.add(separator_1);
		
		JLabel lblNewLabel = new JLabel("o");
		lblNewLabel.setFont(new Font("SansSerif", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(553, 380, 29, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(326, 557, 66, 52);
		ImageIcon icon2 = new ImageIcon(Ej3.class.getResource("/assets/7123025_logo_google_g_icon.png"));
		lblNewLabel_1.setIcon(icon2);
		contentPane.add(lblNewLabel_1);
		
		
		
		
	}
}
