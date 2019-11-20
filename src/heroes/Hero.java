package heroes;

public class Hero {
    String name;
    int hp;
    int mana;

    public abstract void firePrimary ();
    public abstract void fireSecondary ();
    public abstract void receiveHit();
}
