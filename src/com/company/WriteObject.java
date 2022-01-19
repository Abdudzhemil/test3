package com.company;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
       Person[] people = {new Person(5, "bob"), new Person(4, "mike"), new Person(2, "jon")};
       Person person1 = new Person(7, "ron");
       Person person2 = new Person(8, "tom");


        try {
            FileOutputStream fos = new FileOutputStream("people.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(people);
            oos.writeObject(person1);
            oos.writeObject(person2);


            oos.close();
        } catch (IOException e) {
            e.printStackTrace();

        }

    }


}
