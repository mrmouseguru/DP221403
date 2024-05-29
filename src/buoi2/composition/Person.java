package buoi2.composition;

public class Person {

    private String name;
    private Head headRemote;

    Person(){
       // headRemote = new Head();

    }

    public void control() {
        headRemote = new Head();
        headRemote.rotate();
        
    }



}
