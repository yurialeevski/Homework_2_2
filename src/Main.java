import transport.Car;

public class Main {
    public static boolean summer = true;
    public static void main(String[] args) {

        System.out.println("Задача 2_1");
        System.out.println("Добавлены новые свойства в класс Car.");
        Car ladaGranta = new Car("Lada", "Lada Granta", 1.7, "желтый", 2015, "Россия", "МКПП", "седан", "а001аа999",5,summer);
        System.out.println(ladaGranta);
        Car.Key lada = ladaGranta.new Key(false, false);
        System.out.println(ladaGranta.getBrand() + lada);
        Car audiA8 = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020, "Германия", "АКПП", "седан", "а002аа999", 5, !summer);
        System.out.println(audiA8);
        Car.Key audi = audiA8.new Key(true, true);
        System.out.println(audiA8.getBrand() + audi);
        Car bmwZ8 = new Car("BMW", "Z8", 3.0, "черный", 2021, "Германия", "АКПП", "родстер", "а003аа999", 2, false);
        System.out.println(bmwZ8);
        Car.Key bmw = bmwZ8.new Key(true, true);
        System.out.println(bmwZ8.getBrand() + bmw);
        Car kiaSportage = new Car("KIA", "Sportage 4-го поколения", 2.4, "красный", 2018, "Южная Корея", "АКПП", "внедорожник", "а004аа999", 5, false);
        System.out.println(kiaSportage);
        Car.Key kia = kiaSportage.new Key(false, true);
        System.out.println(kiaSportage.getBrand() + kia);
        Car hyundayAvante = new Car("Hyunday", "Avante", 1.6, "оранжевый", 2016, "Южная Корея", "МКПП", "седан", "а005аа999", 5, true);
        System.out.println(hyundayAvante);
        Car.Key hyunday = hyundayAvante.new Key(false, false);
        System.out.println(hyundayAvante.getBrand() + hyunday);
        System.out.println("Смена шин на сезонные");
        changeTireToSeason(ladaGranta, 2);
        System.out.println(ladaGranta);

    }

    public static void changeTireToSeason(Car car, int monthNumber) {
        if((monthNumber > 10 && monthNumber <= 12) || (monthNumber > 0 && monthNumber < 4)) {
            car.setTiresWinterFalseSummerTrue(!summer);
        }
    }
}