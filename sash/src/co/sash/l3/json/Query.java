package co.sash.l3.json;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="query")
public class Query {
    @XmlAttribute(namespace = "http://www.yahooapis.com/v1/base.rng")
    public int count;
    @XmlAttribute(namespace = "http://www.yahooapis.com/v1/base.rng")
    public String created;
    @XmlAttribute(namespace = "http://www.yahooapis.com/v1/base.rng")
    public String lang;
    @XmlElement(name="results")
    public Results results;

    @Override
    public String toString() {
        return "Query{" +
                "count=" + count +
                ", created='" + created + '\'' +
                ", lang='" + lang + '\'' +
                ", results=" + results +
                '}';
    }
}
