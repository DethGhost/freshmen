package com.github.dethghost.freshmen.entities;

import java.util.List;

/**
 * Created by Eugene Khudoliiv.
 * (eugenkhidoliiv@gmail.com)
 */
public class Professor{

    private int age;
    private String fullName;
    private Group group;

    public Professor(int age, String fullName, Group group) {
        this.age = age;
        this.fullName = fullName;
        this.group = group;
    }

    public Professor() {
    }

    public void doMuster(List<Student> students){
        //todo make this method work
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }
}
