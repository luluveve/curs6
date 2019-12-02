package heroes;

public class Maige extends Hero {
    public Maige(String name, int hp, int mana) {
        super(name, hp, mana);
    }

    @Override
    public void firePrimary() {
        mana -=15;
    }

    @Override
    public void fireSecondary() {
      mana -=40;
    }

    @Override
    public void receiveHit() {
       hp -=30;
    }
}
