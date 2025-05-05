package PBO;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Pilih laptop: 1. Lenovo  2. Toshiba  3. MacBook");
        int pilihan = input.nextInt();
        input.nextLine(); // membersihkan enter

        Laptop laptop = null;

        switch (pilihan) {
            case 1:
                laptop = new Lenovo();
                break;
            case 2:
                laptop = new Toshiba();
                break;
            case 3:
                laptop = new MacBook();
                break;
            default:
                System.out.println("Pilihan tidak tersedia");
                System.exit(0);
        }

        LaptopUser user = new LaptopUser(laptop);

        while (true) {
            System.out.println("Ketik: ON, OFF, UP, DOWN, EXIT");
            String command = input.nextLine().toUpperCase();

            switch (command) {
                case "ON":
                    user.turnOn();
                    break;
                case "OFF":
                    user.turnOff();
                    break;
                case "UP":
                    user.makeLouder();
                    break;
                case "DOWN":
                    user.makeSilence();
                    break;
                case "EXIT":
                    System.out.println("Terima kasih!");
                    input.close();
                    System.exit(0);
                default:
                    System.out.println("Perintah tidak dikenali.");
            }
        }
    }
}
