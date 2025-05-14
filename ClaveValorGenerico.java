import java.util.HashMap;

public class ClaveValorGenerico {
    public static void main(String[] args) {
        HashMap<String, String> mapa = new HashMap<>();
        mapa.put("color", "azul");
        mapa.put("animal", "perro");
        mapa.put("ciudad", "Bogotá");

        for (String clave : mapa.keySet()) {
            System.out.println(clave + " => " + mapa.get(clave));
        }
    }
}