public class RedHeadDuck extends Duck implements Quackable,Flyable{
    @Override
    void display() {
        System.out.println("빨간 오리의 오리");
    }

    @Override
    public void fly() {
        System.out.println("이쁘게 남");
    }

    @Override
    public void quack() {
        System.out.println("빨강빨강하게 움");
    }
}
