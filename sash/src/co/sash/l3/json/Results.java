package co.sash.l3.json;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Arrays;

@XmlRootElement(name="results")
public class Results {
    @XmlElement(name="rate")
    public Rate[] rate;

    @Override
    public String toString() {
        return "Results{" +
                "\n     rate=" + Arrays.toString(rate) +
                '}';
    }
}
