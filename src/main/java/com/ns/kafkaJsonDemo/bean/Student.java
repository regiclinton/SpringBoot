package com.ns.kafkaJsonDemo.bean;

public class Student {

    // Data members of the
    // student class
    int id;
    String firstName;
    String lastName;

    // Constructor of the student
    // class
    public Student(int id, String firstName,
                   String lastName)
    {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Implementing the getters
    // and setters
    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
}