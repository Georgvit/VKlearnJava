package geovideveloperheadfirat_01;

public class PhraseMatic {
    public static void main(String[] args) {

//        Создаем массивы слов
        String[] wordOne = {"умный", "чужой", "свой", "первый", "нервный", "жадный"};
        String[] wordTwo = {"я", "ты", "он", "она", "твой", "твоя", "моя","они"};
        String[] wordThree = {"бегает", "думает", "плавает", "ходит", "сидит", "топает", "чихает"};

//        Определяем длину массива
        int lengthOne = wordOne.length;
        int lengthTwo = wordTwo.length;
        int lengthThree = wordThree.length;

//        Определяем рандомные индексы
        int randOne = (int) (Math.random() * lengthOne);
        int randTwo = (int) (Math.random() * lengthTwo);
        int randThree = (int) (Math.random() * lengthThree);

//        Создаем послание
        String randText = wordOne[randOne] + " " + wordTwo[randTwo] + " " + wordThree[randThree];

//        Выводим фразу
        System.out.println(randText);
    }
}
