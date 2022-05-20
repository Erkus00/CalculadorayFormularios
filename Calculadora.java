import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Calculadora {

	private JFrame frame;
	private JTextField txtCaja;
	public float primernumero;
	public float segundonumero;
	public String operador;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora window = new Calculadora();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculadora() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 362, 420);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtCaja = new JTextField();
		txtCaja.setBounds(38, 29, 291, 41);
		frame.getContentPane().add(txtCaja);
		txtCaja.setColumns(10);
		
		JButton btnNewButton_1_6 = new JButton("+");
		btnNewButton_1_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				primernumero= Float.parseFloat(txtCaja.getText());
				operador = "+";
				txtCaja.setText("");
			}
		});
		btnNewButton_1_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1_6.setBounds(262, 139, 67, 112);
		frame.getContentPane().add(btnNewButton_1_6);
		
		JButton btnNewButton_1_6_4_3 = new JButton("0");
		btnNewButton_1_6_4_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtCaja.setText(txtCaja.getText()+ "0");
			}
		});
		btnNewButton_1_6_4_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1_6_4_3.setBounds(38, 317, 141, 54);
		frame.getContentPane().add(btnNewButton_1_6_4_3);
		
		JButton btnNewButton_1_6_4_3_2 = new JButton("=");
		btnNewButton_1_6_4_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				segundonumero= Float.parseFloat(txtCaja.getText());
				switch(operador) {
				case "+":  txtCaja.setText(Float.toString(primernumero + segundonumero));
				break;
				case "-": txtCaja.setText(Float.toString(primernumero - segundonumero));
				break;
				case "/": txtCaja.setText(Float.toString(primernumero / segundonumero));
				break;
				case "*": txtCaja.setText(Float.toString(primernumero * segundonumero));
				break;
				}
			}
		});
		btnNewButton_1_6_4_3_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1_6_4_3_2.setBounds(262, 255, 67, 116);
		frame.getContentPane().add(btnNewButton_1_6_4_3_2);
		
		JButton btnNewButton_1_6_5 = new JButton("*");
		btnNewButton_1_6_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				primernumero= Float.parseFloat(txtCaja.getText());
				operador = "*";
				txtCaja.setText("");
			}
		});
		btnNewButton_1_6_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1_6_5.setBounds(189, 80, 63, 54);
		frame.getContentPane().add(btnNewButton_1_6_5);
		
		JButton btnNewButton_1_6_6 = new JButton("-");
		btnNewButton_1_6_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				primernumero= Float.parseFloat(txtCaja.getText());
				operador = "-";
				txtCaja.setText("");
			}
		});
		btnNewButton_1_6_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1_6_6.setBounds(262, 80, 67, 54);
		frame.getContentPane().add(btnNewButton_1_6_6);
		
		JButton btnNewButton_1_6_7 = new JButton("/");
		btnNewButton_1_6_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				primernumero= Float.parseFloat(txtCaja.getText());
				operador = "/";
				txtCaja.setText("");
			}
		});
		btnNewButton_1_6_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1_6_7.setBounds(116, 80, 63, 54);
		frame.getContentPane().add(btnNewButton_1_6_7);
		
		JButton btnNewButton_1_6_4_3_1 = new JButton(".");
		btnNewButton_1_6_4_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!(txtCaja.getText().contains("."))) {
					txtCaja.setText(txtCaja.getText()+".");
				}
				
			}
		});
		btnNewButton_1_6_4_3_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1_6_4_3_1.setBounds(189, 317, 63, 54);
		frame.getContentPane().add(btnNewButton_1_6_4_3_1);
		
		JButton btnNewButton_1_6_4_3_3 = new JButton("1");
		btnNewButton_1_6_4_3_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtCaja.setText(txtCaja.getText()+ "1");
			}
		});
		btnNewButton_1_6_4_3_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1_6_4_3_3.setBounds(38, 255, 63, 54);
		frame.getContentPane().add(btnNewButton_1_6_4_3_3);
		
		JButton btnNewButton_1_6_4_3_4 = new JButton("2");
		btnNewButton_1_6_4_3_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtCaja.setText(txtCaja.getText()+ "2");
			}
		});
		btnNewButton_1_6_4_3_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1_6_4_3_4.setBounds(116, 255, 63, 54);
		frame.getContentPane().add(btnNewButton_1_6_4_3_4);
		
		JButton btnNewButton_1_6_4_3_5 = new JButton("3");
		btnNewButton_1_6_4_3_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtCaja.setText(txtCaja.getText()+ "3");
			}
		});
		btnNewButton_1_6_4_3_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1_6_4_3_5.setBounds(189, 255, 63, 54);
		frame.getContentPane().add(btnNewButton_1_6_4_3_5);
		
		JButton btnNewButton_1_6_4_3_6 = new JButton("6");
		btnNewButton_1_6_4_3_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtCaja.setText(txtCaja.getText()+ "6");
			}
		});
		btnNewButton_1_6_4_3_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1_6_4_3_6.setBounds(189, 197, 63, 54);
		frame.getContentPane().add(btnNewButton_1_6_4_3_6);
		
		JButton btnNewButton_1_6_4_3_7 = new JButton("5");
		btnNewButton_1_6_4_3_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtCaja.setText(txtCaja.getText()+ "5");
			}
		});
		btnNewButton_1_6_4_3_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1_6_4_3_7.setBounds(116, 197, 63, 54);
		frame.getContentPane().add(btnNewButton_1_6_4_3_7);
		
		JButton btnNewButton_1_6_4_3_8 = new JButton("4");
		btnNewButton_1_6_4_3_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtCaja.setText(txtCaja.getText()+ "4");
			}
		});
		btnNewButton_1_6_4_3_8.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1_6_4_3_8.setBounds(38, 197, 63, 54);
		frame.getContentPane().add(btnNewButton_1_6_4_3_8);
		
		JButton btnNewButton_1_6_4_3_9 = new JButton("7");
		btnNewButton_1_6_4_3_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtCaja.setText(txtCaja.getText()+ "7");
			}
		});
		btnNewButton_1_6_4_3_9.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1_6_4_3_9.setBounds(38, 139, 63, 54);
		frame.getContentPane().add(btnNewButton_1_6_4_3_9);
		
		JButton btnNewButton_1_6_4_3_10 = new JButton("8");
		btnNewButton_1_6_4_3_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtCaja.setText(txtCaja.getText()+ "8");
			}
		});
		btnNewButton_1_6_4_3_10.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1_6_4_3_10.setBounds(116, 139, 63, 54);
		frame.getContentPane().add(btnNewButton_1_6_4_3_10);
		
		JButton btnNewButton_1_6_4_3_11 = new JButton("9");
		btnNewButton_1_6_4_3_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtCaja.setText(txtCaja.getText()+ "9");
			}
		});
		btnNewButton_1_6_4_3_11.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1_6_4_3_11.setBounds(189, 139, 63, 54);
		frame.getContentPane().add(btnNewButton_1_6_4_3_11);
		
		JButton btnNewButton_1_6_4_3_1_1 = new JButton("C");
		btnNewButton_1_6_4_3_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtCaja.setText("0");
			}
		});
		btnNewButton_1_6_4_3_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1_6_4_3_1_1.setBounds(38, 80, 63, 54);
		frame.getContentPane().add(btnNewButton_1_6_4_3_1_1);
	}
}
