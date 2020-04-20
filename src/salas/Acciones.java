package salas;

import javax.swing.JOptionPane;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class Acciones {

	//creamos un metodo para agregar un cliente en nuestra base de datos
	public void clienteNuevo(String nombre,String apellido, int ci,int telefono,int saldo,int saldado) {
		try {
    		PreparedStatement ps;
			Connection con=null;
			con=(Connection) Conexion.getConection();
			ps=(PreparedStatement) con.prepareStatement("INSERT INTO datosCliente (nombreApellido,ci,telefono,saldo,saldado) VALUES (?,?,?,?,?)");
			ps.setString(1,nombre+apellido);
			ps.setInt(2,ci);
			ps.setInt(3,telefono);
			ps.setInt(4,saldo);
			ps.setInt(5,0);
			
			ps.executeUpdate();
			JOptionPane.showMessageDialog(null,"Se ha guardo con èxito");
			con.close();
		}catch(Exception e){
			System.out.println(e);
			
		}
		//redireccionamos a la interfaz principal
		Principal nue=new Principal();
		nue.frame.setVisible(true);
	}
	
}
