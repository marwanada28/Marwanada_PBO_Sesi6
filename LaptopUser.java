package PBO;

public class LaptopUser {
    private Laptop laptop;

    public LaptopUser(Laptop laptop) {
        this.laptop = laptop;
    }

    public void turnOn() {
        laptop.powerOn();
    }

    public void turnOff() {
        laptop.powerOff();
    }

    public void makeLouder() {
        laptop.volumeUp();
    }

    public void makeSilence() {
        laptop.volumeDown();
    }
}
