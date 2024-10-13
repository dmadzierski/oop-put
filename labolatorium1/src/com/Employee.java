package com;

public class Employee extends Person {
    private int salary;
    private Position occupation;

    public String getName() {
        return super.getName();
    }

    public void setName(String name) {
        super.setName(name);
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Position getPosition() {
        return occupation;
    }

    public Employee(String name, int salary) {
        super(name);
        this.salary = salary;
        this.occupation = Position.ASSISTANT;
    }

    public void promote(Position newPosition) {
        this.occupation = newPosition;
    }

    @Override
    public String toString() {
        return """
                Pracownik: %s
                Pensja: %s
                Etat: %s
                """.formatted(super.getName(), this.salary, this.getPosition());
    }
}
