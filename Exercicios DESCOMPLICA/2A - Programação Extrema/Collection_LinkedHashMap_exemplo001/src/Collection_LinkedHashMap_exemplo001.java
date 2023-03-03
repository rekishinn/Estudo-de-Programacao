import java.util.LinkedHashMap;

public class Collection_LinkedHashMap_exemplo001 {
    public static void main(String[] args) {
        
        LinkedHashMap<String, String> listaNomes = new LinkedHashMap<>();
        listaNomes.put("vava", "Oswaldo");
        listaNomes.put("gisa", "Gisele");
        listaNomes.put("gigi", "Giovanna");
        listaNomes.put("giugiu", "Giulianna");

        System.out.println("LinkedHashMap: " + listaNomes);

        LinkedHashMap<String, String> novaListaNomes = new LinkedHashMap<>(listaNomes); //to "linkando" novaListaNomes em listaNomes
        novaListaNomes.put("Jubis", "Jujuba");
        System.out.println("Nova LinkedMap: " + novaListaNomes); //printa a mesma lista que listaNomes + oq foi adicionado em novaListaNomes

    }
}
