public class Car extends Vehicule {

  public Car(String brandString, int kilometers) {

    // constructor
    super(brandString, kilometers);
  }



  // implement abstract method
  @Override
  public String doStuff() {
    return String.format("Je suis %1s et je fais vroum vroum !", this.getBrandString());
  };
}
