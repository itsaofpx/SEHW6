package ku.cs.quack;

import ku.cs.quack.QuackQuack.Quackable;

import java.util.ArrayList;
import java.util.Iterator;

public class Flock implements Quackable {
    ArrayList quackers = new ArrayList();
    public void add(Quackable quacker) {
        quackers.add(quacker);
    }
    public void quack() {
        Iterator iterator = quackers.iterator();
        int i = 1;
        while (iterator.hasNext()) {
            Quackable quacker = (Quackable)iterator.next();
            if(i == 1){
                quacker.quack();
                quacker.quack();
                quacker.quack();
            }i--;
            quacker = (Quackable)iterator.next();
            quacker.quack();
        }
    }
}