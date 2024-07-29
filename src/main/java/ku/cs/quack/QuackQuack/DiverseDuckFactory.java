package ku.cs.quack.QuackQuack;

import ku.cs.quack.Ducks.*;

public class DiverseDuckFactory extends AbstractDuckFactory{
    public Quackable createMallardDuck() {
        return new QuackCounter(new QuackPolitely(new MallardDuck()));
    }
    public Quackable createRedheadDuck() {
        return new QuackCounter(new QuackPolitely(new RedheadDuck()));
    }
    public Quackable createDuckCall() {
        return new QuackCounter(new QuackPolitely(new DuckCall()));
    }
    public Quackable createRubberDuck() {
        return new QuackCounter(new QuackPolitely(new RubberDuck()));
    }
}
