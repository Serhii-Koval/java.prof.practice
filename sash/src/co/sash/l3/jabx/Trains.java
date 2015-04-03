package co.sash.l3.jabx;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by pola on 02.04.2015.
 */
@XmlRootElement(name="trains")
public class Trains {
    @XmlElement(name="train")
    private List<Train> train = new ArrayList<>();

    @Override
    public String toString() {
        return "Trains{" +
                "train=" + train +
                '}';
    }
}
