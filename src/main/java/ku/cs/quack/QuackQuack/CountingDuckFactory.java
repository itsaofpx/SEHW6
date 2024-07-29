//6510450691 Podjanin Wachirawittayakul
package ku.cs.quack.QuackQuack;
import ku.cs.quack.Ducks.*;
import ku.cs.quack.QuackQuack.AbstractDuckFactory;
import ku.cs.quack.QuackQuack.QuackCounter;
import ku.cs.quack.QuackQuack.Quackable;

public class CountingDuckFactory extends AbstractDuckFactory {
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }
    public Quackable createRedheadDuck() {
        return new QuackCounter(new RedheadDuck());
    }
    public Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }
    public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }
}