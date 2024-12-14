package prod.stuff;

import prod.stuff.exceptions.NoKeyException;
import prod.stuff.exceptions.WrongMovement;
import prod.udntk.enums.*;

import prod.udntk.objects.inanimates.*;
import prod.udntk.objects.persons.*;

public final class Story {
    public static void startStory(){
        Znayka znayka = new Znayka(Rnd.moodValue(), Rnd.intellectValue());
        Neznayka neznayka = new Neznayka(Rnd.moodValue(), Rnd.intellectValue());
        Doctor doctorPilulkin = new Doctor(Rnd.moodValue(), Rnd.intellectValue());
        Rock mountainChain = new Rock("Горная цепь", GroundLocation.HORIZON, Color.GRAY);
        Rock ground = new Rock("почва", GroundLocation.FIELD, Color.GRAY);
        Rocket rocket = new Rocket(GroundLocation.FIELD, Color.METALLIC);
        Planet earth = new Planet("Земля", SpaceLocation.CLOSESPACE, Color.BLUE);
        Star sun = new Star("Солнце", SpaceLocation.FARSPACE, Color.RED, Light.DIRECT);
        Star stars = new Star("Галакика", SpaceLocation.FARSPACE, Color.COLDBLUE, Light.OBLIQUE);
        Sky sky = new Sky(Color.BLUE);
        Key key = new Key(Rnd.binChance());

        znayka.move(GroundLocation.FIELD);
        neznayka.move(GroundLocation.FIELD);

        sky.getMoves(0);
        sky.describe();


        sun.illuminate();
        sun.illuminate(ground);
        sun.illuminate(mountainChain);

        ground.shine();

        znayka.explore();


        if (neznayka.getMood() == Mood.BAD){
            neznayka.getMoves(0);
            znayka.getMoves(1);
            neznayka.describe();
            try {
                key.fall(GroundLocation.CAVE);
                znayka.talk("Ты зачем ключ от ракеты в пещеру выкинул?", neznayka);
                neznayka.move(GroundLocation.CAVE);
                neznayka.getMoves(2);
            }
            catch (NoKeyException error){
                System.out.println(error);
                neznayka.talk("А где собственно ключ?");
                neznayka.move(GroundLocation.CAVE);
                znayka.move(GroundLocation.CAVE);
            }

        } else {
            neznayka.getMoves(1);
            znayka.getMoves(0);

            neznayka.move(GroundLocation.ROCKET);
            znayka.move(GroundLocation.ROCKET);
            rocket.describe();

            try {
                znayka.openRocket(key, rocket);
                rocket.addPilot(znayka);
                rocket.startEngine();
                rocket.fly();
            } catch (NoKeyException error) {
                System.out.println(error);
                neznayka.getMoves(3);
                znayka.getMoves(2);
            }
        }
    }
}
