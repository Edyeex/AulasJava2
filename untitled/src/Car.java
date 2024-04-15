public class Car {
  private String Marca;
  private String Modelo;
  private int Ano;

  Car(String Marca, String Modelo, int Ano) {
    this.Marca = Marca;
    this.Modelo = Modelo;
    this.Ano = Ano;

  }
  public String getMarca() {
    return Marca;
  }
  public String getModelo() {
    return Modelo;
  }
  public int getAno() {
    return Ano;
  }

  public void setModelo(String modelo) {
    this.Modelo = modelo;
  }

  public void setMarca(String marca) {
    Marca = marca;
  }

  public void setAno(int ano) {
    Ano = ano;
  }
}
