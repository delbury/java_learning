public class Dog {
  protected int size;
  String name = "a dog";

  void bark() {
    System.out.println(size);
  }
  public void setSize(int sz) {
    if(sz >= 0) {
      size = sz;
    }
  }
  public int getSize() {
    return size;
  }

  public static void st() {
    System.out.println("parent");
  }
}