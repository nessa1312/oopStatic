import Transport.Bus;
import Transport.Car;
import Transport.Train;
import Animals.*;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada ", " Granta ", 1.7,
                " Желтый ", 2015, " Россия", "Механическая",
                "Седан", "в123рр102", 5, 0, 160, "бензин", 0);
        Car audi = new Car("Audi ", " A8 ", 3.0,
                " Черный ", 2020, " Германия", "Автоматическая",
                "Купе", "в4а65кр777", 2, 3, 250, "бензин", 0);
        Car bmw = new Car("BMW ", " Z8 ", 3.0,
                " Черный ", 2021, " Германия", "Автоматическая",
                "Купе", "в123рр795", 2, 1, 240, "бензин", 0);
        Car kia = new Car("KIA ", " Sportage ", 2.4,
                " Красный ", 2018, " Южная Корея", "Автоматическая",
                "Кроссовер", "в123нр799", 5, 0, 200, "бензин", 0);
        Car hyundai = new Car("Hyundai ", " Avante ", 1.6,
                " Оранжевый ", 2016, " Южная Корея", "Механическая",
                "Седан", "в123рр777", 5, 1, 180, "бензин", 0);

        System.out.println(audi);
        kia.checkRegistrationNum();
        audi.checkRegistrationNum();
        audi.setInsurance(audi.new Insurance(2021, 50000, 231954893));
        lada.setInsurance(lada.new Insurance(2022, 10000, 24536872));
        audi.checkValidityInsurance();
        lada.checkValidityInsurance();
        lada.checkNumInsurance();
        System.out.println(audi);

        Train lastochka = new Train("Ласточка", "В-901", 2011, "Россия",
                "Зеленый", 301, 3500, 30, "Белорусский вокзал",
                "Минск-Пасажирский", 11, "дизель", 0);
        Train leningrad = new Train("Ленинград", "D-125", 2019, "Россия",
                "Зеленый", 270, 1700, 15, "Ленинградского вокзала",
                "Ленинград-Пассажирский", 8, "дизель", 0);
        System.out.printf(lastochka + "\n" + leningrad + "\n");

        Bus busFlash = new Bus("BusFlash", "F4", 2018, "Россия",
                "Синий", 120, "дизель", 0);
        Bus busTravel = new Bus("BusTravel", "T3", 2010, "Россия",
                "Бело-синий", 120, "бензин", 0);
        Bus busFree = new Bus("BusFree", "F2", 2014, "Россия",
                "Красный", 105, "дизель", 0);
        System.out.printf(busFlash + "\n" + busTravel + "\n" + busFree + "\n");

        System.out.println(hyundai);
        hyundai.reFuel(20);
        System.out.println(hyundai);

        busFree.reFuel(50);
        System.out.println(busFree);

        lastochka.reFuel(500);
        System.out.println(lastochka);

        Herbivores gazel = new Herbivores("Газель", 6, "Африка", 50);
        Herbivores zhiraf = new Herbivores("Жираф", 7, "Африка", 30);
        Herbivores horse = new Herbivores("Лошадь", 2, "Степи", 50);
        Predators giena = new Predators("Гиена", 1, "Африка", 20);
        Predators tiger = new Predators("Тигр", 3, "Дальний восток", 40);
        Predators bear = new Predators("Медведь", 4, "Леса", 35);
        Amphibians laygushka = new Amphibians("Лягушка", 1, "Водоемы");
        Amphibians uzh = new Amphibians("Уж пресноводный", 2, "Водоемы");
        Flightless pavlin = new Flightless("Павлин", 1, "Тропики", "Ходит");
        Flightless pingvin = new Flightless("Пингвин", 4, "Антарктида", "Ходит");
        Flightless dodo = new Flightless("Птица Додо", 2, "Озера", "Ходит");
        Flying chaika = new Flying("Чайка", 2, "Берег водоемов", "Летает");
        Flying albatros = new Flying("Альбатрос", 4, "Берег водоемов", "Летает");
        Flying sokol = new Flying("Сокол", 2, "Горы", "Летает");

        System.out.println(gazel.equals(zhiraf));
        System.out.printf(gazel + " " + gazel.getClass() + "\n" +
                zhiraf + " " + zhiraf.getClass() + "\n" +
                horse + " " + horse.getClass() + "\n" +
                giena + " " + giena.getClass() + "\n" +
                tiger + " " + tiger.getClass() + "\n" +
                bear + " " + bear.getClass() + "\n" +
                laygushka + " " + laygushka.getClass() + "\n" +
                uzh + " " + uzh.getClass() + "\n" +
                pavlin + " " + pavlin.getClass() + "\n" +
                pingvin + " " + pingvin.getClass() + "\n" +
                dodo + " " + dodo.getClass() + "\n" +
                chaika + " " + chaika.getClass() + "\n" +
                albatros + " " + albatros.getClass() + "\n" +
                sokol + " " + sokol.getClass() + "\n"
        );
    }
}
