public class RedHeadDuck extends Duck{

    public RedHeadDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        super(flyBehavior,quackBehavior);
    }

    @Override
    public void display() {
        System.out.println("머리가 빨간 오리입니다");
    }

}
