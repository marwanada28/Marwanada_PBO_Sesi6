package PBO;

public class MacBook implements Laptop {
    private int volume;
    private boolean isOn;

    public MacBook() {
        volume = 40;
        isOn = false;
    }

    public void powerOn() {
        isOn = true;
        System.out.println("MacBook menyala dengan Apple logo...");
    }

    public void powerOff() {
        isOn = false;
        System.out.println("MacBook dimatikan.");
    }

    public void volumeUp() {
        if (isOn) {
            volume += 15;
            System.out.println("Volume MacBook naik ke " + volume);
        } else {
            System.out.println("MacBook belum menyala.");
        }
    }

    public void volumeDown() {
        if (isOn) {
            volume -= 15;
            System.out.println("Volume MacBook turun ke " + volume);
        } else {
            System.out.println("MacBook belum menyala.");
        }
    }
}
