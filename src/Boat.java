public class Boat extends Vehicule {

  public Boat(String brandString, int kilometers) {

    // constructor
    super(brandString, kilometers);
  }


  // implement abstract method
  @Override
  public String doStuff() {
    return String.format("Je suis %1s et je fais glou glou !", this.getBrandString());
  };

}


