
/********************************************************************************
 ** Form generated from reading ui file 'reserva.jui'
 **
 ** Created by: Qt User Interface Compiler version 4.8.6
 **
 ** WARNING! All changes made in this file will be lost when recompiling ui file!
 ********************************************************************************/

package vista;
import java.awt.Dialog;

import com.trolltech.qt.core.QRect;
import com.trolltech.qt.core.QSize;
import com.trolltech.qt.gui.QComboBox;
import com.trolltech.qt.gui.QDateEdit;
import com.trolltech.qt.gui.QDialog;
import com.trolltech.qt.gui.QHBoxLayout;
import com.trolltech.qt.gui.QLabel;
import com.trolltech.qt.gui.QLineEdit;
import com.trolltech.qt.gui.QPushButton;
import com.trolltech.qt.gui.QWidget;

import controlador.ControladorReserva;

public class Reserva implements com.trolltech.qt.QUiForm<QDialog>
{
    public QWidget horizontalLayoutWidget;
    public QHBoxLayout horizontalLayout;
    public QLabel label;
    public QDateEdit dateEdit;
    public QWidget horizontalLayoutWidget_2;
    public QHBoxLayout horizontalLayout_2;
    public QLabel label_2;
    public QLineEdit lineEdit;
    public QWidget horizontalLayoutWidget_3;
    public QHBoxLayout horizontalLayout_3;
    public QLabel label_3;
    public QLineEdit lineEdit_2;
    public QWidget horizontalLayoutWidget_4;
    public QHBoxLayout horizontalLayout_4;
    public QLabel label_4;
    public QLineEdit lineEdit_3;
    public QWidget horizontalLayoutWidget_5;
    public QHBoxLayout horizontalLayout_5;
    public QLabel label_5;
    public QDateEdit dateEdit_2;
    public QPushButton btnReserva;
    public QComboBox comboBox;
    public QDialog qDialog;

    public Reserva() { super(); }

    public void setupUi(QDialog Dialog)
    {
    	this.qDialog = Dialog;
        Dialog.setObjectName("Dialog");
        Dialog.resize(new QSize(640, 480).expandedTo(Dialog.minimumSizeHint()));
        horizontalLayoutWidget = new QWidget(Dialog);
        horizontalLayoutWidget.setObjectName("horizontalLayoutWidget");
        horizontalLayoutWidget.setGeometry(new QRect(240, 170, 180, 80));
        horizontalLayout = new QHBoxLayout(horizontalLayoutWidget);
        horizontalLayout.setObjectName("horizontalLayout");
        label = new QLabel(horizontalLayoutWidget);
        label.setObjectName("label");

        horizontalLayout.addWidget(label);

        dateEdit = new QDateEdit(horizontalLayoutWidget);
        dateEdit.setObjectName("dateEdit");

        horizontalLayout.addWidget(dateEdit);

        horizontalLayoutWidget_2 = new QWidget(Dialog);
        horizontalLayoutWidget_2.setObjectName("horizontalLayoutWidget_2");
        horizontalLayoutWidget_2.setGeometry(new QRect(240, 20, 160, 41));
        horizontalLayout_2 = new QHBoxLayout(horizontalLayoutWidget_2);
        horizontalLayout_2.setObjectName("horizontalLayout_2");
        label_2 = new QLabel(horizontalLayoutWidget_2);
        label_2.setObjectName("label_2");

        horizontalLayout_2.addWidget(label_2);

        lineEdit = new QLineEdit(horizontalLayoutWidget_2);
        lineEdit.setObjectName("lineEdit");

        horizontalLayout_2.addWidget(lineEdit);

        horizontalLayoutWidget_3 = new QWidget(Dialog);
        horizontalLayoutWidget_3.setObjectName("horizontalLayoutWidget_3");
        horizontalLayoutWidget_3.setGeometry(new QRect(240, 70, 160, 41));
        horizontalLayout_3 = new QHBoxLayout(horizontalLayoutWidget_3);
        horizontalLayout_3.setObjectName("horizontalLayout_3");
        label_3 = new QLabel(horizontalLayoutWidget_3);
        label_3.setObjectName("label_3");

        horizontalLayout_3.addWidget(label_3);

        lineEdit_2 = new QLineEdit(horizontalLayoutWidget_3);
        lineEdit_2.setObjectName("lineEdit_2");

        horizontalLayout_3.addWidget(lineEdit_2);

        horizontalLayoutWidget_4 = new QWidget(Dialog);
        horizontalLayoutWidget_4.setObjectName("horizontalLayoutWidget_4");
        horizontalLayoutWidget_4.setGeometry(new QRect(240, 120, 161, 41));
        horizontalLayout_4 = new QHBoxLayout(horizontalLayoutWidget_4);
        horizontalLayout_4.setObjectName("horizontalLayout_4");
        label_4 = new QLabel(horizontalLayoutWidget_4);
        label_4.setObjectName("label_4");

        horizontalLayout_4.addWidget(label_4);

        lineEdit_3 = new QLineEdit(horizontalLayoutWidget_4);
        lineEdit_3.setObjectName("lineEdit_3");

        horizontalLayout_4.addWidget(lineEdit_3);

        horizontalLayoutWidget_5 = new QWidget(Dialog);
        horizontalLayoutWidget_5.setObjectName("horizontalLayoutWidget_5");
        horizontalLayoutWidget_5.setGeometry(new QRect(240, 260, 180, 80));
        horizontalLayout_5 = new QHBoxLayout(horizontalLayoutWidget_5);
        horizontalLayout_5.setObjectName("horizontalLayout_5");
        label_5 = new QLabel(horizontalLayoutWidget_5);
        label_5.setObjectName("label_5");

        horizontalLayout_5.addWidget(label_5);

        dateEdit_2 = new QDateEdit(horizontalLayoutWidget_5);
        dateEdit_2.setObjectName("dateEdit_2");

        horizontalLayout_5.addWidget(dateEdit_2);

        btnReserva = new QPushButton(Dialog);
        btnReserva.setObjectName("btnReserva");
        btnReserva.setGeometry(new QRect(290, 430, 75, 23));
        comboBox = new QComboBox(Dialog);
        comboBox.setObjectName("comboBox");
        comboBox.setGeometry(new QRect(290, 350, 69, 22));
        retranslateUi(Dialog);

        btnReserva.clicked.connect(this, "onBtnReservaClicked()");
        
        Dialog.connectSlotsByName();
    } // setupUi

    private void onBtnReservaClicked() {
    	ControladorReserva.onBtnReservaClicked();
    	
    	qDialog.close();
    }
    
    void retranslateUi(QDialog Dialog)
    {
        Dialog.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Dialog", null));
        label.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Fecha de entrada:", null));
        label_2.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Nombre", null));
        label_3.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Apellidos", null));
        label_4.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "N\u00ba de cuenta", null));
        label_5.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Fecha de salida:", null));
        btnReserva.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Reservar", null));
        comboBox.clear();
        comboBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Piso1", null));
        comboBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Piso2", null));
    } // retranslateUi

}

