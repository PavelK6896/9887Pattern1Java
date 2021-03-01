package app.web.pavelk.pattern1;

import app.web.pavelk.pattern1.devices.Device;
import app.web.pavelk.pattern1.devices.Radio;
import app.web.pavelk.pattern1.devices.Tv;
import app.web.pavelk.pattern1.remotes.AdvancedRemote;
import app.web.pavelk.pattern1.remotes.BasicRemote;

public class Demo {
    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
