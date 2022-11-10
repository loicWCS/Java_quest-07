public class Hangar {
  public static void main(String[] args) {

    // references to car and boat
    Car clio = new Car("Clio", 2);
    Boat titanic = new Boat("Titanic", 500);

    System.out.println(clio.doStuff());
    System.out.println(titanic.doStuff());

  }
}
