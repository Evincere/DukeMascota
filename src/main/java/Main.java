import enumeradores.AlmacenAlimentos;
import enumeradores.EntretenimientosEnum;
import modelos.DukeMascota;
import persistencia.persistenceCollections.MascotaPersistenceUseList;

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

    System.out.println("antes de comer " + duke.getNivelEnergia());
    duke.comer(AlmacenAlimentos.ASADO);
    System.out.println("despues de comer " + duke.getNivelEnergia());

    duke.jugar(EntretenimientosEnum.POKER);
    duke.jugar(EntretenimientosEnum.PASEAR);
    duke.jugar(EntretenimientosEnum.PASEAR);
    duke.jugar(EntretenimientosEnum.PERINOLA);
    duke.jugar(EntretenimientosEnum.BAILAR);
    duke.jugar(EntretenimientosEnum.BAILAR);




  }
}
