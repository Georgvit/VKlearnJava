package geovideveloperoop.dog;

public class Dog {

    private static int dogsCount;
    public static final int PAWS = 4;
    public static final int TALL = 1;
    private String name;
    private String breed;
    private Size size = Size.UNDEFINED;

    public Dog() {
        dogsCount++;
        System.out.println("Собак в стае: " + dogsCount);
    }

    public Size getSize() {
        return size;
    }

    public static int getDogsCount() {
        return dogsCount;
    }

    public void setSize(Size size) {
        this.size = size;
    }


    public void setName(String dogsName) {
        name = dogsName;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void bark() {
        switch (size) {
            case BIG:
            case VERY_BIG:
                System.out.println("Воф-фов");
                break;
            case AVERAGE:
                System.out.println("Гав-фов");
                break;
            case SMALL:
            case VERY_SMALL:
                System.out.println("Тяв-тяфф");
                break;
            default:
                System.out.println("Установите размер собаки");

        }

    }

    public void bite() {
        if (dogsCount > 2) {
            System.out.println("Собаки кусают");
        } else {
            bark();
        }

    }

}
