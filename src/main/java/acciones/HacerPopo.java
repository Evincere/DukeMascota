package acciones;

import modelos.Mascota;

public class HacerPopo {

  public boolean tieneQueEvacuar(Mascota mascota) {
    return mascota.getComidasIngeridas() > 2;
  }

  public void evacuar(Mascota mascota) {
    if (tieneQueEvacuar(mascota)) {
      mascota.setComidasIngeridas(mascota.getComidasIngeridas() - 1);
    }
  }
}