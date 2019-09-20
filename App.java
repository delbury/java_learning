import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;

// import cat.*;
public class App {

  public static void main(String[] args) {
    BigDog bd = new BigDog(123);
    bd.getAge();
    bd.sleep(123, 233, 444);
    bd.sleep(new int[]{ 1, 2, 3, 4 });
    bd = null;

    // final String ID = "20131909";
    // byte b = 23;
    // short s = 233;
    // int i = 233;
    // long l = 233l;
    // float f = 233.33f;
    // double d = 233.33d;
    // int id = 666;
    // int io = 0666;
    // int ih = 0x666;
    
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
  void bark() {
    this.size = 23333;
    System.out.println(size);
  }
  public void sleep(int... times) {
    for(int time : times) {
      System.out.println("sleep: " + time);
    }
    st();
    super.st();
  }
  protected void finalize() {
    System.out.println("This BigDog instance will die.");
  }
  public static void st() {
    System.out.println("child");
    // Collections.sort(new String[]{"1", "2", "3"}, (s1, s2) -> s1.compareTo(s2));
    String st = "123" + 2333;
  }
}

abstract class Temp {
  int height;
  public abstract void grow(int name);
  public abstract void grow();
}

class Temp2 extends Temp implements Api, Api2 {
  public void grow(int name) {}
  public void grow() {}
  public void setTime() {}
}

interface Api {
  String One = "1";
  void setTime();
  enum CONSTS {};
}

interface Api2 extends Api {
  void setTime();
}
class Box<T> {}
