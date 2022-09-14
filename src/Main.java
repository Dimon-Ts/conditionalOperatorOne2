public class Main {
    public static void main(String[] args) {
        // Домашнее задание 2
        System.out.println("Домашнее задание 2");
        System.out.println("Задание 1");
        int age = 17;
        if(age >= 18) {
            System.out.println("Поздравляем Вас с совершеннолетием!");
        }else{
            System.out.println("Возраст совершеннолетия ещё не наступил,нужно подождать.");
        }
        System.out.println("Задание 2");
        int personsAge = 25;
        if (personsAge >= 7 && personsAge < 18) {
            System.out.println("Ребёнок ходит в школу.");
        } else if (personsAge >= 18 && personsAge < 24) {
            System.out.println("Человек уже закончил школу и может отправлятся в университет.");
        } else if (personsAge >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу.");
        }
        System.out.println("Задание 3");
        int capacity = 102;
        int sitsCount = 60;
        int standsCount = capacity - sitsCount;// стоячие места
        int sitsUsed = 60;
        int standsUsed = 40;
        if(sitsUsed<sitsCount) {
            System.out.println("Есть ещё " + (sitsCount - sitsUsed) + " сидячих мест!");
        }else{
            System.out.println("Сидячих мест нет!");
        }
        if(standsUsed<standsCount){
            System.out.println("Есть ещё " + (standsCount-standsUsed) + " стоячих мест!");
        }else{
            System.out.println("Стоячих мест нет!");
        }
        }

    }
