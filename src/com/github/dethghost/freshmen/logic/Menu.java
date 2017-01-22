package com.github.dethghost.freshmen.logic;

import com.github.dethghost.freshmen.logic.impl.AutoInitImpl;

import java.util.Scanner;

/**
 * Created by Eugene Khudoliiv.
 * (eugenkhidoliiv@gmail.com)
 */
public class Menu {

    private Scanner scanner;
    private AutoInitImpl autoInit = AutoInitImpl.getInstance();

    private void configure() {

        scanner = new Scanner(System.in);
        boolean doIt = true;
        do {
            System.out.println("Input option to start [1 - to auto configure, 2 - to manual]");
            switch (scanner.next()) {
                case ("1"):
                    System.out.println("You have chosen auto configuration"
                            + "\nWe're almost done, a little more and all.");
                    autoInit.intiGroup();
                    autoInit.initProfessors();
                    autoInit.initStudents();

                    doIt = false;
                    break;
                case ("2"):
                    System.out.println("2");
                    doIt = false;
                    break;
                default:
                    System.out.println("Illegal option, please enter valid.");
                    break;
            }
            System.out.println("Congratulation, configuration fully completed");
            menu();
        } while (doIt);
    }

    public void start() {
        System.out.println("-------------- Hello! This is Freshmen. -------------"
                + "\nTo continue you have chose start option");
        configure();
    }

    private void menu(){
        boolean doIt = true;
        do {
        System.out.println("What you want to do now?");
        System.out.println("Available option:\n"
        +"\n 1) Choose monitor"
        +"\n 2) Show all students"
        +"\n 3) Exit"
        +"\nPlease input number of option:");
            switch (scanner.next()) {
                case ("1"):
                    System.out.println("Prepare for chose monitor");
                    System.out.println("-------------------------");
                    System.out.println("Monitor chosen:");
                    System.out.println(autoInit.choseMonitor(autoInit.getStudents()));


                    doIt = false;
                    break;
                case ("2"):
                    System.out.println("2");
                    doIt = false;
                    break;
                case ("3"):
                    System.exit(0);
                default:
                    System.out.println("Illegal option, please enter valid.");
                    break;
            }
        } while (doIt);
    }
}
