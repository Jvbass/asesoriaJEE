package cl.modulo5.asesorias.conexion;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	  private static final String DB = "asesoriajee";
	  private static final String PORT = "3306";
	  private static final String LOGIN = "adminasesoria";
	  private static final String PASSWORD = "admin";
	  private static final String URL_CONEXION = "jdbc:mysql://localhost:"+PORT+"/"+DB;
	  
	  private static DBConnection instance = null;
	  private Connection connection = null;
	  
	  private DBConnection() {
	    try {
	      
	      Class.forName("com.mysql.cj.jdbc.Driver"); // utilizamos el driver o cargamos el driver
	      // Class.forName("org.mariadb.jdbc.Driver");
	      connection = DriverManager.getConnection(URL_CONEXION, LOGIN, PASSWORD);
	      
	      if(connection != null) {
	        System.out.println("La conexión a : " + DB + " ha sido exitosa");
	      } else {
	        System.out.println("La conexión a : " + DB + " ha fallado");
	      }
	      
	    } catch (Exception e) {
	      System.out.println(e.getMessage());
	    }
	  }
	  
	  public static DBConnection getInstance() {
	    if(instance == null) {
	      instance = new DBConnection();
	    }
	    return instance;
	  }
	  
	  
	  public Connection getConnection() {
	    return connection;
	  }
	  

	  public void disconnect() {
	    if(connection != null ) {
	      try {
	        connection.close();
	        System.out.println("La conexión a: " + DB + " Ha sido cerrado correctamente");
	      } catch (Exception e) {
	        System.out.println(e.getMessage());
	      }
	    }
	    connection = null;
	  }
	}
