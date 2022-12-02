package modelos;

import java.io.Console;
import java.time.LocalDateTime;

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

  //metodo constructor que requiere dos datos al momento de la instanciacion (nombre y propietario)
  public Mascota(String nombre, String propietario) {
    setNombre(nombre);
    setPropietario(propietario);
    setLive(true);
    setNivelEnergia(100);
    setNivelHambre((int) (Math.random() * 100));
    setNivelCansancio((int) (Math.random() * 100));
    setNivelFelicidad((int) (Math.random() * 100));
    setNivelAburrimiento((int) (Math.random() * 100));
    setFechaNacimiento(LocalDateTime.now());
  }

  //metodos de la instancia

  public void comer() {};
  public void dormir() {};
  public void jugar() {};

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

  private void setNivelEnergia(int nivelEnergia) {
    this.nivelEnergia = nivelEnergia;
  }

  private void setNivelHambre(int nivelHambre) {
    this.nivelHambre = nivelHambre;
  }

  private void setNivelCansancio(int nivelCansancio) {
    this.nivelCansancio = nivelCansancio;
  }

  private void setNivelFelicidad(int nivelFelicidad) {
    this.nivelFelicidad = nivelFelicidad;
  }

  private void setNivelAburrimiento(int nivelAburrimiento) {
    this.nivelAburrimiento = nivelAburrimiento;
  }

  private void setPropietario(String propietario) {
    this.propietario = propietario;
  }


}
