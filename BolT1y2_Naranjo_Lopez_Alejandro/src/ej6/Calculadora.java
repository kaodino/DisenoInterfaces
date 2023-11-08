package ej6;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;

public class Calculadora extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	static double num1,num2,result;
	static String operacion, ingresarNums;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
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
	public Calculadora() {
		setResizable(false);
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 302, 273);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 68, 68, 68, 68, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		textField = new JTextField();
		textField.setFont(new Font("SansSerif", Font.PLAIN, 15));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 4;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.BOTH;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 0;
		contentPane.add(textField, gbc_textField);
		textField.setColumns(10);
		
		
		// botones numericos
		
		JButton btnNewButton7 = new JButton("7");
		btnNewButton7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ingresarNums = textField.getText() + btnNewButton7.getText();
				textField.setText(ingresarNums);
			}
		});
		
		JButton btnNewButton8 = new JButton("8");
		btnNewButton8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ingresarNums = textField.getText() + btnNewButton8.getText();
				textField.setText(ingresarNums);
			}
		});
		
		JButton btnNewButton9 = new JButton("9");
		btnNewButton9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ingresarNums = textField.getText() + btnNewButton9.getText();
				textField.setText(ingresarNums);
			}
		});
		
		JButton btnNewButton4 = new JButton("4");
		btnNewButton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ingresarNums = textField.getText() + btnNewButton4.getText();
				textField.setText(ingresarNums);
			}
		});
		
		JButton btnNewButton5 = new JButton("5");
		btnNewButton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ingresarNums = textField.getText() + btnNewButton5.getText();
				textField.setText(ingresarNums);
			}
		});
		
		JButton btnNewButton6 = new JButton("6");
		btnNewButton6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ingresarNums = textField.getText() + btnNewButton6.getText();
				textField.setText(ingresarNums);
			}
		});
		
		JButton btnNewButton1 = new JButton("1");
		btnNewButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ingresarNums = textField.getText() + btnNewButton1.getText();
				textField.setText(ingresarNums);
			}
		});
		
		JButton btnNewButton2 = new JButton("2");
		btnNewButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ingresarNums = textField.getText() + btnNewButton2.getText();
				textField.setText(ingresarNums);
			}
		});
		
		JButton btnNewButton3 = new JButton("3");
		btnNewButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ingresarNums = textField.getText() + btnNewButton3.getText();
				textField.setText(ingresarNums);
			}
		});
		
		JButton btnNewButton0 = new JButton("0");
		btnNewButton0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ingresarNums = textField.getText() + btnNewButton0.getText();
				textField.setText(ingresarNums);
			}
		});
		
		// botones de accion 
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		
		JButton btnSuma = new JButton("+");
		btnSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(textField.getText());
				textField.setText("");
				operacion = "+";
			}
		});
		
		JButton btnResta = new JButton("-");
		btnResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(textField.getText());
				textField.setText("");
				operacion = "-";
			}
		});
		
		JButton btnmultiplicacion = new JButton("*");
		btnmultiplicacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(textField.getText());
				textField.setText("");
				operacion = "*";
			}
		});
		
		JButton btndivision = new JButton("/");
		btndivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(textField.getText());
				textField.setText("");
				operacion = "/";
			}
		});
		
		JButton btnDecimal = new JButton(".");
		btnDecimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ingresarNums = textField.getText() + btnDecimal.getText();
				textField.setText(ingresarNums);
			}
		});
		
		JButton btnIgual = new JButton("=");
		btnIgual.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String seleccionar;  // Variable para formatear el resultado
		        num2 = Double.parseDouble(textField.getText());  // Obtener el segundo número desde el campo de texto

		        // Realizar operaciones basadas en la variable "operacion"
		        if (operacion == "+") {
		            result = num1 + num2;
		        } else if (operacion == "-") {
		            result = num1 - num2;
		        } else if (operacion == "*") {
		            result = num1 * num2;
		        } else {
		            result = num1 / num2;
		        }

		        seleccionar = String.format("%.0f", result);  // Formatear el resultado como una cadena
		        textField.setText(seleccionar);  // Establecer el campo de texto con el resultado formateado
		    }
		});
		
		// Configuración de GridBagConstraints para los botones 
		
		GridBagConstraints gbc_btnBorrar = new GridBagConstraints();
		gbc_btnBorrar.fill = GridBagConstraints.BOTH;
		gbc_btnBorrar.insets = new Insets(0, 0, 5, 5);
		gbc_btnBorrar.gridx = 4;
		gbc_btnBorrar.gridy = 2;
		contentPane.add(btnBorrar, gbc_btnBorrar);
		
		GridBagConstraints gbc_btnNewButton7 = new GridBagConstraints();
		gbc_btnNewButton7.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton7.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton7.gridx = 1;
		gbc_btnNewButton7.gridy = 3;
		contentPane.add(btnNewButton7, gbc_btnNewButton7);
		
		
		GridBagConstraints gbc_btnNewButton8 = new GridBagConstraints();
		gbc_btnNewButton8.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton8.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton8.gridx = 2;
		gbc_btnNewButton8.gridy = 3;
		contentPane.add(btnNewButton8, gbc_btnNewButton8);
		
		
		GridBagConstraints gbc_btnNewButton9 = new GridBagConstraints();
		gbc_btnNewButton9.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton9.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton9.gridx = 3;
		gbc_btnNewButton9.gridy = 3;
		contentPane.add(btnNewButton9, gbc_btnNewButton9);
		
		
		GridBagConstraints gbc_btnSuma = new GridBagConstraints();
		gbc_btnSuma.fill = GridBagConstraints.BOTH;
		gbc_btnSuma.insets = new Insets(0, 0, 5, 5);
		gbc_btnSuma.gridx = 4;
		gbc_btnSuma.gridy = 3;
		contentPane.add(btnSuma, gbc_btnSuma);
		
		
		GridBagConstraints gbc_btnNewButton4 = new GridBagConstraints();
		gbc_btnNewButton4.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton4.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton4.gridx = 1;
		gbc_btnNewButton4.gridy = 4;
		contentPane.add(btnNewButton4, gbc_btnNewButton4);
		
		
		GridBagConstraints gbc_btnNewButton5 = new GridBagConstraints();
		gbc_btnNewButton5.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton5.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton5.gridx = 2;
		gbc_btnNewButton5.gridy = 4;
		contentPane.add(btnNewButton5, gbc_btnNewButton5);
		
		
		GridBagConstraints gbc_btnNewButton6 = new GridBagConstraints();
		gbc_btnNewButton6.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton6.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton6.gridx = 3;
		gbc_btnNewButton6.gridy = 4;
		contentPane.add(btnNewButton6, gbc_btnNewButton6);
		
		
		GridBagConstraints gbc_btnResta = new GridBagConstraints();
		gbc_btnResta.fill = GridBagConstraints.BOTH;
		gbc_btnResta.insets = new Insets(0, 0, 5, 5);
		gbc_btnResta.gridx = 4;
		gbc_btnResta.gridy = 4;
		contentPane.add(btnResta, gbc_btnResta);
		
		
		GridBagConstraints gbc_btnNewButton1 = new GridBagConstraints();
		gbc_btnNewButton1.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton1.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton1.gridx = 1;
		gbc_btnNewButton1.gridy = 5;
		contentPane.add(btnNewButton1, gbc_btnNewButton1);
		
		
		GridBagConstraints gbc_btnNewButton2 = new GridBagConstraints();
		gbc_btnNewButton2.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton2.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton2.gridx = 2;
		gbc_btnNewButton2.gridy = 5;
		contentPane.add(btnNewButton2, gbc_btnNewButton2);
		
		
		GridBagConstraints gbc_btnNewButton3 = new GridBagConstraints();
		gbc_btnNewButton3.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton3.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton3.gridx = 3;
		gbc_btnNewButton3.gridy = 5;
		contentPane.add(btnNewButton3, gbc_btnNewButton3);
		
		
		GridBagConstraints gbc_btnmultiplicacion = new GridBagConstraints();
		gbc_btnmultiplicacion.fill = GridBagConstraints.BOTH;
		gbc_btnmultiplicacion.insets = new Insets(0, 0, 5, 5);
		gbc_btnmultiplicacion.gridx = 4;
		gbc_btnmultiplicacion.gridy = 5;
		contentPane.add(btnmultiplicacion, gbc_btnmultiplicacion);
		
		
		GridBagConstraints gbc_btnDecimal = new GridBagConstraints();
		gbc_btnDecimal.fill = GridBagConstraints.BOTH;
		gbc_btnDecimal.insets = new Insets(0, 0, 0, 5);
		gbc_btnDecimal.gridx = 1;
		gbc_btnDecimal.gridy = 6;
		contentPane.add(btnDecimal, gbc_btnDecimal);
		
		
		GridBagConstraints gbc_btnNewButton0 = new GridBagConstraints();
		gbc_btnNewButton0.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton0.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton0.gridx = 2;
		gbc_btnNewButton0.gridy = 6;
		contentPane.add(btnNewButton0, gbc_btnNewButton0);
		
		
		GridBagConstraints gbc_btnIgual = new GridBagConstraints();
		gbc_btnIgual.fill = GridBagConstraints.BOTH;
		gbc_btnIgual.insets = new Insets(0, 0, 0, 5);
		gbc_btnIgual.gridx = 3;
		gbc_btnIgual.gridy = 6;
		contentPane.add(btnIgual, gbc_btnIgual);
		
		
		GridBagConstraints gbc_btndivision = new GridBagConstraints();
		gbc_btndivision.fill = GridBagConstraints.BOTH;
		gbc_btndivision.insets = new Insets(0, 0, 0, 5);
		gbc_btndivision.gridx = 4;
		gbc_btndivision.gridy = 6;
		contentPane.add(btndivision, gbc_btndivision);	
	}
}
