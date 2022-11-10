public abstract class Vehicule {
  private String brandString;
  private int kilometers;

  // constructor
  public Vehicule(String brandString, int kilometers) {
    this.brandString = brandString;
    this.kilometers = 0;
  }

  // getters
  public String getBrandString() {
    return this.brandString;
  }

  public int getKilometers() {
    return this.kilometers;
  }

  // Setters

  public void setBrandString(String newBrand) {
    this.brandString = newBrand;
  };

  public void setKilometers(int newKilometers) {
    this.kilometers = newKilometers;
  };

  // abstract method
  public abstract String doStuff();

}
