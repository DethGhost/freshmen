package com.github.dethghost.freshmen.logic;

import com.github.dethghost.freshmen.entities.Professor;
import com.github.dethghost.freshmen.entities.Student;

import java.util.List;
import java.util.Scanner;

/**
 * Created by Eugene Khudoliiv.
 * (eugenkhidoliiv@gmail.com)
 */
public interface Init {

    void initStudents();

    void initProfessors();

    Student choseMonitor(List<Student> students);

    void setMarks(List<Student> students);

    void intiGroup();

}
