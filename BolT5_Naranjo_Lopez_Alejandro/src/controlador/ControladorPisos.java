package controlador;

import com.trolltech.qt.gui.QDialog;

import vista.Reserva;

public class ControladorPisos {

	public static void onBtnPiso1Clicked() {
        QDialog mw = new QDialog(); 
        Reserva reserva = new Reserva();
        reserva.setupUi(mw);
        mw.show();
        
    }

    public static void onBtnPiso2Clicked() {
    	QDialog mw = new QDialog(); 
        Reserva reserva = new Reserva();
        reserva.setupUi(mw);
        mw.show();
        
    }
}
