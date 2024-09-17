import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<String> subjects = new HashSet<>(Arrays.asList("DyPOO", "Bases de datos", "Procesos de software", "Requisitos de software"));

        ArrayList<String> students = new ArrayList<>(Arrays.asList("Genaro", "Gerardo", "Lizeth", "Aldo", "Abraham", "Carlos", "Yael", "Uriel",
                "José", "Arturo", "Diego", "Miguel", "Omar", "Brayan", "Alan", "Eugenio", "Gabriel", "Jorge", "Adrián", "Seth", "Alejandro",
                "Alexander", "Omar", "Mauricio", "Leonardo", "Angel", "Sebastian", "Rodrigo", "Irving", "Luis", "Juan", "Astrid", "Erick"));

        Map<String, Set<String>> rel = new HashMap<>();

        School school = new School();
        //Agrega las materias para cada estudiante
        for (String s: students){
            school.addSubjects(s, subjects, rel);
            System.out.println(s + ": " + rel.get(s));
        }

        ArrayList<String> arrayDeMaterias = new ArrayList<>();

        //Obtener las materias de un solo estudiante
        String a = "Eugenio";
        System.out.println(String.format( "Las materias del alumno %s son:",a));
        System.out.println(rel.get(a));

    }
}