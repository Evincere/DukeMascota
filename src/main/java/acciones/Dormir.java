package acciones;

import java.time.LocalDateTime;
import java.time.LocalTime;
import modelos.Mascota;

public class Dormir {

  private int horasDormidas;
  private int minutosDormidos;



  public void hacerDormir(LocalTime tiempoADormir, Mascota mascota) {
    if (mascota.isLive()) {
      horasDormidas = tiempoADormir.getHour();
      minutosDormidos = tiempoADormir.getMinute();
      modificarEstado(horasDormidas, minutosDormidos, mascota);
      Mascota.ultimoDescanso = LocalDateTime.now();
    } else{
      System.out.println("Lo siento, esta mascota no se encuentra operativa desde " + mascota.getFechaMuerte());
    }
  }

  private void modificarEstado(int horasDormidas, int minutosDormidos, Mascota mascota) {
    // por cada 10 minutos dormidos, el nivel de energia aumenta 5 puntos
    int minutosTotales = (horasDormidas * 60) + minutosDormidos;
    mascota.setNivelEnergia(mascota.getNivelEnergia() + ((minutosTotales * 5)/10));

  }
}


