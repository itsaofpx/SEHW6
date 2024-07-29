//6510450691 Podjanin Wachirawittayakul
package ku.cs.quack.QuackQuack;

import ku.cs.quack.Ducks.*;
import ku.cs.quack.QuackQuack.AbstractDuckFactory;
import ku.cs.quack.QuackQuack.Quackable;

public class DuckFactory extends AbstractDuckFactory {
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }
    public Quackable createRedheadDuck() {
        return new RedheadDuck();
    }
    public Quackable createDuckCall() {
        return new DuckCall();
    }
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }
}