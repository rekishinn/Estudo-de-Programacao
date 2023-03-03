import java.util.TreeMap;

public class Collection_TreeMap_exemplo001 {
    public static void main(String[] args) {
        
        TreeMap<String, String> mapaNomes = new TreeMap<>();
        mapaNomes.put("vava", "Oswaldo");
        mapaNomes.put("gisa", "Gisele");
        mapaNomes.put("gigi", "Giovanna");
        mapaNomes.put("giugiu", "Giulianna");

        System.out.println("LinkedHashMap: " + mapaNomes);

        System.out.println("Chaves: " + mapaNomes.keySet());
        System.out.println("Valores: " + mapaNomes.values());
        System.out.println("Chaves/valores: " + mapaNomes.entrySet());

    }
}
