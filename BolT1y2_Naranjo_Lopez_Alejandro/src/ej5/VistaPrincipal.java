package ej5;

import java.awt.EventQueue;
import java.awt.Font;
import java.util.Iterator;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VistaPrincipal extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private VistaPago vistaPago;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    VistaPrincipal frame = new VistaPrincipal();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public VistaPrincipal() {
        // Configuración de la ventana principal
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 530, 397);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        // Etiqueta de encabezado
        JLabel head1 = new JLabel("Confirmación de compra de entradas");
        head1.setHorizontalAlignment(SwingConstants.CENTER);
        head1.setFont(new Font("SansSerif", Font.PLAIN, 22));
        head1.setBounds(98, 11, 372, 43);
        contentPane.add(head1);

        // Otra etiqueta de encabezado
        JLabel head2 = new JLabel("en apoyo a las víctimas de la POO");
        head2.setFont(new Font("SansSerif", Font.PLAIN, 20));
        head2.setHorizontalAlignment(SwingConstants.CENTER);
        head2.setBounds(118, 46, 329, 49);
        contentPane.add(head2);

        // Etiqueta para seleccionar el número de entradas
        JLabel nEntradas = new JLabel("Seleccione el nº de entradas");
        nEntradas.setBounds(213, 106, 195, 22);
        contentPane.add(nEntradas);

        // ComboBox para seleccionar el número de entradas
        JComboBox entradas = new JComboBox();
        entradas.setBounds(241, 156, 50, 22);
        contentPane.add(entradas);

        // Agregar opciones al ComboBox
        entradas.addItem(1);
        entradas.addItem(2);
        entradas.addItem(3);
        entradas.addItem(4);
        entradas.addItem(5);
        entradas.addItem(6);
        entradas.addItem(7);
        entradas.addItem(8);
        entradas.addItem(9);

        // Botón para cancelar la aplicación
        JButton cancelar = new JButton("Cancelar");
        cancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        cancelar.setBounds(98, 273, 89, 23);
        contentPane.add(cancelar);

        // Crear una instancia de VistaPago (ventana de pago) pero mantenerla oculta
        vistaPago = new VistaPago();
        vistaPago.setVisible(false);

        // Botón para confirmar y mostrar la ventana de pago
        JButton Confirmar = new JButton("Confirmar");
        Confirmar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Mostrar la ventana de pago y ocultar esta ventana principal
                vistaPago.setVisible(true);
                VistaPrincipal.this.setVisible(false);
            }
        });
        Confirmar.setBounds(358, 273, 112, 22);
        contentPane.add(Confirmar);
    }
}
