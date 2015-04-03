package co.sash.l3.jabx;

import com.sun.org.apache.xml.internal.resolver.Catalog;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.Date;

public class Main {
    
    public static void main(String[] args) {
        MyCatalog myCatalog = new MyCatalog();
        Trains trains = new Trains();
        myCatalog.add(new MyBook("Author1", "Title1", 14.55, new Date()));
        myCatalog.add(new MyBook("Author2", "Title2", 66, new Date()));

        try {
            File file = new File("E:\\Project\\JD\\prog.kiev.ua\\prof\\java.prof.practice\\sash\\src\\co\\sash\\l3\\jabx\\output.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(MyCatalog.class);
            Marshaller marshaller = jaxbContext.createMarshaller();

            // читабельное форматирование
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            // пишем в файл
            marshaller.marshal(myCatalog, file);
            marshaller.marshal(myCatalog, System.out);

            // читаем из файла
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            myCatalog = (MyCatalog) unmarshaller.unmarshal(file);
            System.out.println(myCatalog);



            /////////////////////////////

            System.out.println("===Trains parse===");
            file = new File("E:\\Project\\JD\\prog.kiev.ua\\prof\\java.prof.practice\\sash\\src\\co\\sash\\l3\\jabx\\trains.xml");
            jaxbContext = JAXBContext.newInstance(Trains.class);
            marshaller = jaxbContext.createMarshaller();
            unmarshaller = jaxbContext.createUnmarshaller();
            trains = (Trains)  unmarshaller.unmarshal(file);
            System.out.println(trains);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }  
}