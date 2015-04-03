package co.sash.l3.json.task;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.RandomAccessFile;

public class Main {

    public static void main(String[] args) throws Exception {

        byte[] buf;
        RandomAccessFile f = new RandomAccessFile("E:\\Project\\JD\\prog.kiev.ua\\prof\\java.prof.practice\\sash\\src\\co\\sash\\l3\\json\\json.txt", "r");
        try {
            buf = new byte[(int)f.length()];
            f.read(buf);
        } finally {
            f.close();
        }

        String result = new String(buf);

        Gson gson = new GsonBuilder().create();
        Person person = gson.fromJson(result, Person.class);

        System.out.print(person);

    }
}
