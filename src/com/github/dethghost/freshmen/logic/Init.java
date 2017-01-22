package com.github.dethghost.freshmen.logic;

import com.github.dethghost.freshmen.entities.Student;

import java.util.List;

/**
 * Created by Eugene Khudoliiv.
 * (eugenkhidoliiv@gmail.com)
 */
public interface Init {

    void init() throws InterruptedException;

    void initStudents();

    void initProfessors();

    void choseMonitor(List<Student> students);

    void setMarks(List<Student> students);

    void intiGroup();

}
