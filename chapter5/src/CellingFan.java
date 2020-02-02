public class CellingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM =2;
    public static final int LOW =1 ;
    public static final int OFF =0;
    private String location;
    private int speed;

    public CellingFan(String location) {
        this.location = location;
        this.speed = OFF;
    }

    public void high() {

        System.out.println("높은속도 켬");
        this.speed = HIGH;
    }

    public void low() {
        System.out.println("낮은속도 켬");
        this.speed = LOW;
    }

    public void medium() {
        System.out.println("중간속도 켬");
        this.speed = MEDIUM;
    }

    public void off(){
        System.out.println("팬 끔");
        this.speed = OFF;
    }

    public int getSpeed() {
        return speed;
    }
}
