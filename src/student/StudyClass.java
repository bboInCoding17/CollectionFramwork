package student;

import java.util.ArrayList;
import java.util.List;

public class StudyClass {
    private String className;
    private String teacher;
    private List<Student> stuList;


    public void setClassName(String className){
        this.className = className;
    }

    public void setTeacher(String teacher){
        this.teacher = teacher;
    }
    public void setStuList(List<Student> stuList){
        this.stuList = stuList;
    }

    public String getClassName() {
        return className;
    }

    public String getTeacher() {
        return teacher;
    }

    public List<Student> getStuList() {
        return stuList;
    }

    }


