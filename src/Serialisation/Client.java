package Serialisation;

import java.io.Serializable;

public class Client implements Serializable {
    private String name;
    private int id;
    private String email;
    public Client(String name,int id,String email)
    {
        this.name=name;
        this.id=id;
        this.email=email;
    }

    @Override
    public String toString(){
        return "ID: "+id+"\nNAME: "+name+"\nEMAIL: "+email;
    }


}
