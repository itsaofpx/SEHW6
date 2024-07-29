//6510450691 Podjanin Wachirawittayakul
package ku.cs.quack;
import ku.cs.quack.Goose.*;
import ku.cs.quack.Pigeon.Pigeon;
import ku.cs.quack.Pigeon.PigeonAdapter;
import ku.cs.quack.QuackQuack.*;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        simulator.simulate();

    }

    void simulate() {
        AbstractDuckFactory duckFactory = new DuckFactory();
        AbstractDuckFactory countingDuckFactory = new CountingDuckFactory();
        AbstractDuckFactory diverseDuckFactory = new DiverseDuckFactory();

        Quackable mallardDuck2 = countingDuckFactory.createMallardDuck();
        Quackable redheadDuck2 = countingDuckFactory.createRedheadDuck();
        Quackable duckCall2 = countingDuckFactory.createDuckCall();
        Quackable rubberDuck2 = countingDuckFactory.createRubberDuck();

        Flock flockOfDucks = new Flock();
        flockOfDucks.add(mallardDuck2);
        flockOfDucks.add(redheadDuck2);
        flockOfDucks.add(duckCall2);
        flockOfDucks.add(rubberDuck2);

        Quackable goose = new GooseAdapter(new Goose()); //normal goose
        Quackable pigeon = new PigeonAdapter(new Pigeon()); ////normal pigeon

        Flock flockOfGoosePigeon = new Flock();
        flockOfGoosePigeon.add(goose);
        flockOfGoosePigeon.add(pigeon);

        Quackable goose2 = new QuackPolitely(new GooseAdapter(new Goose())); // create PoliteGoose
        Quackable pigeon2 = new QuackPolitely(new PigeonAdapter(new Pigeon())); // create PolitePigeon

        Flock flockOfPoliteGoosePigeon = new Flock();
        flockOfPoliteGoosePigeon.add(goose2);
        flockOfPoliteGoosePigeon.add(pigeon2);

        Quackable mallardDuck = diverseDuckFactory.createMallardDuck();
        Quackable redheadDuck = diverseDuckFactory.createRedheadDuck();
        Quackable duckCall = diverseDuckFactory.createDuckCall();
        Quackable rubberDuck = diverseDuckFactory.createRubberDuck();

        Flock flockOfPoliteDucks = new Flock();
        flockOfPoliteDucks.add(mallardDuck);
        flockOfPoliteDucks.add(redheadDuck);
        flockOfPoliteDucks.add(duckCall);
        flockOfPoliteDucks.add(rubberDuck);


        System.out.println("\n--- Duck Simulator ---");

        simulate(flockOfDucks);

        System.out.println("\n----Polite Duck----");

        simulate(flockOfPoliteDucks);

        System.out.println("\n----Goose and Pigeon----");

        simulate(flockOfGoosePigeon);

        System.out.println("\n----Polite Goose and Pigeon----");

        simulate(flockOfPoliteGoosePigeon);

        System.out.println("\n----The Statistics----");

        System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times");
        System.out.println("The ducks politely quacked " + QuackPolitely.getCount() + " times"); //ไม่รวม goose & pigeon

        System.out.println("\n----END----");
    }

    void simulate(Quackable duck) {
        duck.quack();
    }
}