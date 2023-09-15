package org.example.inheritance;

public class Frog extends Amphibian {

    public Frog() {
    }

    public Frog(String name) {
        this.setName(name);
    }

    @Override
    public void eat() {
        System.out.println("Frog is eating");
    }

    @Override
    public void makeSound() {
        System.out.println("frog makes sound");
    }

    @Override
    public void hunt() {
        System.out.println("Frog is being hunted");
    }

    @Override
    public void track() {

    }

    @Override
    public void socialize() {

    }
}
