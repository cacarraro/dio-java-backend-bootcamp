public class Test {
public static void main(String[] args) {
    Behavior normal = new NormalBehavior();

    Behavior defense = new DefensiveBehavior();

    Behavior attack = new OfensiveBehavior();

    Play play = new Play();
    play.setBehavior(normal);
    play.move();
    play.move();
    play.setBehavior(defense);
    play.move();
    play.setBehavior(attack);
    play.move();
    play.move();
    }
}
