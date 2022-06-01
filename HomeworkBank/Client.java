package HomeWorkBank;

import jdk.jfr.Name;
import org.jetbrains.annotations.NotNull;

import java.util.*;

 class Client //implements Comparable<Client>
 {
    private String Name;
    private int Age;

    public String getName() {
        return Name;
    }

    public int getAge() {
        return Age;
    }

    public Client(String Name, int Age){
       this.Name = Name;
       this.Age = Age;

    }

}
