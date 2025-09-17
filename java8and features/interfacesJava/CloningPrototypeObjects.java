class Prototype implements Cloneable {
    String name = "Prototype Object";
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class CloningPrototypeObjects {
    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype obj1 = new Prototype();
        Prototype obj2 = (Prototype) obj1.clone();
        System.out.println("Cloned: " + obj2.name);
    }
}