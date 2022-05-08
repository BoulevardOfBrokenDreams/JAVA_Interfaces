import by.gsu.training.final3.*;


import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Write full path to file:");
        String fileName = sc.nextLine();

        if(fileName.equals("")){
            fileName = "OUT.txt";
        }

        Dog bobik = new Dog();
        Cat murzik = new Cat();
        Car renault = new Car();

        File file = new File(fileName);

        try{
            if(!file.exists()){
                file.createNewFile();
            }

            PrintWriter pw = new PrintWriter(file.getAbsoluteFile());

            //4.1 Создать одиночные объекты всех классов, умеющих издавать звуки,
            // и записать все изданные ими звуки в заданный файл.
            KeeperSounds.writingSounds(pw, bobik);
            KeeperSounds.writingSounds(pw, murzik);
            KeeperSounds.writingSounds(pw, renault);


            //4.2 Создать массив объектов класса Car,
            // и записать все изданные ими звуки в тот же файл.
            Car cars[] = new Car[3];
            cars[0] = new Car();
            cars[1] = new Car();
            cars[2] = new Car();

            for (Car object: cars) {
                KeeperSounds.writingSounds(pw, object);
            }

            //4.3 Создать массив объектов классов Dog и Cat
            // (в массиве одновременно должны находиться объекты обоих классов),
            // и записать все изданные ими звуки в тот же файл.

            Animal animals[] = new Animal[3];
            animals[0] = new Dog();
            animals[1] = new Cat();
            animals[2] = new Cat();

            for (MakingSounds object: animals){
                KeeperSounds.writingSounds(pw, object);
            }

            //4.4 *Создать массив объектов классов Dog, Cat и Car
            //(в массиве одновременно должны находиться объекты всех трёх классов),
            //и записать все изданные ими звуки в тот же файл.
            MakingSounds soundMakers[] = new MakingSounds[3];
            soundMakers[0] = new Dog();
            soundMakers[1] = new Cat();
            soundMakers[2] = new Car();

            for (MakingSounds object: soundMakers) {
                KeeperSounds.writingSounds(pw, object);
            }
            pw.flush();
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
