package salas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class Principal {

	private JFrame frame;
	private JTable table;
	Acciones ac=new Acciones();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal window = new Principal();
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
	
	public Principal() {
		initialize();
	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 823, 520);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Biansa Propiedades");
		lblNewLabel.setBounds(355, 26, 116, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Nuevo ");
		btnNewButton.setBounds(43, 79, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Importar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				ac.conectardb();
			}
		});
		btnNewButton_1.setBounds(43, 135, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Exportar");
		btnNewButton_2.setBounds(43, 192, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(203, 66, 594, 272);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Cliente", "C.I", "Tel\u00E8fono", "Saldo", "Saldado"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(258);
		scrollPane.setViewportView(table);
		
		//Cargamos la tabla con los datos de la base de datos 7
		try {
    		PreparedStatement ps;
    		ResultSet res;
			Connection con=null;
			con=(Connection) Conexion.getConection();
			ps=(PreparedStatement) con.prepareStatement("SELECT * FROM datoscliente");
			res=ps.executeQuery();
			
			if(res.next()) {
				int numCols = table.getModel().getColumnCount();

				Object [] fila = new Object[numCols]; 
				        
				 fila[0] = res.getString("nombreApellido");
				 fila[1] = res.getInt("ci");
				 fila[2] = res.getInt("telefono");
				 fila[3] = res.getInt("saldo");
				 fila[4] = res.getInt("saldado");
				 ((DefaultTableModel) table.getModel()).addRow(fila);
			}else {
				JOptionPane.showMessageDialog(null, "No existe");
			}
			con.close();
		}catch(Exception e){
			System.out.println(e);
			
		}

		
	}
}
