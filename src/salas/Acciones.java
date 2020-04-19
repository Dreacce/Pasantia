package salas;


import com.mysql.jdbc.Connection;

public class Acciones {
	
	public Connection conectardb() {
		
		return (Connection) Conexion.getConection();	
	}
	
}
