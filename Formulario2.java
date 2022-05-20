import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTabbedPane;
import java.awt.Window.Type;
import javax.swing.UIManager;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JLabel;

public class Formulario2 {

	private JFrame frmContrasea;
	private JPasswordField passwordField_1;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario2 window = new Formulario2();
					window.frmContrasea.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Formulario2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmContrasea = new JFrame();
		frmContrasea.setForeground(Color.WHITE);
		frmContrasea.setFont(UIManager.getFont("Button.font"));
		frmContrasea.setTitle("Contrase\u00F1a");
		frmContrasea.getContentPane().setBackground(Color.LIGHT_GRAY);
		frmContrasea.setBounds(100, 100, 450, 300);
		frmContrasea.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmContrasea.getContentPane().setLayout(null);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBackground(Color.WHITE);
		passwordField_1.setBounds(170, 117, 160, 28);
		frmContrasea.getContentPane().add(passwordField_1);
		
		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Se ha pulsado el boton de entrada");
				JOptionPane.showMessageDialog(null, "Entrada aceptada para ");
				textField.setText("");
				passwordField_1.setText("");
				
			}
		});
		btnNewButton.setBounds(47, 198, 103, 23);
		frmContrasea.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Salir");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Se ha pulsado el boton de Salida");
				System.exit(0);
			}
		});
		btnNewButton_1.setBounds(299, 198, 89, 23);
		frmContrasea.getContentPane().add(btnNewButton_1);
		
		textField = new JTextField();
		textField.setBounds(170, 62, 160, 28);
		frmContrasea.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setFont(new Font("Tahoma", Font.ITALIC, 17));
		lblNewLabel.setBounds(36, 62, 103, 28);
		frmContrasea.getContentPane().add(lblNewLabel);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setFont(new Font("Tahoma", Font.ITALIC, 17));
		lblContrasea.setBounds(36, 117, 103, 28);
		frmContrasea.getContentPane().add(lblContrasea);
	}
}
