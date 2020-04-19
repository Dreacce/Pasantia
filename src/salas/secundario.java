package salas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class secundario {

	private JFrame frame;
	private JTextField panel1;
	private JTextField panel2;
	private JTextField panel3;
	private JTextField panel4;
	private JTextField panel5;

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
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(20, 66, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(20, 104, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel label = new JLabel("New label");
		label.setBounds(20, 129, 46, 14);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("New label");
		label_1.setBounds(20, 159, 46, 14);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("New label");
		label_2.setBounds(20, 184, 46, 14);
		frame.getContentPane().add(label_2);
		
		panel1 = new JTextField();
		panel1.setBounds(109, 63, 86, 20);
		frame.getContentPane().add(panel1);
		panel1.setColumns(10);
		
		panel2 = new JTextField();
		panel2.setColumns(10);
		panel2.setBounds(109, 101, 86, 20);
		frame.getContentPane().add(panel2);
		
		panel3 = new JTextField();
		panel3.setColumns(10);
		panel3.setBounds(109, 126, 86, 20);
		frame.getContentPane().add(panel3);
		
		panel4 = new JTextField();
		panel4.setColumns(10);
		panel4.setBounds(109, 156, 86, 20);
		frame.getContentPane().add(panel4);
		
		panel5 = new JTextField();
		panel5.setColumns(10);
		panel5.setBounds(97, 181, 86, 20);
		frame.getContentPane().add(panel5);
		
		JButton btnNewButton = new JButton("Guardar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(29, 227, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(137, 227, 89, 23);
		frame.getContentPane().add(btnCancelar);
	}
}
