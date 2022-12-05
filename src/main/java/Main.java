import modelos.DukeMascota;
import modelos.Mascota;
import persistencia.persistenceCollections.IMascotaPersistenceUseList;

public class Main {

  public static void main(String[] args) {
    IMascotaPersistenceUseList persistence = new IMascotaPersistenceUseList();

    DukeMascota duke = new DukeMascota("Duke-Merlina", "Semper");
    DukeMascota duke2 = new DukeMascota("Duke-Cordobes", "Semper");
    DukeMascota duke3 = new DukeMascota("Duke-Porteño", "Semper");
    DukeMascota duke4 = new DukeMascota("Duke-Litoral", "Semper");
    persistence.guardar(duke);
    persistence.guardar(duke2);
    persistence.guardar(duke3);
    persistence.guardar(duke4);

    for(Mascota mascota : persistence.getAllMascotas()) {
      System.out.printf("Id : %d Mascota de nombre : %S\n", mascota.getId(), mascota.getNombre());
    }



  }
}
