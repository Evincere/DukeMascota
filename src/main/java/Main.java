import java.sql.Connection;
import modelos.DukeMascota;
import persistencia.collections.MascotaPersistenceUseList;
import persistencia.mysql.MySQLConnection;

public class Main {

  public static void main(String[] args) {
    MascotaPersistenceUseList persistence = new MascotaPersistenceUseList();

    DukeMascota duke = new DukeMascota("Duke-Merlina", "Semper");
    DukeMascota duke2 = new DukeMascota("Duke-Cordobes", "Semper");
    DukeMascota duke3 = new DukeMascota("Duke-Porteño", "Semper");
    DukeMascota duke4 = new DukeMascota("Duke-Litoral", "Semper");
    persistence.guardar(duke);
    persistence.guardar(duke2);
    persistence.guardar(duke3);
    persistence.guardar(duke4);

    //    duke.comer(AlmacenAlimentos.ASADO);
    //    duke.comer(AlmacenAlimentos.PORORO);
    //    duke.comer(AlmacenAlimentos.PORORO);
    //    duke.comer(AlmacenAlimentos.PORORO);
    //    duke.comer(AlmacenAlimentos.PORORO);
    //    duke.comer(AlmacenAlimentos.PORORO);
    //    duke.comer(AlmacenAlimentos.PORORO);
    //    duke.comer(AlmacenAlimentos.PORORO);
    //    duke.comer(AlmacenAlimentos.PORORO);
    //    duke.comer(AlmacenAlimentos.PORORO);
    //    RegistroCivilMascotas.guardarActa(duke);

    MySQLConnection conexion = new MySQLConnection();
    Connection connection = conexion.establecerConexion();

    conexion.cerrarConexion(connection);

//    MascotaPersistenceUseMySQL persistenceUseBDMySQL = new MascotaPersistenceUseMySQL();
//
//    persistenceUseBDMySQL.guardar(duke);
//    persistenceUseBDMySQL.guardar(duke2);
//    persistenceUseBDMySQL.guardar(duke3);
//    persistenceUseBDMySQL.guardar(duke4);
//    Mascota mascota = persistenceUseBDMySQL.getMascota(1);
//    System.out.println(mascota.getId() + " " + mascota.getFechaNacimiento());
  }
}
