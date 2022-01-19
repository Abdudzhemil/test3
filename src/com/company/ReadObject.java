package com.company;

import java.io.FileInputStream;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObject  {
    public static void main(String[] args) {


        try {
            FileInputStream fis =new FileInputStream("people.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Person[] people = (Person[]) ois.readObject();
            System.out.println(Arrays.toString(people));
            Person person1 = (Person) ois.readObject();
            Person person3 = new Person(5, "bob");

            System.out.println(person3.getId()+" : "+ person3.getName());
            Person person2 = (Person) ois.readObject();
            System.out.println(person1);
            System.out.println(person2);
            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();



        }

    }
}
