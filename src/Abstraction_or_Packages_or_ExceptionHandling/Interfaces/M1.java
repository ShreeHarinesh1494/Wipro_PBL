package Abstraction_or_Packages_or_ExceptionHandling.Interfaces;

interface Playable {
    void play();
}

class Veena implements Playable {
    @Override
    public void play() {
        System.out.println("Veena is playing...");
    }
}

class Saxophone implements Playable {
    @Override
    public void play() {
        System.out.println("Saxophone is playing...");
    }
}

public class M1 {
    public static void main(String[] args) {
        Veena veena = new Veena();
        Saxophone saxophone = new Saxophone();

        veena.play();            // Direct call
        saxophone.play();        // Direct call

        Playable p1 = veena;     // Polymorphic reference
        Playable p2 = saxophone;

        p1.play();               // Via interface
        p2.play();               // Via interface
    }
}

