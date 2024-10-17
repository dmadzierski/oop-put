package com.madzierski.daniel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Student extends Person {

    private long index;
    private double avgGrade;
    private Major vocation;
    private List<Short> grades;
    private static long indexNumerator = 0;

    public long getIndex() {
        return index;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public Major getVocation() {
        return vocation;
    }

    public List<Short> getGrades() {
        return grades;
    }

    public Student(String name, Major vocation) {
        super(name);
        this.index = indexNumerator++;
        this.vocation = vocation;
        this.grades = new ArrayList<>();
    }

    public void addGrade(short newGrade) {
        this.grades.add(newGrade);
        this.avgGrade = grades.stream().mapToInt(Integer::valueOf).average().getAsDouble();
    }

    @Override
    public String toString() {
        return """
                Student: %s,
                Średnia: %s,
                Oceny: %s
                Kierunke: %s
                """.formatted(super.getName(), this.avgGrade,
                this.grades.stream().map(String::valueOf).collect(Collectors.joining(", ")),
                this.vocation
                );
    }
}
