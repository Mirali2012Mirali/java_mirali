package urok;

public class Outerrr {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.test();
    }
}


class Outer {
    int outer_x = 100;
    int outer_x2 = 200;

    void test() {
        Inner inner = new Inner();
        inner.display();
    }

    class Inner {
        void display() {
            System.out.println(outer_x);
            System.out.println(outer_x2);
            System.out.println(outer_x + outer_x2);
            System.out.println(outer_x2 - outer_x);
        }
    }
}
