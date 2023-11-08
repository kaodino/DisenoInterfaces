package ej3;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

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
		logoTwitter.setBounds(140, 210, 257, 290);
		getContentPane().add(logoTwitter);
		ImageIcon iconTw = new ImageIcon(getClass().getResource("/imagenes/logo-white.png"));
		Image imgTw = iconTw.getImage().getScaledInstance(logoTwitter.getWidth(), logoTwitter.getHeight(), Image.SCALE_SMOOTH);
        logoTwitter.setIcon(new ImageIcon(imgTw));
        
        JLabel logoGoogle = new JLabel();
        logoGoogle.setHorizontalAlignment(SwingConstants.CENTER);
        logoGoogle.setBounds(513, 362, 23, 23);
		logoGoogle.setForeground(new Color(255, 255, 255));
		ImageIcon iconG = new ImageIcon(getClass().getResource("/imagenes/googleIcono.png"));
		Image imgG = iconG.getImage().getScaledInstance(logoGoogle.getWidth(), logoGoogle.getHeight(), Image.SCALE_SMOOTH);
		logoGoogle.setIcon(new ImageIcon(imgG));
		contentPane.add(logoGoogle);
		
		BotonRedondeado registroGoogle = new BotonRedondeado("Registrarse con Google");
		registroGoogle.setIcon(null);
		registroGoogle.setFont(new Font("SansSerif", Font.PLAIN, 11));
		registroGoogle.setBounds(471, 362, 257, 23);
		contentPane.add(registroGoogle);
		
		JLabel logoApple = new JLabel();
		logoApple.setForeground(new Color(255, 255, 255));
		logoApple.setHorizontalAlignment(SwingConstants.CENTER);
		logoApple.setBounds(513, 396, 19, 23);
		ImageIcon iconA = new ImageIcon(getClass().getResource("/imagenes/apple.png"));
		Image imgA = iconA.getImage().getScaledInstance(logoApple.getWidth(), logoApple.getHeight(), Image.SCALE_SMOOTH);
		logoApple.setIcon(new ImageIcon(imgA));
		contentPane.add(logoApple);
		
		BotonRedondeado registroApple = new BotonRedondeado("Registrarse con Apple");
		registroApple.setBounds(471, 396, 257, 23);
		contentPane.add(registroApple);
		
		BotonRedondeado crearCuenta = new BotonRedondeado("Crear cuenta");
		crearCuenta.setBackground(new Color(26, 168, 236));
		crearCuenta.setBounds(471, 478, 257, 23);
		contentPane.add(crearCuenta);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(471, 453, 116, 2);
		contentPane.add(separator);
		
		JLabel uneteHoylbl = new JLabel("Únete Hoy");
		uneteHoylbl.setFont(new Font("SansSerif", Font.BOLD, 40));
		uneteHoylbl.setForeground(new Color(255, 255, 255));
		uneteHoylbl.setBounds(471, 258, 201, 52);
		contentPane.add(uneteHoylbl);
		
		JLabel head1 = new JLabel("Lo que está");
		head1.setFont(new Font("Tahoma", Font.BOLD, 60));
		head1.setForeground(new Color(255, 255, 255));
		head1.setBounds(471, 91, 360, 57);
		contentPane.add(head1);
		
		JLabel lblPasandoAhora = new JLabel("pasando ahora");
		lblPasandoAhora.setForeground(Color.WHITE);
		lblPasandoAhora.setFont(new Font("Tahoma", Font.BOLD, 60));
		lblPasandoAhora.setBounds(471, 159, 477, 62);
		contentPane.add(lblPasandoAhora);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(612, 453, 116, 2);
		contentPane.add(separator_1);
		
		JLabel lblNewLabel = new JLabel("o");
		lblNewLabel.setFont(new Font("SansSerif", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(586, 444, 29, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Al registrarte, aceptas los Términos de servicio y la Política ");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setFont(new Font("SansSerif", Font.PLAIN, 9));
		lblNewLabel_1.setForeground(new Color(192, 192, 192));
		lblNewLabel_1.setBounds(471, 501, 257, 17);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("de privacidad, incluida la política de Uso de Cookies.");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_1_1.setFont(new Font("SansSerif", Font.PLAIN, 9));
		lblNewLabel_1_1.setBounds(471, 518, 257, 17);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("¿Ya tienes una cuenta?");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblNewLabel_2.setBounds(471, 577, 175, 23);
		contentPane.add(lblNewLabel_2);
		
		BotonRedondeado btnNewButton = new BotonRedondeado("Iniciar sesión");
		btnNewButton.setBounds(471, 611, 257, 23);
		contentPane.add(btnNewButton);
		
		JLabel foot1 = new JLabel("Información   Descarga la app de X   Centro de Ayuda   Condiciones de Servicio   Política de Privacidad   Política de cookies   Accesibilidad   Información de anuncios   Blog   Estado   Empleos   Recursos para marcas");
		foot1.setFont(new Font("SansSerif", Font.PLAIN, 9));
		foot1.setForeground(new Color(255, 255, 255));
		foot1.setHorizontalAlignment(SwingConstants.CENTER);
		foot1.setBounds(0, 665, 995, 17);
		contentPane.add(foot1);
		
		JLabel lblPublicidad = new JLabel("Publicidad   Marketing   X para empresas   Desarrolladores   Guía   Configuración   © 2023 X Corp.");
		lblPublicidad.setHorizontalAlignment(SwingConstants.CENTER);
		lblPublicidad.setForeground(Color.WHITE);
		lblPublicidad.setFont(new Font("SansSerif", Font.PLAIN, 9));
		lblPublicidad.setBounds(0, 690, 995, 17);
		contentPane.add(lblPublicidad);
		
		
		
	}
}
