package Bridge.remotes.impl;

import Bridge.devices.Device;

public class AdvancedRemote extends BasicRemote {
    public AdvancedRemote() {
    }

    public AdvancedRemote(Device device) {
        super(device);
    }

    public void mute() {
        System.out.println("Remote: mute");
        device.setVolume(0);
    }
}
