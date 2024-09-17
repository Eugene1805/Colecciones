import java.util.*;

public class School {

    private String studentName;
    private String subject;

    public School() {
        this.studentName = studentName;
        this.subject = subject;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }


    public void addSubjects(String studentName, Set<String> subjects, Map<String,Set<String> > rel){
        // Si el estudiante ya tiene materias asignadas, se recuperan, si no se crea un nuevo conjunto
        Set<String> studentSubjects = rel.getOrDefault(studentName, new HashSet<>());

        // Se añaden todas las materias al conjunto
        studentSubjects.addAll(subjects);

        // Se asocian el conjunto de materias al estudiante
        rel.put(studentName, studentSubjects);
    }

}
