package prod.stuff;

import prod.udntk.enums.Mood;

import java.util.Random;

public class Rnd {

    public static byte intellectValue(){
        Random rnd = new Random();
        return (byte)  rnd.nextInt(100);
    }

    public static Mood moodValue(){
        Random rnd = new Random();
        return switch (rnd.nextInt(3)) {
            case 0 -> Mood.GOOD;
            case 1 -> Mood.BAD;
            case 2 -> Mood.NEUTRAL;
            default -> Mood.NONE;
        };
    }

    public static boolean binChance(){
        Random rnd = new Random();
        return (rnd.nextInt(2) == 1);
    }
}
