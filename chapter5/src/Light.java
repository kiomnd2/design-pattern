public class Light {
    private boolean toggled = false;

    public Light() {
    }

    public void toggle() {
        this.toggled = !this.toggled;
        if(this.toggled)
        {
            System.out.println("불켭니다");
        }
        else
        {
            System.out.println("불끕니다");
        }
    }


}
