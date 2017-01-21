package com.github.dethghost.freshmen.logic;

import com.github.dethghost.freshmen.entities.Professor;
import com.github.dethghost.freshmen.entities.Student;

import java.util.List;

/**
 * Created by Eugene Khudoliiv.
 * (eugenkhidoliiv@gmail.com)
 */
public class ManualInit implements Init {
    @Override
    public List<Student> initStudents(int studentsInGroup, int numbersOfGroup) {
        return null;
    }

    @Override
    public List<Professor> initProfessors() {
        return null;
    }

    @Override
    public Student choseMonitor(List<Student> students) {
        return null;
    }

    @Override
    public List<Student> setMarks(List<Student> students) {
        return null;
    }
}
