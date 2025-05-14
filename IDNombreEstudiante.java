import java.util.HashMap;

public class IDNombreEstudiante {
    public static void main(String[] args) {
        HashMap<Integer, String> estudiantes = new HashMap<>();
        estudiantes.put(101, "Laura");
        estudiantes.put(102, "Carlos");
        estudiantes.put(103, "Ana");

        for (Integer id : estudiantes.keySet()) {
            System.out.println("ID: " + id + " - Nombre: " + estudiantes.get(id));
        }
    }
}