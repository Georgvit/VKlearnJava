package georgvideveloper.oop.lesson2;

public class Computer {
    int ssd = 500;
    int ram =1024;

    Computer(){
        System.out.println("Я сздан");
    }

    Computer(int newSsd){
        ssd = newSsd;
    }
    Computer(int newSsd, int newRam ){
        ssd = newSsd;
        ram = newRam;
    }

    void printState(){
        System.out.println("Ssd: " + ssd);
        System.out.println("Ram: " + ram);
    }


}
