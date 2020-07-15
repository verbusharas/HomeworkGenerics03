package lt.verbus;

public class Main {

    public static void main(String[] args) {
        //-----Test 1
        CustomMap<DnsProvider,DnsServer> dnsMap = new CustomMap<>();

        dnsMap.insert(DnsProvider.NETFLIX, new DnsServer("4.0.125.1", "4.0.125.2"));
        dnsMap.insert(DnsProvider.AMAZON_PRIME, new DnsServer("8.0.0.1", "8.0.0.2"));
        dnsMap.insert(DnsProvider.HBO, new DnsServer("3.3.5.1", "3.3.5.2"));

        System.out.println(dnsMap);
        System.out.println();
        System.out.println(dnsMap.get(DnsProvider.HBO));

        //-----Test 2
        CustomMap<String, String> customMap = new CustomMap<>();

        customMap.insert("Vienas", "Pirmas");
        customMap.insert("Du", "Antras");
        customMap.insert("Trys", "Trečias");
        customMap.insert("Keturi", "Ketvirtas");

        System.out.println(customMap);
        System.out.println(customMap.get("Trys"));
    }
}
