/**
 * Created by Celia on 1/24/2017.
 */
class AnimalTwo {
    private String name;
    AnimalTwo(String name) {
        this.name = name;
    }
    public void enjoy() {
        System.out.println("barking");
    }
}

class CatThree extends AnimalTwo {
    private String eyesColor;
    CatThree(String n, String c) {
        super(n);
        eyesColor = c;
    }
    public void enjoy() {
        System.out.println("Cat's Meow.");
    }
}

class DogThree extends AnimalTwo {
    private String furColor;
    DogThree(String n, String c) {
        super(n);
        furColor = c;
    }
    public void enjoy() {
        System.out.println("Dog's barking.");
    }
}

class Lady {
    private String name;
    private AnimalTwo pet;
    Lady(String name, AnimalTwo pet) {
        this.name = name;
        this.pet = pet;
    }
    public void myPetenjoy() {
        pet.enjoy();
    }
}

public class TestPolymophy {
    public static void main (String args[]) {
        CatThree c = new CatThree("catname", "blue");
        DogThree d = new DogThree("dogname", "black");

        Lady l1 = new Lady("l1", c);
        Lady l2 = new Lady("l2", d);

        l1.myPetenjoy();
        l2.myPetenjoy();
    }
}


