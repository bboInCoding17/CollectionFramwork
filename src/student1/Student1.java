package student1;

public class Student1 {
    private String studentName;
    private int korScore;
    private int engScore;
    private int ave;




    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getKorScore() {
        return korScore;
    }

    public void setKorScore(int korScore) {
        this.korScore = korScore;
    }

    public int getEngScore() {
        return engScore;
    }

    public void setEngScore(int engScore) {
        this.engScore = engScore;
    }

    public int getAve() {
        return ave;
    }

    public void setAve() {
        this.ave = korScore + engScore;
    }



    @Override
    public String toString() {
        return "student1{" +
                "studentName='" + studentName + '\'' +
                ", korScore=" + korScore +
                ", engScore=" + engScore +
                ", ave=" + ave +
                '}';
    }
}
