package georgvideveloper.oop.lesson2;

public class ComputerRun {
    public static void main(String[] args) {
        int value = 5;
        Computer computer = new Computer();
        computer.printState();

        Computer computer1 = new Computer(1050);
        computer1.printState();
        Computer computer2 = new Computer(8000, 8000);
        computer2.printState();

    }
}
