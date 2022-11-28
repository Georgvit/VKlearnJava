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

        System.out.println(App.getHiddenCard("1234567812345678", 2)); // "**5678")
        System.out.println(App.getHiddenCard("1234567812345678", 3)); // "***5678"
        System.out.println(App.getHiddenCard("1234567812345678")); // "****5678"
        System.out.println(App.getHiddenCard("2034399002121100", 1)); // "*1100"

        String str = "HELLe";
        //String str = "+";
        if (Character.isUpperCase(str.charAt(0)))
            System.out.println(str);
        else if (!Character.isUpperCase(str.charAt(0))) {
            String revers = new StringBuffer(str).reverse().toString();
            System.out.println(revers);
        } else
            System.out.println("+");

        str = str.toLowerCase();
        System.out.println(str);

        var i = 0;
        var count = 0;
        //str = str.toLowerCase();
        while (i < str.length()) {
            char ch = 'E';
            if (str.toLowerCase().charAt(i) == Character.toLowerCase(ch)) {
                // Считаем только подходящие символы
                count++;
            }
            // Счетчик увеличивается в любом случае
            i++;
        }

        System.out.println(count);


        int j = 0;
        String ostr = "If I look back I am lost";
        char ch = 'I';
        String newStr;
        while (j < ostr.length()) {

            if (ostr.toLowerCase().charAt(j) == Character.toLowerCase(ch)) {

                newStr = ostr.replace(ostr.charAt(j), '*');
                System.out.println(newStr);

            }

            j++;
        }

        String stro = "I never look back";

        int t = 0;
        while(t < stro.length()) {
            var result = stro.charAt(t);
            if (t % 3 == 0) {
                result = stro.toUpperCase().charAt(t);
            }
            t++;
            System.out.print(result);
        }



    }


}

