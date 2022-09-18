package geoviegdeveloperoperators;

public class Operators {
    public static void main(String[] args) {
        double a = 2;
        double b = 2;
        double rezult1 = 2 * --a;

        double result2 = 2 * b--;
        System.out.println(rezult1 + "--a");
        System.out.println(result2 + "b--");
        System.out.println(8 / 2 + 5 - (-3 / 2));

        var company = "hexlet";
        company = company.toUpperCase(); // в верхний регистр
        System.out.println(company);

        company = company.toLowerCase(); // в нижний регистр
        System.out.println(company);


        System.out.println(App.run());

        var hurray = App.sayHurrayThreeTimes();
        System.out.println(hurray);

    }


}

