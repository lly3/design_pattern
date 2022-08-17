public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator duckSimulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingEchoDuckFactory();
        duckSimulator.simulateCompositePattern(duckFactory);
    }

    private void simulateAdapterPattern() {
        Quackable mallardDuck = new MallardDuck();
        Quackable redheadDuck = new RedheadDuck();
        Quackable duckCall = new DuckCall();
        Quackable rubberDuck = new RubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());
        Quackable pigeonDuck = new PigeonAdapter(new Pigeon());

        System.out.println("\nDuck Simulator: With Goose Adapter and Pigeon Adapter");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);
        simulate(pigeonDuck);

        System.out.println("-----------------------------------------------------------");
    }

    private void simulateCounterDecoratorPattern() {
        Quackable mallardDuck = new QuackCounter(new MallardDuck());
        Quackable redheadDuck = new QuackCounter(new RedheadDuck());
        Quackable duckCall = new QuackCounter(new DuckCall());
        Quackable rubberDuck = new QuackCounter(new RubberDuck());
        Quackable gooseDuck = new QuackCounter(new GooseAdapter(new Goose()));
        Quackable pigeonDuck = new QuackCounter(new PigeonAdapter(new Pigeon()));

        System.out.println("\nDuck Simulator: With Counter Decorator");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);
        simulate(pigeonDuck);

        System.out.println("The ducks quacked " + QuackCounter.getNumberOfQuacks() + " times");

        System.out.println("-----------------------------------------------------------");
    }

    private void simulateEchoDecoratorPattern() {
        Quackable mallardDuck = new QuackEcho(new MallardDuck());
        Quackable redheadDuck = new QuackEcho(new RedheadDuck());
        Quackable duckCall = new QuackEcho(new DuckCall());
        Quackable rubberDuck = new QuackEcho(new RubberDuck());
        Quackable gooseDuck = new QuackEcho(new GooseAdapter(new Goose()));
        Quackable pigeonDuck = new QuackEcho(new PigeonAdapter(new Pigeon()));

        System.out.println("\nDuck Simulator: With Echo Decorator");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);
        simulate(pigeonDuck);

        System.out.println("The ducks quacked " + QuackCounter.getNumberOfQuacks() + " times");

        System.out.println("-----------------------------------------------------------");
    }

    private void simulateCounterEchoDecoratorPattern() {
        Quackable mallardDuck = new QuackCounter(new QuackEcho(new MallardDuck()));
        Quackable redheadDuck = new QuackCounter(new QuackEcho(new RedheadDuck()));
        Quackable duckCall = new QuackCounter(new QuackEcho(new DuckCall()));
        Quackable rubberDuck = new QuackCounter(new QuackEcho(new RubberDuck()));
        Quackable gooseDuck = new QuackCounter(new QuackEcho(new GooseAdapter(new Goose())));
        Quackable pigeonDuck = new QuackCounter(new QuackEcho(new PigeonAdapter(new Pigeon())));

        System.out.println("\nDuck Simulator: With CounterEcho Decorator");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);
        simulate(pigeonDuck);

        System.out.println("The ducks quacked " + QuackCounter.getNumberOfQuacks() + " times");

        System.out.println("-----------------------------------------------------------");
    }

    private void simulateEchoCounterDecoratorPattern() {
        Quackable mallardDuck = new QuackEcho(new QuackCounter(new MallardDuck()));
        Quackable redheadDuck = new QuackEcho(new QuackCounter(new RedheadDuck()));
        Quackable duckCall = new QuackEcho(new QuackCounter(new DuckCall()));
        Quackable rubberDuck = new QuackEcho(new QuackCounter(new RubberDuck()));
        Quackable gooseDuck = new QuackEcho(new QuackCounter(new GooseAdapter(new Goose())));
        Quackable pigeonDuck = new QuackEcho(new QuackCounter(new PigeonAdapter(new Pigeon())));

        System.out.println("\nDuck Simulator: With EchoCounter Decorator");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);
        simulate(pigeonDuck);

        System.out.println("The ducks quacked " + QuackCounter.getNumberOfQuacks() + " times");

        System.out.println("-----------------------------------------------------------");
    }

    private void simulateAbstractFactoryPatternNoDecorator(AbstractDuckFactory duckFactory) {
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());
        Quackable pigeonDuck = new PigeonAdapter(new Pigeon());

        System.out.println("\nDuck Simulator: With Duck Factory");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);
        simulate(pigeonDuck);

        System.out.println("-----------------------------------------------------------");
    }

    private void simulateAbstractFactoryPatternCounterDecorator(AbstractDuckFactory duckFactory) {
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new QuackCounter(new GooseAdapter(new Goose()));
        Quackable pigeonDuck = new QuackCounter(new PigeonAdapter(new Pigeon()));

        System.out.println("\nDuck Simulator: With DuckCounter Factory");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);
        simulate(pigeonDuck);

        System.out.println("The ducks quacked " + QuackCounter.getNumberOfQuacks() + " times");

        System.out.println("-----------------------------------------------------------");
    }

    private void simulateAbstractFactoryPatternCounterEchoDecorator(AbstractDuckFactory duckFactory) {
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new QuackCounter(new QuackEcho(new GooseAdapter(new Goose())));
        Quackable pigeonDuck = new QuackCounter(new QuackEcho(new PigeonAdapter(new Pigeon())));

        System.out.println("\nDuck Simulator: With DuckCounter Factory");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);
        simulate(pigeonDuck);

        System.out.println("The ducks quacked " + QuackCounter.getNumberOfQuacks() + " times");

        System.out.println("-----------------------------------------------------------");
    }

    private void simulateCompositePattern(AbstractDuckFactory duckFactory) {
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new QuackCounter(new QuackEcho(new GooseAdapter(new Goose())));
        Quackable pigeonDuck = new QuackCounter(new QuackEcho(new PigeonAdapter(new Pigeon())));

        Flock flockOfDucks = new Flock();

        flockOfDucks.add(mallardDuck);
        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseDuck);
        flockOfDucks.add(pigeonDuck);

        Flock flockOfMallards = new Flock();

        Quackable mallardOne = duckFactory.createMallardDuck();
        Quackable mallardTwo = duckFactory.createMallardDuck();
        Quackable mallardThree = duckFactory.createMallardDuck();
        Quackable mallardFour = duckFactory.createMallardDuck();

        flockOfMallards.add(mallardOne);
        flockOfMallards.add(mallardTwo);
        flockOfMallards.add(mallardThree);
        flockOfMallards.add(mallardFour);

        flockOfDucks.add(flockOfMallards);

        System.out.println("Duck Simulator: Whole Flock Simulation");
        simulate(flockOfDucks);

        System.out.println("Duck Simulator: Mallard Flock Simulation");
        simulate(flockOfMallards);

        System.out.println("The ducks quacked " + QuackCounter.getNumberOfQuacks() + " times");
    }

    private void simulate(Quackable duck) {
        duck.quack();
    }
}
