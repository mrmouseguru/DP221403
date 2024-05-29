package buoi2.association;

public class A {
    private B bRemote;

    //function , method

    A(){}
    A(B bRemote){
        this.bRemote = bRemote;

    }

    public void print() {
        bRemote.printName();
    }

}
