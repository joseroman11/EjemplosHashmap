import java.util.HashMap;

public class NombreTelefono {
    public static void main(String[] args) {
        HashMap<String, String> telefonos = new HashMap<>();
        telefonos.put("Juan", "3123456789");
        telefonos.put("María", "3109876543");
        telefonos.put("Pedro", "3001234567");

        for (String nombre : telefonos.keySet()) {
            System.out.println(nombre + ": " + telefonos.get(nombre));
        }
    }
}