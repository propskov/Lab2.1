package ContUniversity;

import javax.naming.Name;

public class Students extends Person {

    private StudentsStage stage;
    public int course;
    private String thesis;

    public Students(String name, Sex sex, String Faculty, int course, StudentsStage stage, String verb) {
        super(name, sex, Faculty, verb);
        setStudentsstage(stage);
        setCourse(course);

    }

    public Students(String name, Sex sex, String Faculty, StudentsStage stage, String thesis, String verb) {
        super(name, sex, Faculty, verb);
        setThesis(thesis);

    }

    public String getThesis() {
        return thesis;
    }

    public void setThesis(String thesis) {
        this.thesis = thesis;

    }

    public StudentsStage getStage() {
        return stage;
    }

    public void setStudentsstage(StudentsStage stage) {
        if (stage != null)
            this.stage = stage;
        else
            throw new IllegalArgumentException("Поле ступень не должен быыть пустым");
    }


    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        if (course >= 0 && course <= 6)
            this.course = course;
        else
            throw new IllegalArgumentException("Время обучения 1-4 года или 1-6 лет");
    }

    @Override
    public String getinf() {
        if (course != 0)
            return getSex().getCasei() + " is " + getCourse() + "'th " + "year " + getStage() + " student";
        else
            return getSex().getCasev() + " thesis title is " + thesis;

    }

}
