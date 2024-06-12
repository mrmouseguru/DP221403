package buoi4.mvc.observer;

import java.util.LinkedList;
import java.util.List;

public class Publisher {

    //field
    private List<Subcriber> subcribers = new LinkedList<>();

    //method
    public void subcribe(Subcriber subcriber) {

        subcribers.add(subcriber);
        
    }

    public void unSubcribe(Subcriber subcriber) {
        subcribers.remove(subcriber);
    }

    public void notifySubcribers() 
    {
        for (Subcriber subcriber : subcribers) {
            subcriber.update();
        }    
    }

}
