import com.test.Test_Actor.HelloActor;

public class Test_Scala_Actor {
    public static void main(String[] args) {
      new HelloActor("lvxw").start().$bang("lvxw1");
      new HelloActor("lvxw2").start().$bang("lvxw2");
    }

}
