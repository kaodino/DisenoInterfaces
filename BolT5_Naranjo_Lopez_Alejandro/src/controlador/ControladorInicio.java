package controlador;

import com.trolltech.qt.gui.*;

import vista.Inicio; // Asegúrate de importar la clase de la Vista
import vista.NuestrosPisos;
import vista.Reserva;

public class ControladorInicio {

    private Inicio inicio;

    public ControladorInicio(Inicio inicio) {
        this.inicio = inicio;
    }

    // Manejadores de eventos para los botones y acciones
    public static void onBtnPisosClicked() {
        QDialog mw = new QDialog(); 
        NuestrosPisos nuestrosPisos = new NuestrosPisos();
        nuestrosPisos.setupUi(mw);
        mw.show();
        
    }

    public static void onBtnReservarClicked() {
    	QDialog mw = new QDialog(); 
        Reserva reserva = new Reserva();
        reserva.setupUi(mw);
        mw.show();
        
    }
    
}
