package acciones;

import enumeradores.AlmacenAlimentos;
import modelos.Mascota;

public class Alimentarse {

  private AlmacenAlimentos comida;

  public void ingerirAlimento(AlmacenAlimentos comida, Mascota mascota) {
    if (mascota.isLive()) {
      mascota.setNivelEnergia(mascota.getNivelEnergia() + comida.getEnergiaAportada());
      contabilizarComida(mascota);
      if (mascota.getPopo().tieneQueEvacuar(mascota)) {
        mascota.setNivelEnergia(mascota.getNivelEnergia() - 15);
        Morir.checkStatusGeneral(mascota);
        if (mascota.isLive()) {
          System.out.println("Esta mascota necesita ir al baño");
        }

      } else {
        Morir.checkStatusGeneral(mascota);
        System.out.println("Esta mascota necesita ir al baño");

      }
    } else {
      Morir.checkStatusGeneral(mascota);
      System.out.println("Lo siento, esta mascota no se encuentra operativa desde " + mascota.getFechaMuerte().toLocalDate());
    }
  }

  private void contabilizarComida(Mascota mascota) {
    mascota.setComidasIngeridas(mascota.getComidasIngeridas() + 1);
  }
}
