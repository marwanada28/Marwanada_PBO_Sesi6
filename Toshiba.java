package PBO;

public class Toshiba implements Laptop {
    private int volume;
    private boolean isOn;

    public Toshiba() {
        volume = 30;
        isOn = false;
    }

    public void powerOn() {
        isOn = true;
        System.out.println("Laptop Toshiba menyala...");
    }

    public void powerOff() {
        isOn = false;
        System.out.println("Laptop Toshiba dimatikan.");
    }

    public void volumeUp() {
        if (isOn) {
            volume += 5;
            System.out.println("Volume Toshiba naik ke " + volume);
        } else {
            System.out.println("Laptop belum menyala.");
        }
    }

    public void volumeDown() {
        if (isOn) {
            volume -= 5;
            System.out.println("Volume Toshiba turun ke " + volume);
        } else {
            System.out.println("Laptop belum menyala.");
        }
    }
}
