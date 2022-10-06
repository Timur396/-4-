import java.sql.SQLOutput;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello world!");


        //Задание1
        System.out.println("Задача №1");

        int age = 18;
        if (age >= 7 && age >= 18) {

            System.out.println(" Поздравляем с совершеннолетием ");
        }
        if (age < 18) {
            System.out.println(" Поздравляем с днем рождения ");
        }
        //Задача 2
        System.out.println(" Задача2.2");

        int kid1 = 7;
        if (kid1 >= 7 && kid1 < 18) {
            System.out.println(" Ребенок ходит в школу");
        } else if (kid1 >= 18 && kid1 < 24) {

            System.out.println("Человек ходит в универ");

        } else if (kid1 >= 24) {
            System.out.println("Человек ходит на работу");
        }


        //Задача№3
        System.out.println("Задача№3");
        int van = 102;
        int sitting = 60;
        int standing = van - sitting;

        int sittingUsed = 56;
        int standingUsed = 41;
        if (sittingUsed < 60) {
            System.out.println("Еще есть " + (sitting - sittingUsed) + " сидячих мест");
        } else {
            System.out.println("Сидячих мест нет");
        }

        if (standing > standingUsed) {
            System.out.println("Есть еще " + (standing - standingUsed) + " стоячих мест ");
        } else {
            System.out.println("Стоячих мест нет");
        }

        int age1 = 1;
        if (age1 >= 18) {

            // System.out.println(" Поздравляем с совершеннолетием ");
        } else {

            // System.out.println( " Поздравляем с днем рождения ");
        }

        //Задача1.3
        System.out.println("Задача1.3");
        int humonYear = 30;
        if (humonYear >= 2 && humonYear <= 6) {
            System.out.println(" Если возраст человека равен " + humonYear + " то ему нужно ходить в детский сад");
        } else if (humonYear > 6 && humonYear <= 18) {
            System.out.println(" Если возраст человека равен " + humonYear + " то ему нужно ходить в школу");
        } else if (humonYear > 18 && humonYear <= 24) {
            System.out.println(" Если возраст человека равен " + humonYear + " то ему нужно ходить в универ");
        } else if (humonYear > 24) {
            System.out.println(" Если возраст человека равен " + humonYear + " то ему нужно ходить на работу");
        }


        // Задание2.3
        System.out.println("Задание2.3");
        int kid2 = 15;
        if (kid2 < 5) {
            System.out.println("ребенок не может кататься на аттракционе");
        } else if (kid2 >= 5 && kid2 < 14) {
            System.out.println("Ребенок может кататься толко с сопровождением взрослого. Если взрослого нет, то кататься нельзя");
        } else if (kid2 >= 14) {
            System.out.println("Ребенок может кататься без сопровождения взрослого");
        }


        //Задание3.3
        System.out.println("Задание3.3");

        int one = 7;
        int two = 7;
        int free = 3;
        if (one >= two && one >= free) {
            System.out.println("Большее число " + one);
        } else if (two >= one && two >= free) {

            System.out.println(" Большее число " + two);
        } else if (free >= two && free >= one) {
            System.out.println(" Большее число " + free);
        }
    }
}
