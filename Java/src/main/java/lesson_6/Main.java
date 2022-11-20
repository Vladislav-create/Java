package lesson_6;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        HashSet<Cat> setCats = new HashSet<>();

        Cat barsic = new Cat(1,"Барсик", 18, "Тигровый", "НСО", "Здоров, не болел!");

        Cat casper = new Cat(2,"Каспер", 5, "Белый", "ОАЭ", "Жив здоров!");

        Cat murzick = new Cat(3,"Соломон", 35, "Дымчатый", "ЕАО", "Здоров как бык.");

        Cat solomon = new Cat(3,"Соломон", 35, "Дымчатый", "ЕАО", "Здоров как бык.");

        setCats.add(barsic);
        setCats.add(casper);
        setCats.add(murzick);
        setCats.add(solomon);

        System.out.println(setCats);

        System.out.println(murzick == solomon);

        System.out.println(murzick.equals(solomon));
    }
}
