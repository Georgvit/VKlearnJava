package geovideveloperoop.cellphone;

public class Display {
    private static final int DISPLAY_HEIGHT = 1920;
    private static final int DISPLAY_WIDTH = 1280;

    public Display() {
        Pixel pixel = new Pixel(10,10, Color.BLACK);
    }

    private class Pixel{
        private int x;
        private int y;
        private  Color color;

        private Pixel(int x, int y, Color color) {
            if (0 <= x && x <= DISPLAY_WIDTH && 0 <= y && y <= DISPLAY_HEIGHT) {
                this.x = x;
                this.y = y;
                this.color = color;
                System.out.println("Создаем " + color + " пиксель (" + x + ", " + y +")");
            } else {
                throw new IllegalArgumentException("Координаты за пределами параметров дисплея!");
            }
        }
    }

    public enum Color {
        RED, GREEN, BLUE, CYAN, MAGENTA, YELLOW, BLACK
    }
}
