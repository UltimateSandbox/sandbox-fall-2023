package org.example.inheritance;

public class Frog extends Amphibian {

    public Frog() {
    }

    public Frog(String name) {
        this.setName(name);
    }

    @Override
    public void eat() {
        System.out.println("eating frog");
    }

    @Override
    public void makeSound() {
        System.out.println("frog makes sound");
    }

    @Override
    public void hunt() {

    }

    @Override
    public void track() {

    }

    @Override
    public void socialize() {

    }
}
