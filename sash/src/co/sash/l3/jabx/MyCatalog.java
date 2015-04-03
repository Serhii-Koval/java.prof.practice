package co.sash.l3.jabx;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@XmlRootElement(name="mycatalog")
public class MyCatalog {

    @XmlElement(name="mybook")
    private List<MyBook> myBooks = new ArrayList<MyBook>();

    public void add(MyBook myBook) {
        myBooks.add(myBook);
    }

    @Override
    public String toString() {
        return Arrays.deepToString(myBooks.toArray());
    }
}
