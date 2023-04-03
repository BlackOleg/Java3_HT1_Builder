package ru.olegivanov;

import java.util.Objects;

public class Person {
    protected String name;
    protected String surname;
    protected int age;
    protected String city;


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    private Person() {
    }

    public boolean hasAge() {
        return (age > 0);
    }

    public boolean hasAddress() {
        return (city != null);
    }

    public void happyBirthday() {
        System.out.println("Happy birthday!");
    }

    @Override
    public String toString() {
        return " Имя: " + this.name + ";\n" +
                " Фамилия: " + this.surname + ";\n" +
                " Возраст: " + this.age + ";\n" +
                " Адрес: " + this.age + ";\n";
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age);
    }

    public PersonBuilder newChildBuilder() {
        //     return new Person(). new PersonBuilder();
        return new PersonBuilder();
    }


}
