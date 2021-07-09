package ru.geekbrains.architecture;

public class Director implements Executor{
    private Long id;
    private String surname;
    private String name;
    private String position;

    public Director() {
    }

    public Director(Long id, String surname, String name) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.position = "Директор";
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }
}
