import java.util.HashMap;

public class FutbolistaCamiseta {
    public static void main(String[] args) {
        HashMap<String, Integer> camisetas = new HashMap<>();
        camisetas.put("Modric", 10);
        camisetas.put("Casemiro", 14);
        camisetas.put("Kroos", 8);

        for (String nombre : camisetas.keySet()) {
            System.out.println(nombre + " usa la camiseta número " + camisetas.get(nombre));
        }
    }
}