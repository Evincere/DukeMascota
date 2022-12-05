package modelos;

public class DukeMascota extends Mascota{

  private static int count;
  public DukeMascota(String nombre, String propietario) {
    super(nombre, propietario);
    this.id = ++count;
  }

  @Override
  public String toString() {
    return "La Mascota de nombre : " + nombre + '\n'
        + "nació el día " + fechaNacimiento.getDayOfWeek() + ", "
                          + fechaNacimiento.getDayOfMonth() + " de "
                          + fechaNacimiento.getMonth() + " del año "
                          + fechaNacimiento.getYear() + '\n'
        + "a la hora : " + fechaNacimiento.getHour() + ":"
                         + fechaNacimiento.getMinute() + '\n'
        + "actualmente se encuentra " + ((isLive) ? "vivo\n" : "muerto\n")
        + "su nivel de Energía se encuentra en : " + nivelEnergia + "%\n"
        + "el nivel de Hambre en : " + nivelHambre + '\n'
        + "nivel de Cansancio : " + nivelCansancio + '\n'
        + "nivel de Felicidad : " + nivelFelicidad + '\n'
        + "nivel de Aburrimiento : " + nivelAburrimiento + '\n'
        + "y su actual propietario es : " + propietario + '\n';
  }

}
