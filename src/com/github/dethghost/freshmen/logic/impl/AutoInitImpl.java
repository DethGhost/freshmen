package com.github.dethghost.freshmen.logic.impl;

import com.github.dethghost.freshmen.entities.Group;
import com.github.dethghost.freshmen.entities.Professor;
import com.github.dethghost.freshmen.entities.Student;
import com.github.dethghost.freshmen.logic.Init;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Eugene Khudoliiv.
 * (eugenkhidoliiv@gmail.com)
 */
public class AutoInitImpl implements Init {

    private static final AutoInitImpl instance = new AutoInitImpl();
    private List<Student> students = new ArrayList<>();
    private List<Group> groups = new ArrayList<>();
    private List<Professor> professors = new ArrayList<>();
    private String[] fullNames = {"Lazareva Valentina Makarovna",
            "Myasnikov Vladislav Tihonovich",
            "Stepanova Marfa Arsenevna",
            "Kolesnikov Germann Leonidovich",
            "Sharapova Antonina Varlamovna",
            "Baranov Donat Gennadevich",
            "Novikov Valeriy Ivanovich",
            "Polyakova Natalya Mstislavovna",
            "Simonova Ninel Kondratovna",
            "Kononov Fedosey Gennadevich",
            "KiselYova Darya Denisovna",
            "Artemeva Alla Pavlovna",
            "Moiseeva Iya Vsevolodovna",
            "Sitnikov Vladlen Hristoforovich",
            "Shestakova Yuliya Pavlovna",
            "Kapustin Vitaliy Nikitevich",
            "Guschin Gennadiy Vitalevich",
            "Teterin Onisim Kupriyanovich",
            "Orehov Vyacheslav Ulebovich",
            "KorolYova Regina SemYonovna",
            "Kopyilov Albert Yulianovich",
            "Subbotina Kira Sergeevna",
            "Merkushev Mels Valerevich",
            "Matveev Vitaliy SemYonovich",
            "Tsvetkov Fedosey Viktorovich",
            "Kryilov Boris Stanislavovich",
            "Seliverstov Albert Evseevich",
            "Danilova FYokla Gelasevna",
            "Evseeva Alina Hristoforovna",
            "Larionova Kseniya Vladlenovna",
            "Arhipova Evgeniya Hristoforovna",
            "Fadeev Varlam Dmitrevich"};

    private AutoInitImpl() {
    }

    public static AutoInitImpl getInstance() {
        return instance;
    }

    @Override
    public void init() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("Initialization");
        Thread.sleep(1000);
        intiGroup();
        Thread.sleep(1000);
        initProfessors();
        Thread.sleep(1000);
        initStudents();
    }

    public void initStudents() {
        System.out.println("15 students in each Group");
        int names = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 15; j++) {
                students.add(
                        new Student((int) (Math.random() * 30 + 15),
                                fullNames[names],
                                groups.get(i),
                                null,
                                0.0f,
                                Math.random() > 0.5,
                                Math.random() > 0.5,
                                Math.random() > 0.5,
                                Math.random() > 0.5,
                                false));
                groups.get(i).addStudent(students.get(names++));
                groups.get(i).setNumber(i + 1);
            }
        }
        setMarks(students);
        System.out.println("Students created");

    }

    @Override
    public void initProfessors() {

        for (int i = 0; i < groups.size(); i++) {
            professors.add(new Professor(55, fullNames[fullNames.length - 1 - i], groups.get(i)));
        }
        System.out.println("Professors created");
    }

    public void choseMonitor(List<Student> students) {
        if (students.stream().allMatch((s) -> s.isMonitor() == false)) {
            for (Group group : groups) {
                List<Student> studentList = new ArrayList<>();
                for (Student student : group.getStudents()) {
                    if (student.isActive() & !student.isDrinks() & !student.isSmokes() & student.isPresent()) {
                        studentList.add(student);
                    } else if (student.isActive() & !student.isDrinks()) {
                        studentList.add(student);
                    } else if (student.isActive()) {
                        studentList.add(student);
                    }
                }
                int i = (int) (Math.random() * studentList.size());
                studentList.get(i).setMonitor(true);
                System.out.println("Monitor for group[" + group.getNumber() + "]: " + "\n" + studentList.get(i));
            }
        } else {
            System.err.println("You already chose monitor, try another option");
        }
    }

    @Override
    public void setMarks(List<Student> students) {

        for (Student student : students) {
            student.setMarks(new int[]{((int) (Math.random() * 5)), ((int) (Math.random() * 5)), ((int) (Math.random() * 5)), ((int) (Math.random() * 5)), ((int) (Math.random() * 5))});
            int average = 0;
            for (int i : student.getMarks()) {
                average += i;
            }
            student.setAverageMark(average / student.getMarks().length);
        }
    }

    @Override
    public void intiGroup() {
        System.out.println("We created two groups.");
        groups.add(new Group());
        groups.add(new Group());
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public List<Professor> getProfessors() {
        return professors;
    }
}
