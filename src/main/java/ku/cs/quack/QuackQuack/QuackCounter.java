//6510450691 Podjanin Wachirawittayakul
package ku.cs.quack.QuackQuack;

public class QuackCounter implements Quackable {
    Quackable duck;
    static int numberOfQuacks;
    public QuackCounter (Quackable duck) {
        this.duck = duck;
    }
    public void quack() {
        duck.quack();
        numberOfQuacks++;
    }
    public static int getQuacks() {
        return numberOfQuacks;
    }
}