import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);

        File file = new File("data.dat");
        ArrayList<Zak> arr;

        if (file.exists()) {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            arr = (ArrayList<Zak>) ois.readObject();
            //System.out.println(arr);
        } else {
            arr = new ArrayList<Zak>();
        }

        Zak z = new Zak(sc.next(), sc.nextInt());

        z.zprumeruj();

        //if(sc.next() == z.jmeno)
        arr.add(z);

        Collections.sort(arr);

        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(arr);

        oos.close();

        System.out.println(arr);
    }
}