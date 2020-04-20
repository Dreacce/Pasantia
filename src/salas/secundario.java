package salas;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.sun.glass.ui.CommonDialogs.Type;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class secundario {

	JFrame frame;
	private JTextField panel1;
	private JTextField panel2;
	private JTextField panel3;
	private JTextField panel5;
	private JTextField panel4;
	private JTextField panel6;
	Acciones acc=new Acciones();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					secundario window = new secundario();
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
	public secundario() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setSize(460,460);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null); 
		
		JLabel lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setBounds(20, 66, 56, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Apellido:");
		lblNewLabel_1.setBounds(20, 104, 56, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblTelfono = new JLabel("Tel\u00E8fono:");
		lblTelfono.setBounds(20, 168, 56, 38);
		frame.getContentPane().add(lblTelfono);
		
		JLabel lblCi = new JLabel("C.I :");
		lblCi.setBounds(20, 141, 56, 14);
		frame.getContentPane().add(lblCi);
		
		JLabel lblSaldo = new JLabel("Saldo :");
		lblSaldo.setBounds(20, 217, 56, 14);
		frame.getContentPane().add(lblSaldo);
		
		panel1 = new JTextField();
		panel1.setBounds(123, 63, 180, 20);
		frame.getContentPane().add(panel1);
		panel1.setColumns(10);
		
		panel2 = new JTextField();
		panel2.setColumns(10);
		panel2.setBounds(123, 101, 180, 20);
		frame.getContentPane().add(panel2);
		
		panel3 = new JTextField();
		panel3.setColumns(10);
		panel3.setBounds(123, 138, 180, 20);
		frame.getContentPane().add(panel3);
		
		panel5 = new JTextField();
		panel5.setColumns(10);
		panel5.setBounds(123, 214, 180, 20);
		frame.getContentPane().add(panel5);
		
		panel4 = new JTextField();
		panel4.setColumns(10);
		panel4.setBounds(123, 177, 180, 20);
		frame.getContentPane().add(panel4);
		
		JButton btnNewButton = new JButton("Guardar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {;
			if(panel1.getText().equals("") || panel2.getText().equals("") || panel3.getText().equals("") || panel4.getText().equals("") || panel5.getText().equals("") 
					|| panel4.getText().matches("[a-zA-Z]+")) {
				JOptionPane.showMessageDialog(null, "Por favor completar todos los campos y asegurese que los datos sean los correctos");
			}else {
				System.out.println("sd");
				acc.clienteNuevo(panel1.getText(),panel2.getText(),Integer.parseInt(panel3.getText()),Integer.parseInt(panel4.getText()),Integer.parseInt(panel5.getText()), 0);
				
			}
			}
 		});
		btnNewButton.setBounds(103, 317, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnCancelar.setBounds(250, 317, 89, 23);
		frame.getContentPane().add(btnCancelar);
		
		JLabel lblNewLabel_2 = new JLabel("Registro");
		lblNewLabel_2.setBounds(163, 27, 79, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblSaldado = new JLabel("Saldado :");
		lblSaldado.setBounds(20, 255, 56, 14);
		frame.getContentPane().add(lblSaldado);
		
		panel6 = new JTextField();
		panel6.setEnabled(false);
		panel6.setColumns(10);
		panel6.setBounds(123, 252, 180, 20);
		frame.getContentPane().add(panel6);
	}
}
