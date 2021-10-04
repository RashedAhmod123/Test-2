package rashed;

public class Student {
    /*  Name : Rashed Ahmod
        Id   : 2012020123
        Section : C
        E-mail : cse_2012020123@lus.ac.bd
        Date : 07/08/2021
    */
    String name;
    int id;
    static String universityName;

    Student()
    {
        System.out.println("Default constructor");
    }
    Student (String name)
    {
        this.name = name;
        System.out.println("Name: "+this.name);

    }

    Student (int id)
    {
        this.id = id;
        System.out.println("Id: "+this.id);
    }

    void display(){
        System.out.println("University Name: "+universityName);
    }

}
