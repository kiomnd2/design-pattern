public class Main {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck( new FlyWithWings(),new Quack());
        mallardDuck.print();

        System.out.println("===========================");
        Duck redheadDuck = new RedHeadDuck( new FlyWithWings(),new Squeak());
        redheadDuck.print();




    }
}
