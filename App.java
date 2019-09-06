import cat.*;
public class App {

  public static void main(String[] args) {
    /**
     * types (bits):
     * byte, 8 | short, 16 | int, 32 | long, 64 | float, 32 | double, 64
     * boolean, depends on JVM | char, 16
     * 
     * examples:
     * int x = 123;
     * byte b = 89;
     * boolean isFun = true
     */
    Dog dog = new Dog();
    dog.size = 233;
    dog.bark();

    Cat cat = new Cat();
    cat.bark();
  }
}

