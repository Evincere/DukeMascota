package enumeradores;

public enum EntretenimientosEnum {
  PERINOLA(15), POKER(25), BAILAR(20), LEER(10), PASEAR(30);

  private int desaburrimiento;

  EntretenimientosEnum(int desaburrimiento) {
    this.desaburrimiento = desaburrimiento;
  }

  public int getDesaburrimiento() {
    return this.desaburrimiento;
  }
}
