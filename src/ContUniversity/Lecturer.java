package ContUniversity;

public class Lecturer extends Person {
    private Degree degree;
    private String speciality;
    public String verb;


    public Lecturer(String name, Sex sex, String Faculty, String speciality, String verb, Degree degree) {
        super(name, sex, Faculty, verb);
        setspeciality(speciality);
        setDegree(degree);
    }

    public Degree getDegree() {
        return degree;
    }

    public void setDegree(Degree degree) {
        this.degree = degree;

    }

    public String getSpeciality() {
        return speciality;
    }

    public void setspeciality(String speciality) {
        if (speciality != null)
            this.speciality = speciality;
        else
            throw new IllegalArgumentException("Поле специальность не должен быыть пустым");
    }

    @Override
    public String getinf() {
        return " has " + getDegree() + " degree in " + getSpeciality();
    }
}
