package buoi2.association;

public class AssoApp {
    public static void main(String[] args) {
        B bRemote = new B();

        A aRemote = new A(bRemote);
        aRemote.print();
    }

}
