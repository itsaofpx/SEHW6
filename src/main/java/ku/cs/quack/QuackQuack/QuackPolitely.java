package ku.cs.quack.QuackQuack;

public class QuackPolitely implements Quackable{
    Quackable duck;
    static int count;
    String sound = "nakubajarn";

    public QuackPolitely (Quackable duck) {
        this.duck = duck;
    }
    @Override
    public void quack() {
        duck.quack();
        System.out.println(sound);
        count++;
    }

    public static int getCount() {
        return count;
    }
}
