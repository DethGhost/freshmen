package com.github.dethghost.freshmen.logic;

import com.github.dethghost.freshmen.entities.Professor;
import com.github.dethghost.freshmen.entities.Student;

import java.util.List;

/**
 * Created by Eugene Khudoliiv.
 * (eugenkhidoliiv@gmail.com)
 */
public interface Init {

    public List<Student> initStudents(int studentsInGroup, int numbersOfGroup);

    public List<Professor> initProfessors();

    public Student choseMonitor(List<Student> students);

    public List<Student> setMarks(List<Student> students);
}
