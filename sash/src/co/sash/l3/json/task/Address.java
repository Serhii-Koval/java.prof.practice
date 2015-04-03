package co.sash.l3.json.task;

/**
 * Created by Bios on 07.02.2015.
 */
public class Address {
    String city;
    String country;
    String street;

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", street='" + street + '\'' +
                '}';
    }

    public Address() {}
}
