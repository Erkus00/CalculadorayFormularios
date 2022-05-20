import java.awt.EventQueue;



import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JDesktopPane;
import javax.swing.JLayeredPane;
import javax.swing.JToolBar;
import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.border.EtchedBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class Formulario3 {

private JFrame frmRegistroAlumnos;
private JTextField textField;
private JTextField textField_1;
private JTextField textField_2;
private JTextField textField_3;
private JTextField textField_4;
private JTextField textField_5;
private JTextField textField_6;


/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
Formulario3 window = new Formulario3();
window.frmRegistroAlumnos.setVisible(true);
} catch (Exception e) {
e.printStackTrace();
}
}
});
}



/**
* Create the application.
*/
public Formulario3() {
initialize();
}



/**
* Initialize the contents of the frame.
*/
private void initialize() {
frmRegistroAlumnos = new JFrame();
frmRegistroAlumnos.setTitle("Registro De Alumnos");
frmRegistroAlumnos.setBounds(100, 100, 526, 343);
frmRegistroAlumnos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frmRegistroAlumnos.getContentPane().setLayout(null);

JLayeredPane layeredPane = new JLayeredPane();
layeredPane.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Datos Personales", TitledBorder.LEADING, TitledBorder.TOP, null, Color.DARK_GRAY));
layeredPane.setBounds(29, 23, 469, 147);
frmRegistroAlumnos.getContentPane().add(layeredPane);

JLabel lblNewLabel = new JLabel("DNI");
lblNewLabel.setBounds(10, 27, 46, 14);
layeredPane.add(lblNewLabel);

JLabel lblApellidos = new JLabel("Nombre");
lblApellidos.setBounds(150, 27, 46, 14);
layeredPane.add(lblApellidos);

JLabel lblNombre = new JLabel("Apellidos");
lblNombre.setBounds(297, 27, 46, 14);
layeredPane.add(lblNombre);

JLabel lblDireccin = new JLabel("Direcci\u00F3n");
lblDireccin.setBounds(10, 61, 46, 14);
layeredPane.add(lblDireccin);

JLabel lblDistrito = new JLabel("Zona");
lblDistrito.setBounds(268, 61, 46, 14);
layeredPane.add(lblDistrito);

JLabel lblEmail = new JLabel("E-mail");
lblEmail.setBounds(10, 91, 46, 14);
layeredPane.add(lblEmail);

JLabel lblTelefono = new JLabel("Contacto");
lblTelefono.setBounds(200, 91, 46, 14);
layeredPane.add(lblTelefono);

JLabel lblCarrera = new JLabel("Carrera");
lblCarrera.setBounds(256, 119, 46, 14);
layeredPane.add(lblCarrera);

textField_1 = new JTextField();
textField_1.setBounds(40, 27, 86, 20);
layeredPane.add(textField_1);
textField_1.setColumns(10);

textField_2 = new JTextField();
textField_2.setBounds(200, 27, 86, 20);
layeredPane.add(textField_2);
textField_2.setColumns(10);

textField_3 = new JTextField();
textField_3.setColumns(10);
textField_3.setBounds(342, 27, 86, 20);
layeredPane.add(textField_3);

textField_4 = new JTextField();
textField_4.setColumns(10);
textField_4.setBounds(58, 58, 200, 20);
layeredPane.add(textField_4);

textField_5 = new JTextField();
textField_5.setColumns(10);
textField_5.setBounds(40, 88, 154, 20);
layeredPane.add(textField_5);

textField_6 = new JTextField();
textField_6.setColumns(10);
textField_6.setBounds(256, 88, 154, 20);
layeredPane.add(textField_6);

JComboBox comboBox = new JComboBox();
comboBox.setModel(new DefaultComboBoxModel(new String[] {"Logistica", "Ingenieria del Limon", "Desarrollo Esternocleidomastoideo"}));
comboBox.setBounds(297, 115, 130, 22);
layeredPane.add(comboBox);

JComboBox comboBox_1 = new JComboBox();
comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Puerta Blanca", "La Unidad", "El Torcal"}));
comboBox_1.setBounds(320, 57, 121, 22);
layeredPane.add(comboBox_1);

JLayeredPane layeredPane_1 = new JLayeredPane();
layeredPane_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Comentario", TitledBorder.LEADING, TitledBorder.TOP, null, Color.GRAY));
layeredPane_1.setBounds(29, 171, 469, 92);
frmRegistroAlumnos.getContentPane().add(layeredPane_1);
layeredPane_1.setLayout(null);

textField = new JTextField();
textField.setBounds(10, 21, 449, 60);
layeredPane_1.add(textField);
textField.setColumns(10);

JButton btnNewButton = new JButton("Aceptar");
btnNewButton.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
System.out.println("Has pulsado aceptar");
}
});
btnNewButton.setBounds(39, 270, 89, 23);
frmRegistroAlumnos.getContentPane().add(btnNewButton);

JButton btnNewButton_1 = new JButton("Cancelar");
btnNewButton_1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
System.out.println("Has pulsado salir");
System.exit(0);
}
});
btnNewButton_1.setBounds(389, 270, 89, 23);
frmRegistroAlumnos.getContentPane().add(btnNewButton_1);
}
}