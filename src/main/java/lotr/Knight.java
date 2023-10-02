package lotr;
import java.util.Random;

public class Knight extends lotr.Character{
    public Knight(){
        super(5, 5);
        Random rand = new Random(); 
        this.setHp(rand.nextInt(21) - 5);
        this.setPower(rand.nextInt(21) - 5);
    }
}
