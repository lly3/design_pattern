import java.util.ArrayList;

public class Flock implements Quackable{
    private ArrayList<Quackable> quackers = new ArrayList<>();

    public void add(Quackable quacker) {
        quackers.add(quacker);
    }

    @Override
    public void quack() {
        for(int i = 0; i < quackers.size(); i++) {
            if(i == 0) {
                for(int j = 0; j < 3; j++) {
                    System.out.print("I'm the leader!: ");
                    quackers.get(i).quack();
                }
            }
            quackers.get(i).quack();
        }
    }
}
