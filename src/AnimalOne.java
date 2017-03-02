/**
 * Created by Celia on 1/19/2017.
 */
class Animal {
    public String name;
    Animal(String name) {
        this.name = name;
    }
}

class CatTwo extends Animal {
    public String eyesColor;
    CatTwo(String n, String c) {
        super(n);
        eyesColor = c;
    }
}

class DogTwo extends Animal {
    public String furColor;
    DogTwo(String n, String c) {
        super(n);
        furColor = c;
    }
}

public class AnimalOne {
    public static void main (String args[]) {
        Animal a = new Animal("name");
        CatTwo c = new CatTwo("catname", "blue");
        DogTwo d = new DogTwo("dogname", "black");

        System.out.println(a instanceof Animal);
        System.out.println(c instanceof Animal);
        System.out.println(d instanceof Animal);
        System.out.println(a instanceof CatTwo);

        a = new DogTwo("bigYellow", "yellow");
        System.out.println(a.name);
        // System.out.println(a.furname);
        System.out.println(a instanceof Animal);
        System.out.println(a instanceof DogTwo);
        DogTwo d1 = (DogTwo)a;
        System.out.println(d1.furColor);
    }
}