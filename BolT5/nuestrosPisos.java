/********************************************************************************
 ** Form generated from reading ui file 'nuestrosPisos.jui'
 **
 ** Created by: Qt User Interface Compiler version 4.8.6
 **
 ** WARNING! All changes made in this file will be lost when recompiling ui file!
 ********************************************************************************/
import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class Ui_Dialog implements com.trolltech.qt.QUiForm<QDialog>
{
    public QLabel label;
    public QLabel label_2;
    public QPushButton btnPiso1;
    public QPushButton btnPiso2;
    public QLabel lblDescriptionP2;
    public QTextEdit textEdit;
    public QTextEdit textEdit_2;

    public Ui_Dialog() { super(); }

    public void setupUi(QDialog Dialog)
    {
        Dialog.setObjectName("Dialog");
        Dialog.resize(new QSize(873, 562).expandedTo(Dialog.minimumSizeHint()));
        label = new QLabel(Dialog);
        label.setObjectName("label");
        label.setGeometry(new QRect(50, 40, 351, 321));
        label.setPixmap(new QPixmap(("../../../../Users/Kaodino/Downloads/iloveimg-converted (3)/apartamento1.png")));
        label.setScaledContents(true);
        label_2 = new QLabel(Dialog);
        label_2.setObjectName("label_2");
        label_2.setGeometry(new QRect(470, 40, 351, 321));
        label_2.setPixmap(new QPixmap(("../../../../Users/Kaodino/Downloads/iloveimg-converted (3)/apartamento2.png")));
        label_2.setScaledContents(true);
        btnPiso1 = new QPushButton(Dialog);
        btnPiso1.setObjectName("btnPiso1");
        btnPiso1.setGeometry(new QRect(170, 380, 75, 23));
        btnPiso2 = new QPushButton(Dialog);
        btnPiso2.setObjectName("btnPiso2");
        btnPiso2.setGeometry(new QRect(620, 380, 75, 23));
        lblDescriptionP2 = new QLabel(Dialog);
        lblDescriptionP2.setObjectName("lblDescriptionP2");
        lblDescriptionP2.setGeometry(new QRect(530, 420, 221, 41));
        textEdit = new QTextEdit(Dialog);
        textEdit.setObjectName("textEdit");
        textEdit.setGeometry(new QRect(80, 420, 311, 101));
        textEdit_2 = new QTextEdit(Dialog);
        textEdit_2.setObjectName("textEdit_2");
        textEdit_2.setGeometry(new QRect(520, 420, 311, 101));
        retranslateUi(Dialog);

        Dialog.connectSlotsByName();
    } // setupUi

    void retranslateUi(QDialog Dialog)
    {
        Dialog.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Dialog", null));
        label.setText("");
        label_2.setText("");
        btnPiso1.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Piso 1", null));
        btnPiso2.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "piso 2", null));
        lblDescriptionP2.setText("");
        textEdit.setHtml(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0//EN\" \"http://www.w3.org/TR/REC-html40/strict.dtd\">\n"+
"<html><head><meta name=\"qrichtext\" content=\"1\" /><style type=\"text/css\">\n"+
"p, li { white-space: pre-wrap; }\n"+
"</style></head><body style=\" font-family:'MS Shell Dlg 2'; font-size:8.25pt; font-weight:400; font-style:normal;\">\n"+
"<p style=\" margin-top:0px; margin-bottom:0px; margin-left:0px; margin-right:0px; -qt-block-indent:0; text-indent:0px;\"><span style=\" font-family:'Lora,Helvetica,Arial,Verdana,sans-serif'; font-size:8pt; color:#605956; background-color:#f5f4f2;\">Este espacioso apartamento exterior de tres habitaciones tiene una ubicaci\u00f3n estrat\u00e9gica en el barrio de la Vi\u00f1a: \u00a1ser\u00e1 muy f\u00e1cil planear tu visita!</span></p></body></html>", null));
        textEdit_2.setHtml(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0//EN\" \"http://www.w3.org/TR/REC-html40/strict.dtd\">\n"+
"<html><head><meta name=\"qrichtext\" content=\"1\" /><style type=\"text/css\">\n"+
"p, li { white-space: pre-wrap; }\n"+
"</style></head><body style=\" font-family:'MS Shell Dlg 2'; font-size:8.25pt; font-weight:400; font-style:normal;\">\n"+
"<p style=\" margin-top:0px; margin-bottom:0px; margin-left:0px; margin-right:0px; -qt-block-indent:0; text-indent:0px;\"><span style=\" font-family:'Lora,Helvetica,Arial,Verdana,sans-serif'; font-size:8pt; color:#605956; background-color:#f5f4f2;\">Este espacioso apartamento exterior de tres habitaciones tiene una ubicaci\u00f3n estrat\u00e9gica en el barrio de la Vi\u00f1a: \u00a1ser\u00e1 muy f\u00e1cil planear tu visita!</span></p></body></html>", null));
    } // retranslateUi

}

