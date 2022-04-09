package pl.coderslab.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.coderslab.beans.HelloWorld;

/**
 *
 * Utwórz klasę HelloWorld w pakiecie pl.coderslab.beans z atrybutem typu String oraz nazwie message.
 * Utwórz konstruktor ustawiający pole message, zdefiniuj gettery i settery.
 * Utwórz ziarno w konfiguracji xml o nazwie helloWorld klasy pl.coderslab.beans.HelloWorld.
 * Uzupełnij konfigurację ziaren, by przy pomocy konstruktora wstrzyknąć do klasy HelloWorld wartość Witaj Spring dla atrybutu message.
 * Uzupełnij klasę HelloWorld o poniższą metodę:
 * public void printMessage() {
 *       System.out.println("Your Message : " + message);
 * }
 *
 * Pobierz ziarno w metodzie main a następnie wywołaj na nim metodę printMessage.
 * */

public class SpringDiApplication {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");

        //HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
        HelloWorld helloWorld = context.getBean("helloWorld", HelloWorld.class);
        helloWorld.printMessage();

        context.close();
    }

}
