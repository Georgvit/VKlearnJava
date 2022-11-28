package geovideveloperseabatl;

//Игра Морской бой

import java.util.Scanner;

public class SeaBattle {
    static String playerName1 = "Первый игрок";
    static String playerName2 = "Второй игрок";
    static Scanner scanner = new Scanner(System.in);
    static int[][] battlefieldOne = new int[10][10];
    static int[][] battlefieldTwo = new int[10][10];

    static int[][] monitor1 = new int[10][10];
    static int[][] monitor2 = new int[10][10];

    public static void main(String[] args) {
/*        System.out.println("Игрок 1, пожалуста введите ваше имя");
        playerName1 = scanner.nextLine();
        System.out.println("Игрок 2, пожалуста введите ваше имя");
        playerName2 = scanner.nextLine();*/
        placeShips(playerName1, battlefieldOne);
        placeShips(playerName2, battlefieldTwo);

        while (true) {
            makeTurn(playerName1, monitor1, battlefieldTwo);
            if (isWinCondition()) {
                break;
            }
            makeTurn(playerName2, monitor2, battlefieldOne);
            if (isWinCondition()) {
                break;
            }
        }

    }

    public static void placeShips(String playerName, int[][] battlefield) {
        int deck = 4;
        while (deck >= 1) {
            System.out.println("----------------------------------------------");
            System.out.println(playerName + " введите координаяты " + deck + "-х палубного корабля");
            drawField(battlefield);

            System.out.println("Координаты по оси ОХ: ");
            int ox = scanner.nextInt();
            System.out.println("Координаты по оси ОY: ");
            int oy = scanner.nextInt();
            System.out.println("Размастить корабль по:");
            System.out.println("1. Вертикали \n2. Горизонтали");
            int direction = scanner.nextInt();

            if (!isAvailable(ox, oy, deck, direction, battlefield)) {
                System.out.println("Не корректные координаты для этого корабля");
                continue;
            }

            for (int i = 0; i < deck; i++) {
                if (direction == 1) {
                    battlefield[ox][oy + i] = 1;
                } else {
                    battlefield[ox + i][oy] = 1;
                }
            }
            deck--;

        }
    }

    public static void drawField(int[][] battlefield) {
        System.out.print("  ");
        for (int i = 0; i < battlefield.length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int j = 0; j < battlefield.length; j++) {
            System.out.print(j + " ");
            for (int i = 0; i < battlefield.length; i++) {
                if (battlefield[i][j] == 0) {
                    System.out.print("- ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }

    public static void makeTurn(String playerName, int[][] monitor, int[][] battlefield) {
        while (true) {
            System.out.println(playerName + " ваш ход");
            System.out.print("  ");
            for (int i = 0; i < monitor.length; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
            for (int j = 0; j < monitor.length; j++) {
                System.out.print(j + " ");
                for (int i = 0; i < monitor.length; i++) {
                    if (monitor[i][j] == 0) {
                        System.out.print("- ");
                    } else if (monitor[i][j] == 1) {
                        System.out.print("O ");
                    } else {
                        System.out.print("X ");
                    }
                }
                System.out.println();
            }

            System.out.println("Координаты по оси ОХ: ");
            int ox = scanner.nextInt();
            System.out.println("Координаты по оси ОY: ");
            int oy = scanner.nextInt();

            if (battlefield[ox][oy] == 1) {
                monitor[ox][oy] = 2;
                System.out.println("Красавчик! Есть попадание!!!");
            } else {
                System.out.println("Вы промахнулись! Переход хода!");
                monitor[ox][oy] = 1;
                break;
            }

        }
    }

    public static boolean isWinCondition() {
        int counter1 = 0;
        for (int i = 0; i < monitor1.length; i++) {
            for (int j = 0; j < monitor1[i].length; j++) {
                if (monitor1[i][j] == 2) {
                    counter1++;
                }
            }
        }

        int counter2 = 0;
        for (int i = 0; i < monitor2.length; i++) {
            for (int j = 0; j < monitor2[i].length; j++) {
                if (monitor2[i][j] == 2) {
                    counter2++;
                }
            }
        }

        if (counter1 >= 10) {
            System.out.println("Победил игрок 1");
            return true;
        }
        if (counter2 >= 10) {
            System.out.println("Победил игрок 1");
            return true;
        }
        return false;
    }

    public static boolean isAvailable(int x, int y, int deck, int rotation, int[][] battlefield) {
        if (rotation == 1) {
            if (y + deck > battlefield.length) {
                return false;
            }
        }
        if (rotation == 2) {
            if (x + deck > battlefield[0].length) {
                return false;
            }
        }

        if (x < 0 || y < 0) {
            return false;
        }
        // XXXX
        while (deck != 0) {
            for (int i = 0; i < deck; i++) {
                int xi = 0;
                int yi = 0;
                if (rotation == 1) {
                    yi = i;
                } else {
                    xi = i;
                }
                if (x + 1 + xi < battlefield.length && x + 1 + xi >= 0) {
                    if (battlefield[x + 1 + xi][y + yi] != 0) {
                        return false;
                    }

                }
                if (x - 1 + xi < battlefield.length && x - 1 + xi >= 0) {
                    if (battlefield[x - 1 + xi][y + yi] != 0) {
                        return false;
                    }

                }
                if (y + 1 + yi < battlefield.length && y + 1 + yi >= 0) {
                    if (battlefield[x + xi][y + 1 + yi] != 0) {
                        return false;
                    }

                }
                if (y - 1 + yi < battlefield.length && y - 1 + yi >= 0) {
                    if (battlefield[x + xi][y - 1 + yi] != 0) {
                        return false;
                    }

                }

            }
            deck--;
        }
        return true;
    }

}
