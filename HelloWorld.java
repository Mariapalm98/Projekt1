package se.iths.maria.projekt1;

public class HelloWorld {
    public static void main(String[] args) {
        //har har jag lagt in pratameter till min greeting i en arrey
        String[] greeting = {"Hello", "World", "!"};

        //anropar metod så greeting får string
        myGreeting(greeting);
    }
    private static void myGreeting(String[] greetings) {
        for (String greeting : greetings) {

            //här skriver jag ut pratameterna som är i greeting
            System.out.println(greeting);
        }
    }
}
