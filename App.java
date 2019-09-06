import cat.*;
public class App {

  public static void main(String[] args) {
    // Dog dog = new Dog();
    // dog.size = 233;
    // dog.bark();

    // Cat cat = new Cat();
    // cat.bark();

    // Dog bd = new BigDog();
    // bd.bark();
    Dog dogs[] = new Dog[5];
    for(int i = 0; i < dogs.length; i++) {
      dogs[i] = new Dog();
    }
  }
}

class BigDog extends Dog {

}
