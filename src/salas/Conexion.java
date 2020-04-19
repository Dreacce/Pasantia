package salas;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
	public static final String url="jdbc:mysql://localhost/clientes";
	public static final String user="root";
	public static final String pass="123";
    
    public static Connection getConection() {
		Connection con=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=(Connection) DriverManager.getConnection(url,user,pass);
			System.out.println("Conectado con exito");
			
		}catch(Exception e){
			System.out.println(e);
		}
		return con;
	}
	}

