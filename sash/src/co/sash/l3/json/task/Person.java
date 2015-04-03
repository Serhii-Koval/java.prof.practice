package co.sash.l3.json.task;

import java.util.Arrays;

/**
 * Created by Bios on 07.02.2015.
 */
public class Person {
    String name;
    String surname;
    String[] phones;
    String[] sites;
    Address address;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phones=" + Arrays.toString(phones) +
                ", sites=" + Arrays.toString(sites) +
                ", address=" + address +
                '}';
    }

    public Person() {}
}
