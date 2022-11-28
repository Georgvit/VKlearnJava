package geoviegdeveloperoperators;

public class App {
    public static int run() {
        return 5;
       // return 10;
    }

    public static String sayHurrayThreeTimes(){
        var str = "hurray! hurray! hurray!";
        return str;
    }

    public static String getHiddenCard(String cardNumber, int number){
        var newCardNumber = "*".repeat(number) + " " + cardNumber.substring(12, cardNumber.length());
        return newCardNumber;
    }

    public static String getHiddenCard(String cardNumber){
        return App.getHiddenCard(cardNumber, 4);
    }
}
