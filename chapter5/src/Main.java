public class Main {
    public static void main(String[] args) {
        RemoteControlWithUndo remoteControlWithUndo = new RemoteControlWithUndo();

        Light light = new Light();
        CellingFan cellingFan = new CellingFan("부엌");

        LightOnCommand lightOnCommand = new LightOnCommand(light);
        CeilingFanHighCommand cellingfanCommand = new CeilingFanHighCommand(cellingFan);

        remoteControlWithUndo.setCommand(1,lightOnCommand);
        remoteControlWithUndo.setCommand(2,cellingfanCommand);

        remoteControlWithUndo.onButtonWasPushed(1);
        remoteControlWithUndo.undoButtonWasPushed();

        remoteControlWithUndo.onButtonWasPushed(2);
        remoteControlWithUndo.undoButtonWasPushed();



    }
}
