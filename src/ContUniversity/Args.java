package ContUniversity;

public class Args {
    public static void main(String[] args) {
        Person[] person = {
                new Lecturer("Ronald Turner", Sex.M, "Computer scince", "Progamming paradigms", "teaches", Degree.PhD),
                new Lecturer("Ruth Hollings", Sex.F, "Jurisprudence", "Domestic aritration", "teaches", Degree.MSc),
                new Students("Leo Wilcinson", Sex.M, "Computer scince", 3, StudentsStage.Bachelor, "studies"),
                new Students("Anna Cunningham", Sex.F, "World economy", 1, StudentsStage.Bachelor, "studies"),
                new Students("Jill Lundqvist", Sex.F, "Jurisprudence", 1, StudentsStage.Master, "studies"),
                new Students("Ronald Correa", Sex.M, "Computer scince", StudentsStage.Graduatestudent, "Design of functional programming language", "studies")
        };
        Person.printAll(person);
    }
}