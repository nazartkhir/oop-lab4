package lotr;
import java.util.Random;

public class King extends lotr.Character{
    public King(){
        super(5, 5);
        Random rand = new Random(); 
        this.setHp(rand.nextInt(21) - 5);
        this.setPower(rand.nextInt(21) - 5);
    }
}
