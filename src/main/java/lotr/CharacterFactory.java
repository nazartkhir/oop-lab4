package lotr;
import java.util.Random;

public class CharacterFactory {
    public Character createCharacter(){
        Random rand = new Random();
        int x = rand.nextInt(4);
        Character character = new Character();
        if (x == 0){
            character  = new Elf();
        }
        if (x == 1){
            character = new Hobbit();
        }
        if (x == 2){
            character = new King();
        }
        if (x == 3){
            character = new Knight();
        }
        return character;
    }
}
