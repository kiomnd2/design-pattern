public class GreekPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("그리스하게 준비");
    }

    @Override
    public void bake() {
        System.out.println("그리스하게 구움");
    }

    @Override
    public void cut() {
        System.out.println("그리스하게 자름");
    }

    @Override
    public void box() {
        System.out.println("그리스하게 포장함");
    }
}
