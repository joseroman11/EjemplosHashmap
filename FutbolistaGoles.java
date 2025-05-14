import java.util.HashMap;

public class FutbolistaGoles {
    public static void main(String[] args) {
        HashMap<String, Integer> goles = new HashMap<>();
        goles.put("Messi", 805);
        goles.put("Cristiano Ronaldo", 873);
        goles.put("Mbappé", 300);
        goles.put("Haaland", 230);

        for (String nombre : goles.keySet()) {
            System.out.println(nombre + " ha marcado " + goles.get(nombre) + " goles.");
        }
    }
}