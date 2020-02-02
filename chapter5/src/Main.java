public class Main {
    public static void main(String[] args) {
        RemoteControlWithUndo remoteControlWithUndo = new RemoteControlWithUndo();

        Light light = new Light();

        LightOnCommand lightOnCommand = new LightOnCommand(light);

        remoteControlWithUndo.setCommand(1,lightOnCommand);

        remoteControlWithUndo.onButtonWasPushed(1);
        remoteControlWithUndo.undoButtonWasPushed();


    }
}
