package Homeworks.Seminar_6;

import java.util.HashSet;

public class VetClinic {
    public static void main(String[] args) {
        Cat barsik = new Cat(1, "Николай", "Барсик", "сибирская", 3, "серый");
        Cat myrzik = new Cat(2, "Евгений", "Мурзик", "Сиамская", 6, "бело-серый");
        Cat pyshok = new Cat(3, "Борис", "Пушок", "Бенгальская", 2, "розетка на серебре");
        Cat boris = new Cat(1, "Николай", "Барсик", "сибирская", 3, "серый");
        // Цвет по данным сайта https://4lapy.ru/articles/bengalskaya-poroda-koshek/
        System.out.println(pyshok.toString());
        HashSet<Cat> catSet = new HashSet<>();
        catSet.add(barsik);
        catSet.add(myrzik);
        catSet.add(pyshok);
        catSet.add(boris);
        System.out.println(catSet.toString());
        System.out.println(pyshok.hashCode());


    }
}
class Cat {
    private String nickname;
    private String breed;
    private String owner;
    private String color;
    private int age;
    private int id;

    public Cat(int id, String owner, String nickname, String breed, int age, String color) {
        this.id = id;
        this.owner = owner;
        this.nickname = nickname;
        this.breed = breed;
        this.age = age;
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("\nid - %d, хозяин - %s, кличка - %s, порода - %s, возраст(лет) - %d, цвет - %s", id, owner, nickname, breed, age, color);
    }

    @Override
    public boolean equals(Object obj) {
        Cat comparedСat = (Cat) obj;
        return id== comparedСat.id && owner == comparedСat.owner && nickname == comparedСat.nickname &&
                breed == comparedСat.breed && age == comparedСat.age && color == comparedСat.color;
    }

    @Override
    public int hashCode() {
        return id;
    }
}



