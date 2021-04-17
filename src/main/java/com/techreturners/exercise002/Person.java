package com.techreturners.exercise002;

public class Person {
    private String name;
    private String job;
    private String city;
    private int age;

    public Person(String name, String job, String city, int age) {
        this.name = name;
        this.job = job;
        this.city = city;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public String getCity() {
        return city;
    }

    public int getAge() {
        return age;
    }
}



