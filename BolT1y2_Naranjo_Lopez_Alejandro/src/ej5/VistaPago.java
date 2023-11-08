package ej5;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VistaPago extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    VistaPago frame = new VistaPago();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public VistaPago() {
        setTitle("Forma de pago");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 577, 379);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        
        setContentPane(contentPane);
        contentPane.setLayout(null);

        // Crear botones para las formas de pago
        JRadioButton tarjeta = new JRadioButton("Tarjeta");
        tarjeta.setBounds(45, 160, 109, 23);
        contentPane.add(tarjeta);
        
        JRadioButton bizum = new JRadioButton("Bizum");
        bizum.setBounds(240, 160, 109, 23);
        contentPane.add(bizum);
        
        JRadioButton transferencia = new JRadioButton("Transferencia");
        transferencia.setBounds(398, 160, 109, 23);
        contentPane.add(transferencia);
        
        // Agrupar los botones para que solo se pueda seleccionar uno
        ButtonGroup grupo = new ButtonGroup();
        grupo.add(tarjeta);
        grupo.add(bizum);
        grupo.add(transferencia);
        
        // Botón para pagar
        JButton Pagar = new JButton("Pagar");
        Pagar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	// Control de errores
                if (tarjeta.isSelected() || bizum.isSelected() || transferencia.isSelected()) {
                    System.exit(0);
                } else {
                    JOptionPane.showMessageDialog(VistaPago.this, "Debes seleccionar una forma de pago.", "Advertencia", JOptionPane.WARNING_MESSAGE);
                }
            }
        });
        Pagar.setBounds(237, 269, 89, 23);
        contentPane.add(Pagar);
        
        // Etiquetas para mostrar las imágenes de las formas de pago
        JLabel lbltarjeta = new JLabel();
        lbltarjeta.setBounds(35, 53, 109, 100);
        getContentPane().add(lbltarjeta);
        ImageIcon icon = new ImageIcon(VistaPago.class.getResource("/imagenes/tarjeta.png"));
        Image image = icon.getImage();
        Image newImage = image.getScaledInstance(lbltarjeta.getWidth(), lbltarjeta.getHeight(), Image.SCALE_SMOOTH); 
        lbltarjeta.setIcon(new ImageIcon(newImage));
        
        JLabel lblBizum = new JLabel("New label");
        lblBizum.setBounds(207, 53, 119, 100);
        getContentPane().add(lblBizum);
        ImageIcon icon2 = new ImageIcon(VistaPago.class.getResource("/imagenes/bizum.png"));
        Image image2 = icon2.getImage();
        Image newImage2 = image2.getScaledInstance(lblBizum.getWidth(), lblBizum.getHeight(), Image.SCALE_SMOOTH); 
        lblBizum.setIcon(new ImageIcon(newImage2));
        
        JLabel lbltransferencia = new JLabel("New label");
        lbltransferencia.setBounds(398, 53, 109, 100);
        getContentPane().add(lbltransferencia);
        ImageIcon icon3 = new ImageIcon(VistaPago.class.getResource("/imagenes/transferencia.png"));
        Image image3 = icon3.getImage();
        Image newImage3 = image3.getScaledInstance(lbltransferencia.getWidth(), lbltransferencia.getHeight(), Image.SCALE_SMOOTH); 
        lbltransferencia.setIcon(new ImageIcon(newImage3));
    }
}
