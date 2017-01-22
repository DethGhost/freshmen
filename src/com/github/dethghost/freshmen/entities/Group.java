package com.github.dethghost.freshmen.entities;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Eugene Khudoliiv.
 * (eugenkhidoliiv@gmail.com)
 */
public class Group {


    private int number = 998;
    private Professor professor = null;
    private List<Student> students = new ArrayList<>();

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);

    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Group() {
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    @Override
    public String toString() {
        return "\n########## Group info ##########"
                + "\nProfessor: " + getProfessor()
                + "\nGroup number: " + getNumber();
    }
}
