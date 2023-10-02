package lotr;
import java.util.Random;

public class King extends lotr.Character{
    public King(){
        super(5, 5);
        Random rand = new Random(); 
        this.setHp(rand.nextInt(11) +5);
        this.setPower(rand.nextInt(11) + 5);
    }
    public void kick(Character c){
        Random rand = new Random(); 
        c.setHp(getHp() - rand.nextInt(getPower()));
    }
}
