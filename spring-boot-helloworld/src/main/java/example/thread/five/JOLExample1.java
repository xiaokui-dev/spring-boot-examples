package example.thread.five;

import org.openjdk.jol.info.ClassLayout;

public class JOLExample1 {
    static  A a = new A();

    public static void main(String[] args) {
        User user = new User();
        System.out.println(ClassLayout.parseInstance(user).toPrintable());
    }
}
