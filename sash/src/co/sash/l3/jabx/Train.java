package co.sash.l3.jabx;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by pola on 02.04.2015.
 */
@XmlRootElement(name="train")
public class Train {
    @XmlAttribute
    String id;

    @XmlElement
    String from;

    @XmlElement
    String to;

    @XmlElement
    String date;

    @XmlElement
    String departure;

    @Override
    public String toString() {
        return "Train{" +
                "id='" + id + '\'' +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", date='" + date + '\'' +
                ", departure='" + departure + '\'' +
                '}';
    }
}
