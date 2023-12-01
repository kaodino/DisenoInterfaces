/********************************************************************************
 ** Form generated from reading ui file 'Inicio.jui'
 **
 ** Created by: Qt User Interface Compiler version 4.8.6
 **
 ** WARNING! All changes made in this file will be lost when recompiling ui file!
 ********************************************************************************/

package vista;
import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

import controlador.ControladorInicio;

public class Inicio implements com.trolltech.qt.QUiForm<QMainWindow>
{
    public QAction actionPido_1;
    public QAction actionPiso_2;
    public QWidget centralwidget;
    public QLabel label;
    public QWidget verticalLayoutWidget;
    public QVBoxLayout verticalLayout;
    public QPushButton btnPisos;
    public QPushButton btnReservar;
    public QStatusBar statusbar;
    public QMainWindow mainWindow;
    public Inicio() { super(); }

    public void setupUi(QMainWindow MainWindow)
    {
    	this.mainWindow = MainWindow;
        MainWindow.setObjectName("MainWindow");
        MainWindow.resize(new QSize(825, 519).expandedTo(MainWindow.minimumSizeHint()));
        actionPido_1 = new QAction(MainWindow);
        actionPido_1.setObjectName("actionPido_1");
        actionPiso_2 = new QAction(MainWindow);
        actionPiso_2.setObjectName("actionPiso_2");
        centralwidget = new QWidget(MainWindow);
        centralwidget.setObjectName("centralwidget");
        label = new QLabel(centralwidget);
        label.setObjectName("label");
        label.setGeometry(new QRect(20, 10, 791, 481));
        QPalette palette= new QPalette();
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.WindowText, new QColor(0, 0, 0));
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Button, new QColor(170, 170, 127));
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Light, new QColor(255, 255, 191));
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Midlight, new QColor(212, 212, 159));
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Dark, new QColor(85, 85, 63));
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Mid, new QColor(113, 113, 84));
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Text, new QColor(0, 0, 0));
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.BrightText, new QColor(255, 255, 255));
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.ButtonText, new QColor(0, 0, 0));
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Base, new QColor(255, 255, 255));
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Window, new QColor(170, 170, 127));
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Shadow, new QColor(0, 0, 0));
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.AlternateBase, new QColor(212, 212, 191));
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.ToolTipBase, new QColor(255, 255, 220));
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.ToolTipText, new QColor(0, 0, 0));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.WindowText, new QColor(0, 0, 0));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Button, new QColor(170, 170, 127));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Light, new QColor(255, 255, 191));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Midlight, new QColor(212, 212, 159));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Dark, new QColor(85, 85, 63));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Mid, new QColor(113, 113, 84));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Text, new QColor(0, 0, 0));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.BrightText, new QColor(255, 255, 255));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.ButtonText, new QColor(0, 0, 0));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Base, new QColor(255, 255, 255));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Window, new QColor(170, 170, 127));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Shadow, new QColor(0, 0, 0));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.AlternateBase, new QColor(212, 212, 191));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.ToolTipBase, new QColor(255, 255, 220));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.ToolTipText, new QColor(0, 0, 0));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.WindowText, new QColor(85, 85, 63));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Button, new QColor(170, 170, 127));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Light, new QColor(255, 255, 191));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Midlight, new QColor(212, 212, 159));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Dark, new QColor(85, 85, 63));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Mid, new QColor(113, 113, 84));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Text, new QColor(85, 85, 63));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.BrightText, new QColor(255, 255, 255));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.ButtonText, new QColor(85, 85, 63));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Base, new QColor(170, 170, 127));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Window, new QColor(170, 170, 127));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Shadow, new QColor(0, 0, 0));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.AlternateBase, new QColor(170, 170, 127));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.ToolTipBase, new QColor(255, 255, 220));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.ToolTipText, new QColor(0, 0, 0));
        label.setPalette(palette);
        label.setPixmap(new QPixmap(("../../../../Users/Kaodino/Downloads/apartamento.png")));
        label.setScaledContents(true);
        verticalLayoutWidget = new QWidget(centralwidget);
        verticalLayoutWidget.setObjectName("verticalLayoutWidget");
        verticalLayoutWidget.setGeometry(new QRect(380, 140, 131, 151));
        verticalLayout = new QVBoxLayout(verticalLayoutWidget);
        verticalLayout.setObjectName("verticalLayout");
        btnPisos = new QPushButton(verticalLayoutWidget);
        btnPisos.setObjectName("btnPisos");

        btnPisos.clicked.connect(this, "onBtnPisosClicked()");
        
        
        
        verticalLayout.addWidget(btnPisos);

        btnReservar = new QPushButton(verticalLayoutWidget);
        btnReservar.setObjectName("btnReservar");
        QPalette palette1= new QPalette();
        palette1.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.WindowText, new QColor(0, 0, 0));
        palette1.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Button, new QColor(255, 255, 255));
        palette1.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Light, new QColor(255, 255, 255));
        palette1.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Midlight, new QColor(255, 255, 255));
        palette1.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Dark, new QColor(127, 127, 127));
        palette1.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Mid, new QColor(170, 170, 170));
        palette1.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Text, new QColor(0, 0, 0));
        palette1.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.BrightText, new QColor(255, 255, 255));
        palette1.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.ButtonText, new QColor(0, 0, 0));
        palette1.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Base, new QColor(255, 255, 255));
        palette1.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Window, new QColor(255, 255, 255));
        palette1.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Shadow, new QColor(0, 0, 0));
        palette1.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.AlternateBase, new QColor(255, 255, 255));
        palette1.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.ToolTipBase, new QColor(255, 255, 220));
        palette1.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.ToolTipText, new QColor(0, 0, 0));
        palette1.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.WindowText, new QColor(0, 0, 0));
        palette1.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Button, new QColor(255, 255, 255));
        palette1.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Light, new QColor(255, 255, 255));
        palette1.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Midlight, new QColor(255, 255, 255));
        palette1.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Dark, new QColor(127, 127, 127));
        palette1.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Mid, new QColor(170, 170, 170));
        palette1.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Text, new QColor(0, 0, 0));
        palette1.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.BrightText, new QColor(255, 255, 255));
        palette1.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.ButtonText, new QColor(0, 0, 0));
        palette1.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Base, new QColor(255, 255, 255));
        palette1.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Window, new QColor(255, 255, 255));
        palette1.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Shadow, new QColor(0, 0, 0));
        palette1.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.AlternateBase, new QColor(255, 255, 255));
        palette1.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.ToolTipBase, new QColor(255, 255, 220));
        palette1.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.ToolTipText, new QColor(0, 0, 0));
        palette1.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.WindowText, new QColor(127, 127, 127));
        palette1.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Button, new QColor(255, 255, 255));
        palette1.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Light, new QColor(255, 255, 255));
        palette1.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Midlight, new QColor(255, 255, 255));
        palette1.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Dark, new QColor(127, 127, 127));
        palette1.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Mid, new QColor(170, 170, 170));
        palette1.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Text, new QColor(127, 127, 127));
        palette1.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.BrightText, new QColor(255, 255, 255));
        palette1.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.ButtonText, new QColor(127, 127, 127));
        palette1.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Base, new QColor(255, 255, 255));
        palette1.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Window, new QColor(255, 255, 255));
        palette1.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Shadow, new QColor(0, 0, 0));
        palette1.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.AlternateBase, new QColor(255, 255, 255));
        palette1.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.ToolTipBase, new QColor(255, 255, 220));
        palette1.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.ToolTipText, new QColor(0, 0, 0));
        btnReservar.setPalette(palette1);

        verticalLayout.addWidget(btnReservar);

        MainWindow.setCentralWidget(centralwidget);
        statusbar = new QStatusBar(MainWindow);
        statusbar.setObjectName("statusbar");
        MainWindow.setStatusBar(statusbar);
        retranslateUi(MainWindow);

        btnReservar.clicked.connect(this, "onBtnReservarClicked()");
        
        MainWindow.connectSlotsByName();
    } // setupUi

    void retranslateUi(QMainWindow MainWindow)
    {
        MainWindow.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "MainWindow", null));
        actionPido_1.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "piso 1", null));
        actionPiso_2.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "piso 2", null));
        label.setText("");
        btnPisos.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Nuestros pisos", null));
        btnReservar.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Reservar", null));
    } // retranslateUi

    private void onBtnReservarClicked() {
    	ControladorInicio.onBtnReservarClicked();
    	mainWindow.close();
    }
    
    private void onBtnPisosClicked() {
    	ControladorInicio.onBtnPisosClicked();
    	mainWindow.close();
    }
}

