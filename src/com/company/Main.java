package com.company;

public class Main {

    public static void main(String[] args) {
        Person1 person1 = new Person1("Bob",44 );

        System.out.println(person1.getAge());
        person1.speak();
        Person1 person2 = new Person1();

        person2.speak();



        int years1 = person1.RaschetLetDoPensii();
        int years2 = person2.RaschetLetDoPensii();
        System.out.println("До пенсии осталось " + years1 + "лет.");
        System.out.println("До пенсии осталось " + years2 + "лет.");



    }
}

    class Person1{
        private String name;
        private int age;
        public Person1 (){
            this.name = "Imya netu";
            this.age = 0;
        }
        public Person1 (String name, int age){
            this.name = name;
            this.age = age;
        }


        public void setName(String name){
            if (name.isEmpty()){
                System.out.println("Ti vvel nepravilno!!!");
            } else {

            this.name = name;}
        }
        public String getName(){
            return name;
        }
        public void setAge(int userAge){
            if (userAge<0){System.out.println("Ti durak!!!");
            } else {age = userAge;}
        }
        public int getAge(){
            return age;
        }
        int RaschetLetDoPensii(){
            int years = 65 - age;
            return years;

        }
        void speak (){

            System.out.println("Меня зовут " + name+", "+ "мне " + age +" лет." );
        }
}


