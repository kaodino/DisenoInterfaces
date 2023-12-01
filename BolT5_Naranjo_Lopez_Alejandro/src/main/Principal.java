package main;

import com.trolltech.qt.gui.QApplication;
import com.trolltech.qt.gui.QMainWindow;

import controlador.ControladorInicio;
import vista.Inicio;

public class Principal {

    public static void main(String[] args) {
        QApplication.initialize(args);

        // Crea la ventana principal
        QMainWindow mainWindow = new QMainWindow();

        // Crea la instancia del modelo, vista y controlador
        Inicio ventanaInicio = new Inicio();
        ControladorInicio controlador = new ControladorInicio(ventanaInicio);

        // Configura la interfaz de usuario y muestra la ventana principal
        ventanaInicio.setupUi(mainWindow);
        mainWindow.show();

        // Ejecuta la aplicación
        QApplication.execStatic();
    }
}
