package com.github.dethghost.freshmen.entities;

import java.util.Arrays;

/**
 * Created by Eugene Khudoliiv.
 * (eugenkhidoliiv@gmail.com)
 */
public class Student {

    private int age;
    private String fullName;
    private Group group;
    private int[] marks;
    private float averageMark;
    private boolean isPresent;
    private boolean isActive;
    private boolean isSmokes;
    private boolean isDrinks;
    private boolean isMonitor;

    public Student(int age, String fullName, Group group, int[] marks, float averageMark, boolean isPresent, boolean isActive, boolean isSmokes, boolean isDrinks, boolean isMonitor) {
        this.age = age;
        this.fullName = fullName;
        this.group = group;
        this.marks = marks;
        this.averageMark = averageMark;
        this.isPresent = isPresent;
        this.isActive = isActive;
        this.isSmokes = isSmokes;
        this.isDrinks = isDrinks;
        this.isMonitor = isMonitor;
    }

    public Student() {
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

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public float getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(float averageMark) {
        this.averageMark = averageMark;
    }

    public boolean isPresent() {
        return isPresent;
    }

    public void setPresent(boolean present) {
        isPresent = present;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public boolean isSmokes() {
        return isSmokes;
    }

    public void setSmokes(boolean smokes) {
        isSmokes = smokes;
    }

    public boolean isDrinks() {
        return isDrinks;
    }

    public void setDrinks(boolean drinks) {
        isDrinks = drinks;
    }

    public boolean isMonitor() {
        return isMonitor;
    }

    public void setMonitor(boolean monitor) {
        isMonitor = monitor;
    }

    @Override
    public String toString() {
        return "\n########## Student BIO ##########"
                + "\n" + "Name: " + getFullName()
                + "\n" + "Age: " + getAge()
                + "\n" + "Group: " + getGroup().getNumber()
                + "\n" + "Marks: " + Arrays.toString(getMarks())
                + "\n" + "Average Mark: " + getAverageMark()
                + "\n" + "Present today: " + isPresent()
                + "\n" + "Class monitor: " + isMonitor()
                + "\n" + "Active life: " + isActive()
                + "\n" + "Smokes: " + isSmokes()
                + "\n" + "Drinks: " + isDrinks() + "\n"
                + "--------------------------------";
    }
}

