package controlador;

import com.trolltech.qt.gui.QMainWindow;
import com.trolltech.qt.gui.QMessageBox;
import com.trolltech.qt.gui.QWidget;

import vista.Inicio;
import vista.Reserva;

public class ControladorReserva {

	public static void onBtnReservaClicked() {
		// Crear un QMessageBox de información
        QMessageBox mensaje = new QMessageBox();
        mensaje.setIcon(QMessageBox.Icon.Information);
        mensaje.setText("Reserva realizada exitosamente");
        mensaje.setWindowTitle("Información");
        mensaje.setStandardButtons(QMessageBox.StandardButton.Ok);

        // Mostrar el QMessageBox y esperar a que el usuario haga clic en Ok
        mensaje.exec();
		
		QMainWindow mw = new QMainWindow(); 
        Inicio inicio = new Inicio();
        inicio.setupUi(mw);
        mw.show();
    }
}
