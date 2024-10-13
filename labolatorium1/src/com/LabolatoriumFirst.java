/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com;

import java.util.ArrayList;
import java.util.List;

/**
 * @author student
 */
public class LabolatoriumFirst {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Student("Nowak", Major.IT));
        people.add(new Student("„Kowalska”", Major.TELECOMMUNICATION));
        people.add(new Student("„Biernacki”", Major.MATH));
        people.add(new Employee("Januszewski", 3000));
        people.add(new Employee("Sebiksowki", 5000));

        for (int i = 0; i < people.size(); i++) {
            if (people.get(i) instanceof Student currentStudent)
                currentStudent.addGrade((short) 6);
        }

        for (Person currentPerson : people) {
            if (currentPerson instanceof Student currentStudent)
                System.out.println(currentStudent);
        }

        int i = 0;
        while (i < people.size()) {
            if (people.get(i) instanceof Student currentStudent)
                System.out.println(currentStudent);
            i++;
        }


    }

}
