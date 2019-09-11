// import cat.*;
public class App {

  public static void main(String[] args) {
    BigDog bd = new BigDog(123);
    bd.getAge();
    System.out.println("\\");

    final String ID = "20131909";
    byte b = 23;
    short s = 233;
    int i = 233;
    long l = 233l;
    float f = 233.33f;
    double d = 233.33d;
    int id = 666;
    int io = 0666;
    int ih = 0x666;
  }
}

class BigDog extends Dog {
  int age;
  BigDog() {
    System.out.println("age: " + this.age);
  }
  BigDog(int age) {
    this.age = age;
    System.out.println("age: " + this.age);
  }
  void getAge() {
    System.out.println(this.age);
    System.out.println(this.name);
  }
  public static void test() {
  }
}
