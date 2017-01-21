package com.github.dethghost.freshmen.logic;

import com.github.dethghost.freshmen.entities.Professor;
import com.github.dethghost.freshmen.entities.Student;

import java.util.List;

/**
 * Created by Eugene Khudoliiv.
 * (eugenkhidoliiv@gmail.com)
 */
public class AutoInit implements Init{

    private int numbersOfGroup;

    public List<Student>  initStudents(int studentsInGroup, int numbersOfGroup){
        this.numbersOfGroup = numbersOfGroup;
        return null; // todo make and this method work
    }

    public List<Professor> initProfessors(){
        // init depends from numbersOfGroup
        return null;
    }

    public Student choseMonitor(List<Student> students){
        return null;
    }

    @Override
    public List<Student> setMarks(List<Student> students) {
        return null;
    }
}
