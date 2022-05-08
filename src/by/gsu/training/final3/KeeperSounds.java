package by.gsu.training.final3;

import java.io.PrintWriter;

public class KeeperSounds {
    public static void writingSounds(PrintWriter file, MakingSounds sound){
        file.println(sound.makeSound());
    }
}
