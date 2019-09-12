public class Note {
  void note() {
  }
}

/**
 * types (bits):
 * byte, 8
 * short, 16
 * int, 32
 * long, 64
 * float, 32
 * double, 64
 * boolean, depends on JVM
 * char, 16
 * 
 * examples:
 * int x = 123;
 * byte b = 89;
 * boolean isFun = true;
 * double d = 3.1415926;
 * char c = 'f';
 * int z = x;
 * long big = 3456789;
 * float f = 32.5f; // must has symbol 'f'
 */

/**
 * Array: also is Object
 * int[] nums;
 * nums = new int[7];
 */

/**
 * Java 通过值传递，即拷贝传递
 * 初始化的实例变量有默认值
 * 局部变量在使用前必须初始化
 * 
 * == 用来比较任何类型的两个变量，只是比较其中的字节组合
 */

/**
 * default (即默认，什么也不写）: 在同一包内可见，不使用任何修饰符。使用对象：类、接口、变量、方法。
 * private : 在同一类内可见。使用对象：变量、方法。 注意：不能修饰类（外部类）
 * public : 对所有类可见。使用对象：类、接口、变量、方法
 * protected : 对同一包内的类和所有子类可见。使用对象：变量、方法。 注意：不能修饰类（外部类）。
 * 
 * 接口里的变量都隐式声明为 public static final,而接口里的方法默认情况下访问权限为 public
 * 私有访问修饰符是最严格的访问级别，所以被声明为 private 的方法、变量和构造方法只能被所属类访问，并且类和接口不能声明为 private
 * 被声明为 public 的类、方法、构造方法和接口能够被任何其他类访问
 * 接口及接口的成员变量和成员方法不能声明为 protected，protected 需要从以下两个点来分析说明：
 *    子类与基类在同一包中：被声明为 protected 的变量、方法和构造器能被同一个包中的任何其他类访问；
 *    子类与基类不在同一包中：那么在子类中，子类实例可以访问其从基类继承而来的 protected 方法，而不能访问基类实例的protected方法
 * 
 * 父类中声明为 public 的方法在子类中也必须为 public。
 * 父类中声明为 protected 的方法在子类中要么声明为 protected，要么声明为 public，不能声明为 private。
 * 父类中声明为 private 的方法，不能够被继承。
 * 
 * static 修饰符，用来修饰类方法和类变量。
 * final 修饰符，用来修饰类、方法和变量，final 修饰的类不能够被继承，修饰的方法不能被继承类重新定义，修饰的变量为常量，是不可修改的。
 * abstract 修饰符，用来创建抽象类和抽象方法。
 * synchronized 和 volatile 修饰符，主要用于线程的编程。
 * transient 修饰符
 * 
 */
