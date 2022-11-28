package geovideveloperoop;

public class Main {
    public static void main(String[] args) {
        Dog labDog = new Dog();
        labDog.setName("Tuzik");
        labDog.setBreed("Lab");
        labDog.setSize(Size.AVERAGE);
        labDog.bark();

        Dog sheppardDog = new Dog();
        sheppardDog.setName("Maik");
        sheppardDog.setBreed("Sheppard");
        sheppardDog.setSize(Size.BIG);
        sheppardDog.bark();

        Dog dobermanDog = new Dog();
        dobermanDog.setName("Dshak");
        dobermanDog.setBreed("Doberman");
        dobermanDog.setSize(Size.BIG);
        dobermanDog.bite();



        /*System.out.println("LabDog name is " + labDog.getName());
        System.out.println("LabDog имеет лап " + labDog.getPaws());
        System.out.println("LabDog имеет хвостов " + labDog.getTall());

        System.out.println("ShepparDog name is " + sheppardDog.getName());
        System.out.println("ShepparDog имеет лап " + sheppardDog.getPaws());
        System.out.println("ShepparDog имеет хвостов " + sheppardDog.getTall());*/

        Size s = Size.VERY_BIG;
//        System.out.println(s);
//        Size sl = Size.valueOf("BIG");
//        System.out.println(sl);
        Size[] values = Size.values();
        for (int i = 0; i < values.length; i++){
            System.out.println(values[i]);
        }







    }

}
