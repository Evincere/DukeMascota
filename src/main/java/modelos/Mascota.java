package modelos;

import acciones.Alimentarse;
import acciones.Divertirse;
import acciones.Dormir;
import acciones.HacerPopo;
import enumeradores.AlmacenAlimentos;
import enumeradores.EntretenimientosEnum;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Mascota {

  //Atributos de la instancia
  protected String nombre;
  protected LocalDateTime fechaNacimiento;
  protected LocalDateTime fechaMuerte;
  protected boolean isLive;
  protected int nivelEnergia;
  protected int nivelHambre;
  protected int nivelCansancio;
  protected int nivelFelicidad;
  protected int nivelAburrimiento;
  protected String propietario;
  protected int id;
  protected Alimentarse alimentarse;
  protected Divertirse divertirse;
  public static LocalDateTime ultimoDescanso;
  protected Dormir descansar;
  protected int comidasIngeridas;
  protected HacerPopo popo;


  //metodo constructor que requiere dos datos al momento de la instanciacion (nombre y propietario)
  public Mascota(String nombre, String propietario) {
    setNombre(nombre);
    setPropietario(propietario);
    setLive(true);
    setNivelEnergia(20);
    setNivelHambre((int) (Math.random() * 100));
    setNivelCansancio((int) (Math.random() * 100));
    setNivelFelicidad((int) (Math.random() * 100));
    setNivelAburrimiento((int) (Math.random() * 100));
    setFechaNacimiento(LocalDateTime.now());
    this.alimentarse = new Alimentarse();
    this.divertirse = new Divertirse();
    this.descansar = new Dormir();
    this.popo = new HacerPopo();
  }

  //metodos de la instancia

  public void comer(AlmacenAlimentos alimento) {
    alimentarse.ingerirAlimento(alimento, this);
  }

  public void dormir(LocalTime tiempo) {
    descansar.hacerDormir(tiempo, this);
  }

  public void jugar(EntretenimientosEnum entretenimiento) {
    divertirse.entretenerseCon(entretenimiento, this);
  }

  public void irAlBaño() {
    popo.evacuar(this);
  }

  // getters
  public String getNombre() {
    return nombre;
  }

  public LocalDateTime getFechaNacimiento() {
    return fechaNacimiento;
  }

  public LocalDateTime getFechaMuerte() {
    return fechaMuerte;
  }

  public boolean isLive() {
    return isLive;
  }

  public int getNivelEnergia() {
    return nivelEnergia;
  }

  public int getNivelHambre() {
    return nivelHambre;
  }

  public int getNivelCansancio() {
    return nivelCansancio;
  }

  public int getNivelFelicidad() {
    return nivelFelicidad;
  }

  public int getNivelAburrimiento() {
    return nivelAburrimiento;
  }

  public String getPropietario() {
    return propietario;
  }

  public int getId() {
    return this.id;
  }

  public int getComidasIngeridas() {
    return comidasIngeridas;
  }

  public HacerPopo getPopo() {
    return popo;
  }

  // setters

  private void setNombre(String nombre) {
    this.nombre = nombre;
  }

  private void setFechaNacimiento(LocalDateTime fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
  }

  private void setFechaMuerte(LocalDateTime fechaMuerte) {
    this.fechaMuerte = fechaMuerte;
  }

  private void setLive(boolean live) {
    isLive = live;
  }

  public void setNivelEnergia(int nivelEnergia) {
    this.nivelEnergia = Math.min(Math.max(nivelEnergia, 0), 100);
  }

  public void setNivelHambre(int nivelHambre) {
    this.nivelHambre = nivelHambre;
  }

  private void setNivelCansancio(int nivelCansancio) {
    this.nivelCansancio = nivelCansancio;
  }

  private void setNivelFelicidad(int nivelFelicidad) {
    this.nivelFelicidad = nivelFelicidad;
  }

  public void setNivelAburrimiento(int nivelAburrimiento) {
    this.nivelAburrimiento = Math.max(nivelAburrimiento, 0);
  }

  private void setPropietario(String propietario) {
    this.propietario = propietario;
  }

  public void setComidasIngeridas(int comidasIngeridas) {
    this.comidasIngeridas = comidasIngeridas;
  }


}
