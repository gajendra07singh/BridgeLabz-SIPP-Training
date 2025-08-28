class Pet {
    String name;
    int age;
    Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}


class Dog extends Pet {
    boolean isFriendly;

    Dog(String name, int age, boolean isFriendly) {
        super(name, age); 
        this.isFriendly = isFriendly;
    }

    void display() {
        super.display();   
        System.out.println("Is Friendly: " + isFriendly);
    }
}


class Cat extends Pet {
    boolean jumping;

    Cat(String name, int age, boolean jumping) {
        super(name, age);
        this.jumping = jumping;
    }

    void display() {
        super.display();
        System.out.println("Jumping: " + jumping);
    }
}


class Bird extends Pet {
    boolean canFly;

    Bird(String name, int age, boolean canFly) {
        super(name, age);
        this.canFly = canFly;
    }

    void display() {
        super.display();
        System.out.println("Can Fly: " + canFly);
    }
}
