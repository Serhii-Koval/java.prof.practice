package co.sash.l3.json;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="rate")
public class Rate {
    @XmlAttribute(name="id")
    public String id;
    @XmlElement
    public String Name;
    @XmlElement
    public double Rate;
    @XmlElement
    public String Date;
    @XmlElement
    public String Time;
    @XmlElement
    public String Ask;
    @XmlElement
    public String Bid;

    @Override
    public String toString() {
        return "\n        Rate{" +
                "id='" + id + '\'' +
                ", Name='" + Name + '\'' +
                ", Rate=" + Rate +
                ", Date='" + Date + '\'' +
                ", Time='" + Time + '\'' +
                ", Ask='" + Ask + '\'' +
                ", Bid='" + Bid + '\'' +
                '}';
    }
}
