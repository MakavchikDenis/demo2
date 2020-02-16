package package_class;

import java.io.Serializable;

public class Myclass implements Serializable {
    public String name;
    public int age;
    public int sales;
    public Myclass(String name,int age,int sales){
        this.name=name;
        this.age=age;
        this.sales=sales;
    }
    @Override
    public String toString(){
        return  name+", "+age+", "+sales;
    }
}
