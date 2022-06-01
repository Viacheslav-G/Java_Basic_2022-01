package HomeWorkBank;

import org.jetbrains.annotations.NotNull;

import java.util.*;

class Account //implements Comparable<Client>
{


    private String Name;
    private int Rest;
    private Client Owner;

    public String getName() {
        return this.Name;
    }

    public int getRest() {
        return this.Rest;
    }

    public String getOwnerName() {return  this.Owner.getName() ;}

    public Account(Client Owner, String Name ){
        this.Owner = Owner;
        this.Name = Name;
    }


}
