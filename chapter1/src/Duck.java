public abstract class Duck {
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    public void performFly( ){
        flyBehavior.fly();//실제 어떻게 행동하는지는 FlyBehavior 구현체에 위임한다.
    }

    public void performQuack(){
        quackBehavior.quack(); //실제 어떻게 행동하는지는 quackBehavior 구현체에 위임한다.
    }

    public void swim() {
        System.out.println("수영수영");
    }

    public void print()
    {
        System.out.println("이 오리는");
        flyBehavior.fly();
        quackBehavior.quack();
        display();
    }

    public abstract void display();

}
