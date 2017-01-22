package com.github.dethghost.freshmen.logic;

import com.github.dethghost.freshmen.entities.Student;
import com.github.dethghost.freshmen.logic.impl.AutoInitImpl;

import java.util.Scanner;

/**
 * Created by Eugene Khudoliiv.
 * (eugenkhidoliiv@gmail.com)
 */
public class Menu {

    private Scanner scanner;
    private AutoInitImpl autoInit = AutoInitImpl.getInstance();

    private void configure() throws InterruptedException {

        scanner = new Scanner(System.in);
        boolean doIt = true;
        do {
            System.out.println("Input option to start [1 - to auto configure, 2 - to manual]");
            switch (scanner.next()) {
                case ("1"):
                    System.out.println("You have chosen auto configuration"
                            + "\nWe're almost done, a little more and all.");
                    autoInit.init();
                    System.out.println("Congratulation, configuration fully completed");
                    menu();
                    doIt = false;
                    break;
                case ("2"):
                    System.out.println("You have chosen manual configuration");
                    Thread.sleep(1000);
                    System.err.println("It was a joke))");
                    autoInit.init();
                    System.out.println("Congratulation, configuration fully completed");
                    menu();
                    doIt = false;
                    break;
                default:
                    System.err.println("Illegal option, please enter valid.");
                    break;
            }

        } while (doIt);
    }

    public void start() {
        System.out.println("-------------- Hello! This is Freshmen. -------------"
                + "\nTo continue you have chose start option");
        try {
            configure();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void menu() throws InterruptedException {
        System.out.println("What you want to do now?");
        do {
            System.out.println("Available option:\n"
                    + "\n 1) Choose monitor"
                    + "\n 2) Show all students"
                    + "\n 3) Show monitor"
                    + "\n 4) Carry a roll"
                    + "\n 5) Show professors"
                    + "\n 6) Exit\n"
                    + "\nPlease input number of option:");
            switch (scanner.next()) {
                case ("1"):
                    System.out.println("Prepare for chose monitor");
                    System.out.println("-------------------------");
                    Thread.sleep(1000);
                    autoInit.choseMonitor(autoInit.getStudents());
                    break;
                case ("2"):
                    System.out.println("Show all students: ");
                    Thread.sleep(1000);
                    System.out.println(autoInit.getStudents());
                    break;
                case ("3"):
                    if (autoInit.getStudents().stream().anyMatch(Student::isMonitor)) {
                        System.out.println("Show monitors: ");
                        Thread.sleep(1000);
                        autoInit.getStudents().stream().filter(Student::isMonitor).forEachOrdered(System.out::println);
                    } else {
                        System.err.println("Before you need to chose monitor");
                    }
                    break;
                case ("4"):
                    boolean next = true;
                    while (next) {
                        System.out.println("Chose number of group [1 or 2]:");
                        switch (scanner.next()) {
                            case ("1"):
                                System.out.println("Students present in group 1");
                                Thread.sleep(1000);
                                autoInit.getStudents()
                                        .parallelStream()
                                        .filter((s) -> s.getGroup().getNumber() == 1)
                                        .filter(Student::isPresent)
                                        .forEachOrdered(System.out::println);
                                next = false;
                                break;
                            case ("2"):
                                System.out.println("Students present in group 2");
                                autoInit.getStudents()
                                        .parallelStream()
                                        .filter((s) -> s.getGroup().getNumber() == 2)
                                        .filter(Student::isPresent)
                                        .forEachOrdered(System.out::println);
                                next = false;
                                break;
                            default:
                                System.err.println("Illegal option, please enter valid.");
                        }
                    }
                case ("5"):
                    System.out.println("Professors: ");
                    Thread.sleep(1000);
                    autoInit.getProfessors().forEach(System.out::println);
                    break;
                case ("6"):
                    System.exit(0);
                default:
                    System.err.println("Illegal option, please enter valid.");
                    break;
            }
        } while (true);
    }
}
