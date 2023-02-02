public class Main {
    public static void main(String[] args) {
        System.out.println("Методы задач ДЗ № 2_1");
        task1_1();
        task1_2();
        task1_3();
        System.out.println("\nМетоды задач ДЗ № 2_2");
    }
    public static void task1_1() {
        System.out.println("Задача 1");
        System.out.println("Для решения Задачи 1 используется конструктор без параметров(по-умолчанию)");
        Car ladaGranta = new Car();
        System.out.println(ladaGranta);
        builderOfCar(ladaGranta, "Lada", "Lada Granta", 1.7,"желтый",2015, "Россия");
        System.out.println(ladaGranta);
        Car audiA8 = new Car();
        builderOfCar(audiA8, "Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020, "Германия");
        System.out.println(audiA8);
        Car bmwZ8 = new Car();
        builderOfCar(bmwZ8, "BMW", "Z8", 3.0, "черный", 2021, "Германии");
        System.out.println(bmwZ8);
        Car kiaSportage = new Car();
        builderOfCar(kiaSportage, "KIA", "Sportage 4-го поколения", 2.4, "красный", 2018, "Южная Корея");
        System.out.println(kiaSportage);
        Car hyundaiAvante = new Car();
        builderOfCar(hyundaiAvante, "Hyunday", "Avante", 1.6, "оранжевый", 2016, "Южная Корея");
        System.out.println(hyundaiAvante);
    }
    public static void task1_2() {
        System.out.println("Задача 2");
        System.out.println("Для решения Задачи 2 используется конструктор с параметрами. Все поля заполнены.");
        Car ladaGranta = new Car("Lada", "Lada Granta", 1.7, "желтый", 2015, "Россия");
        System.out.println(ladaGranta);
        Car audiA8 = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020, "Германии");
        System.out.println(audiA8);
        Car bmwZ8 = new Car("BMW", "Z8", 3.0, "черный", 2021, "Германии");
        System.out.println(bmwZ8);
        Car kiaSportage = new Car("KIA", "Sportage 4-го поколения", 2.4, "красный", 2018, "Южная Корея");
        System.out.println(kiaSportage);
        Car hyundaiAvante = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея");
        System.out.println(hyundaiAvante);
    }
    public static void task1_3() {
        System.out.println("Задача 3");
        System.out.println("Для решения Задачи 3 используется конструктор с параметрами и проверкой. Поля могут быть default.");
        Car ladaGranta = new Car("",null, -1.7, "желтый", -2015, "Россия");
        System.out.println(ladaGranta);
        Car audiA8 = new Car("", "A8 50 L TDI quattro", 3.0, "черный", 2020, null);
        System.out.println(audiA8);
        Car bmwZ8 = new Car("", "", 3.0, "", 2021, "Германии");
        System.out.println(bmwZ8);
        Car kiaSportage = new Car("", "Sportage 4-го поколения", 2.4, "", -2018, "Южная Корея");
        System.out.println(kiaSportage);
        Car hyundaiAvante = new Car(null, "Avante", 0, "оранжевый", 2016, "");
        System.out.println(hyundaiAvante);
    }

    public static void builderOfCar(Car car,
                                    String brand,
                                    String model,
                                    double engineVolume,
                                    String color,
                                    int year,
                                    String country) {
        car.setBrand(brand);
        car.setModel(model);
        car.setEngineVolume(engineVolume);
        car.setColor(color);
        car.setYear(year);
        car.setCountry(country);
    }

}