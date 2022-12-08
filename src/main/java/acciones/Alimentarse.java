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
        System.out.println("Esta mascota necesita ir al baño");
      } else {
        System.out.println("Esta mascota puede aguantarse de ir al baño");
      }
    } else {
      System.out.println("Lo siento, esta mascota no se encuentra operativa desde " + mascota.getFechaMuerte());
    }
  }

  private void contabilizarComida(Mascota mascota) {
    mascota.setComidasIngeridas(mascota.getComidasIngeridas() + 1);
  }
}
