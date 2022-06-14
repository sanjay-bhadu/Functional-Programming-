package Serialisation;

import java.io.*;

public class serialisationExample {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Client client=new Client("Sanjay Bhadu",2,"sanjaybhadu2@gmail.com");
        FileOutputStream fileOutputStream=new FileOutputStream("r.text");
        ObjectOutputStream outputStream=new ObjectOutputStream(fileOutputStream);
        outputStream.writeObject(client);
        outputStream.close();
        fileOutputStream.close();
        // above we have done serialisation.
        //serialisation helps in saving content of a object.
        //serialisation also helps in transferring of file through internet.

        //deserialisation
        FileInputStream fileInputStream=new FileInputStream("r.text");
        ObjectInputStream inputStream=new ObjectInputStream(fileInputStream);
        Client ram=null;
        ram= (Client) inputStream.readObject();
        inputStream.close();
        fileInputStream.close();
        System.out.println(ram);
        //we can also perform serialisation and deserialisation in json file
        //we need to import extra library files and dependency
    }
}
