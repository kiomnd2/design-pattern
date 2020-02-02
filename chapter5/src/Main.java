public class Main {
    public static void main(String[] args) {
        RemoteControlWithUndo remoteControlWithUndo = new RemoteControlWithUndo();

        Light light = new Light();
        CellingFan cellingFan = new CellingFan("부엌");

        LightOnCommand lightOnCommand = new LightOnCommand(light);
        CeilingFanHighCommand cellingfanCommand = new CeilingFanHighCommand(cellingFan);

        remoteControlWithUndo.setCommand(0,lightOnCommand);
        remoteControlWithUndo.setCommand(1,cellingfanCommand);

        remoteControlWithUndo.onButtonWasPushed(0);
        remoteControlWithUndo.undoButtonWasPushed();

        remoteControlWithUndo.onButtonWasPushed(1);
        remoteControlWithUndo.undoButtonWasPushed();

        System.out.println("###############Macro##############");
        MacroCommand macroCommand = new MacroCommand();
        macroCommand.addCommand(lightOnCommand);
        macroCommand.addCommand(cellingfanCommand);
        macroCommand.execute();

    }
}
