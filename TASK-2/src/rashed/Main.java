package rashed;

public class Main {

    public static void main(String[] args) {

    /*  Name : Rashed Ahmod
        Id   : 2012020123
        Section : C
        E-mail : cse_2012020123@lus.ac.bd
        Date : 07/08/2021
    */
        Student st1 = new Student();
        Student.universityName="Leading University";

        Student st2 = new Student("Rashed Ahmod");
        Student st3 = new Student (2012020123);
        st1.display();

    }
}
