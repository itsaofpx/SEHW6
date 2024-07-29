//6510450691 Podjanin Wachirawittayakul
package ku.cs.quack.Goose;

import ku.cs.quack.QuackQuack.Quackable;

public class GooseAdapter implements Quackable {
    Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.honk();
    }
}
