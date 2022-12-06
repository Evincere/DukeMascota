package acciones;

import enumeradores.AlmacenAlimentos;
import modelos.Mascota;

public class Alimentarse {

  private AlmacenAlimentos comida;

  public void ingerirAlimento(AlmacenAlimentos comida, Mascota mascota) {
    if(mascota.isLive()) {
      mascota.setNivelEnergia(mascota.getNivelEnergia() + comida.getEnergiaAportada());
      System.out.println("duke come " + comida + " y su energia sube a " + mascota.getNivelEnergia());
    }else{
      System.out.println("Lo siento, esta mascota no se encuentra operativa desde " + mascota.getFechaMuerte());
    }
  }
}
