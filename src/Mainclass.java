
import  package_class.*;
import java.io.*;



public class Mainclass {
    public static void main(String args []) throws Exception{
        System.out.println("Изменения!!!");
        File f=new File("test.txt");
        if (f.exists()){
            String name="Denis";
            Myclass obMyClass=new Myclass(name,34,1234);
            Myclass obMyclass_2;
            try (ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(f));
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(f))){
                out.writeObject(obMyClass);
                obMyclass_2=(Myclass) in.readObject();
                System.out.println(obMyclass_2);
            }
            catch(Exception e){
                System.out.println("Беда с потоками ввода и выводов");

                }

        }
        else {
            System.out.println("Файл не найден");
        }



    }
}
