package persistencia.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MySQLConnection {

  final String URL = "jdbc:mysql://localhost:3306/";
  final String BD = "dukebd";
  final String USERNAME = "root";
  final String PASSWORD = "root";

  Connection connection;

  public Connection establecerConexion() {
    // Establecemos la conexión con la base de datos
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      connection = DriverManager.getConnection(URL + BD, USERNAME, PASSWORD);
      System.out.println("Conexión con base de datos " + BD + " ha sido abierta");
    } catch (SQLException e) {
      System.out.println("No se ha podido ESTABLECER la conexión con la base de datos");
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      throw new RuntimeException(e);
    }
    return connection;
  }

  public void cerrarConexion(Connection connection) {
    try {
      connection.close();
      System.out.println("Conexión con base de datos " + BD + " ha sido cerrada");
    } catch (SQLException e) {
      System.out.println("No se ha podido CERRAR la conexión con la base de datos");
      e.printStackTrace();
    }
  }

  public PreparedStatement enviarConsulta(Connection connection, String consultaSQL) {
    try {
      return connection.prepareStatement(consultaSQL);
    } catch (SQLException e) {
      System.out.println("No se ha podido generar el objeto PrepareStatement");
      e.printStackTrace();
    }
    return null;
  }
}
