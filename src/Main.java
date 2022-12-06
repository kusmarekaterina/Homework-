public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        int age = 17;
        System.out.print("Если возраст человека равен " + age + ", то ");
        if (age >= 18) {
            System.out.println("он совершеннолетний.");
        } else {
            System.out.println("он не достиг совершеннолетия, нужно немного подождать.");
        }
    }

    public static void task2() {
        int temperature = -4;
        System.out.println("На улице " + temperature + " градусов");
        if (temperature < 5) {
            System.out.println("На улице холодно, нужно надеть шапку.");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки.");
        }
    }

    public static void task3() {
        int speed = 75;
        System.out.print("Если скорость равна " + speed + ", то ");
        if (speed > 60) {
            System.out.println("скорость превышена, придётся заплатить штраф.");
        } else {
            System.out.println("превышения скорости нет, можно ездить спокойно.");
        }
    }

    public static void task4() {
        int age = 75;
        System.out.print("Если возраст человека равен " + age + ", то ему нужно ходить");
        if (age >= 2 && age <= 6) {
            System.out.println(" в детский сад.");
        } else if (age >= 7 && age <= 18) {
            System.out.println(" в школу.");
        } else if (age > 18 && age < 24){ ;
        System.out.println(" в университет.");
        } else{
            System.out.println(" на работу.");
        }

    }
    public static void task5() {
        int age = 14;
        System.out.print("Если возраст ребенка равен " + age + ", то ему");
        if (age < 5) {
            System.out.println(" нельзя кататься на аттракционе.");
        } else if (age > 5 && age < 14) {
            System.out.println(" можно кататься на аттракционе только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        } else {
            System.out.println(" можно кататься на аттракционе без сопровождения взрослого.");
        }
    }

    public static void task6() {
        int trainCapacity = 102;
        int seatingPlace = 60;
        int standingPlace = trainCapacity - seatingPlace;
        int numberOfPeople = 101;
        if (numberOfPeople < seatingPlace) {
            int freeSeating = seatingPlace - numberOfPeople;
            System.out.println("Свободных сидячих мест: " + freeSeating + " Свободных стоячих мест: " +  standingPlace);
        } else if (numberOfPeople > seatingPlace && numberOfPeople < trainCapacity) {
            int freeStanding = standingPlace - (numberOfPeople - seatingPlace);
            System.out.println("В вагоне все сидячие места заняты. Свободных стоячих мест: " + freeStanding);
        } else if (numberOfPeople == trainCapacity){
            System.out.println("Вагон заполнен.");
        }

    }
    public static void task7() {
        int one = 1;
        int two = 2;
        int three = 3;
        if (one>two && one>three) {
            System.out.println(one + " больше чем " + two + " и " + three);
        } else if(two>one && two>three){
            System.out.println(two + " больше чем " + one + " и " + three);
        } else {
            System.out.println(three + " больше чем " + one + " и " + two);
        }
    }

}


