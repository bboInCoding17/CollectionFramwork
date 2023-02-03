package student;

import java.util.List;

public class School {
    private List<StudyClass> StuClass;//학교 클래스는 여러 반을 가지고 있다.



    public List<StudyClass> getStuClass() {
        return StuClass;
    }

    public void setStuClass(List<StudyClass> stuClass) {
        StuClass = stuClass;
    }


}
