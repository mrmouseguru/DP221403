package buoi2.dependency;

public class A {
    private String name;

    //function , method

    A(){
       
    }
    A(B bRemote){
        bRemote.printName();;

    }

    public void print() {
        B bRemote = new B();
        bRemote.printName();
    }

}
