import java.util.ArrayList;

public class Flock implements Quackable{
    private ArrayList<Quackable> quackers = new ArrayList<>();
    private Quackable leader;

    public void add(Quackable quacker) {
        if(this.quackers.isEmpty()) {
            setLeader(quacker);
        }
        quackers.add(quacker);
    }

    @Override
    public void quack() {
        for(int i = 0; i < quackers.size(); i++) {
            if(i == 0) {
                leaderQuack();
            }
            quackers.get(i).quack();
        }
    }

    private void leaderQuack() {
        for(int j = 0; j < 3; j++) {
            System.out.print("I'm the leader!: ");
            this.leader.quack();
        }
    }

    private void setLeader(Quackable leader) {
        this.leader = leader;
    }
}
