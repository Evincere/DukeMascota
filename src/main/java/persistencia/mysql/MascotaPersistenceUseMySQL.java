package persistencia.mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalTime;
import java.util.List;
import java.util.Random;
import modelos.Mascota;
import persistencia.IMascotaPersistence;

public class MascotaPersistenceUseMySQL implements IMascotaPersistence {

  MySQLConnection mySQLConnection;
  Connection connection;


  public MascotaPersistenceUseMySQL() {
    this.mySQLConnection = new MySQLConnection();
    this.connection = mySQLConnection.establecerConexion();
  }

  @Override
  public void guardar(Mascota mascota) {
    try {
      String query = "INSERT INTO mascota_table ("
          + "id, "
          + "name, "
          + "fecha_nacimiento, "
          + "fecha_muerte, "
          + "is_live, "
          + "nivel_energia, "
          + "nivel_hambre, "
          + "nivel_cansancio, "
          + "nivel_felicidad, "
          + "nivel_aburrimiento, "
          + "propietario"
          + ") VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
      PreparedStatement stm = mySQLConnection.enviarConsulta(this.connection, query);
      stm.setInt(1, mascota.getId());
      stm.setString(2, mascota.getNombre());
      stm.setString(3, mascota.getFechaNacimiento().toString());
      stm.setString(4, mascota.getFechaMuerte() != null ? mascota.getFechaMuerte().toString() : null);
      stm.setBoolean(5, mascota.isLive());
      stm.setInt(6, mascota.getNivelEnergia());
      stm.setInt(7, mascota.getNivelHambre());
      stm.setInt(8, mascota.getNivelCansancio());
      stm.setInt(9, mascota.getNivelFelicidad());
      stm.setInt(10, mascota.getNivelAburrimiento());
      stm.setString(11, mascota.getPropietario());
      stm.executeUpdate();
    } catch (SQLException e) {
      System.out.println("problema para insertar los datos");
    }
  }

  @Override
  public Mascota getMascota(int id) {
    Mascota mascota = new Mascota();
    String query = "SELECT * FROM mascota_table WHERE id = ?";
    PreparedStatement stm = null;
    try {
      stm = connection.prepareStatement(query);
      stm.setInt(1, id);
      ResultSet rs = stm.executeQuery();
      if (rs.next()) {
        mascota.setId(rs.getInt("id"));
        mascota.setNombre(rs.getString("name"));
        mascota.setFechaNacimiento(rs.getDate("fecha_nacimiento").toLocalDate().atTime(LocalTime.ofSecondOfDay(new Random().nextInt(86400))));
        mascota.setLive(rs.getBoolean("is_live"));
      }
    } catch (SQLException e) {
    }

    return mascota;
  }

  @Override
  public Mascota getMascota(String nombre) {
    return null;
  }

  @Override
  public List<Mascota> getAllMascotas() {
    return null;
  }

  @Override
  public void updateMascota(int id, Mascota mascota) {

  }

  @Override
  public void deleteMascota(int id) {

  }
}
