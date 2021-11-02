package ContUniversity;
public abstract class Person {
    // Name = first name + surname

    private String name;
    private Sex sex;
    private String Faculty;
    public String verb;

    public Person(String name, Sex sex, String Faculty, String verb) {
        setname(name);
        setSex(sex);
        setFaculty(Faculty);
        setverb(verb);
    }

    public String getName() {
        return name;

    }

    public void setname(String name) {
        if (name != null && !name.equals(""))
            this.name = name;
        else
            throw new IllegalArgumentException("Имя не должно быыть пустым");
    }

    public Sex getSex() {

        return sex;
    }

    public void setSex(Sex sex) {
        if (sex != null )
            this.sex = sex;
        else
            throw new IllegalArgumentException("Пол не должен быыть пустым");

    }

    public String getFaculty() {
        return Faculty;
    }

    public void setFaculty(String Faculty) {
        if (Faculty != null && !Faculty.equals(""))
            this.Faculty = Faculty;
        else
            throw new IllegalArgumentException("Поле факультет не должен быыть пустым");

    }

    public String getVerb() {
        return verb;
    }

    public void setverb(String verb) {
        if (verb != null && !verb.equals(""))
            this.verb = verb;
        else
            throw new IllegalArgumentException("глагол не должен быыть пустым");
    }

    public void print() {
        System.out.println("This is " + getName() + ". " + getSex().getCasei() + " " + getVerb() + " at " + getFaculty() + ". "  + getinf() + ".");

    }

    public abstract String getinf();

    public static void printAll(Person[] person) {
        for (Person p : person) {
            p.print();
            System.out.println();
        }
    }
}
