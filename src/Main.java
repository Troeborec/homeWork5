import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        //task 1
        System.out.println("Задача №1");
        int age = 15;
        if (age >= 18) {
            System.out.println("Если возраст человека равен," + age + " то он совершеннолетний");
        }
        if (age < 18) {
            System.out.println("Если возраст человека равен," + age + " то он не достиг совершеннолетия, нужно немного подождать ");
        }

        //task 2
        System.out.println("Задача №2");
        int temp = 12;
        if (temp > 5) {
            System.out.println("На улице " + temp + " градусов, нужно надеть шапку");
        }
        if (temp < 5) {
            System.out.println("На улице " + temp + " градусов, можно идти без шапки");
        }
        //task 3
        System.out.println("Задача №3");
        int speed = 110;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " то прдется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " то можно ездить спокойно");
        }
        //task 4
        System.out.println("Задача №4");
        int oneAge = 4;
        boolean howOldAreYou = oneAge >= 2 && oneAge < 6;
        if (howOldAreYou) {
            System.out.println("Если возраст человека равен " + oneAge + " , то ему нужно ходить в детский сад");
        }
        boolean howOldAreYou2 = oneAge >= 7 && oneAge < 18;
        if (howOldAreYou2) {
            System.out.println("Если возраст человека равен " + oneAge + " , то ему нужно ходить в школу");
        }
        boolean howOldAreYou3 = oneAge > 18 && oneAge < 24;
        if (howOldAreYou3) {
            System.out.println("Если возраст человека равен " + oneAge + " , то ему нужно ходить в университет");
        } else if (oneAge >= 24) {
            System.out.println("Если возраст человека равен " + oneAge + " , то ему нужно ходить на работу");
        }
        //task 5
        System.out.println("Задача №5");
        int ageChild = 16;
        boolean ageChild2 = ageChild > 5 && ageChild < 14;
        if (ageChild < 5) {
            System.out.println("Если возраст ребенка равен " + ageChild + " , то ему нельзя кататься на аттракционе");
        }
        if (ageChild2) {
            System.out.println("Если возраст ребенка равен " + ageChild + " , то он может кататься только в сопровождении взрослого");
        }
        boolean ageChild3 = ageChild > 14;
        if (ageChild3) {
            System.out.println("Если возраст ребенка равен " + ageChild + " , то он может кататься без сопровождения взрослого");
        }
        //task 6
        System.out.println("Задача №6");
        int numberPassengers = 103;
        if (numberPassengers < 60) {
            System.out.println("В вагоне есть сидячие места");
        } else if (numberPassengers > 60 && numberPassengers < 102) {
            System.out.println("В вагоне остались только стоячие места");
        } else if (numberPassengers == 102) {
            System.out.println("Места в вагоне нет");
        } else {
            System.out.println("В вагоне только 102 места!");
        }
        //task 7
        System.out.println("Задача 7");
        int one = 20;
        int two = 4;
        int three = 42;
        if (one >= two) {
            if (one >= three) {
                System.out.println("Наибольшее число " + one);
            } else {
                System.out.println("Наибольшее число " + three);
            }
        } else {
            if (two >= three) {
                System.out.println("Наибольшее число " + two);
            } else {
                System.out.println("Наибольшее число " + three);
            }
        }
    }}