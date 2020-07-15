package lt.verbus;

public class Main {

    public static void main(String[] args) {
        CustomMap<String, String> customMap = new CustomMap<>();

        customMap.insert("Vienas", "Pirmas");
        customMap.insert("Du", "Antras");
        customMap.insert("Trys", "Trečias");
        customMap.insert("Keturi", "Ketvirtas");

        System.out.println(customMap);
        System.out.println(customMap.get("Trys"));
    }
}
