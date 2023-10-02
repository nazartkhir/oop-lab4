package lotr;

public class Character {
    private int hp = 0;
    private int power = 0;
    public Character(){
        this.hp = 0;
        this.power = 0;
    }
    public Character(int hp, int power){
        this.hp = hp;
        this.power = power;
    }
    public void setHp(int newHp){
        if (newHp>=0){
            this.hp = newHp;
        }
        else{
            this.hp = 0;
        }
    }
    public int getHp(){
        return this.hp;
    }
    public int getPower(){
        return this.power;
    }
    public void setPower(int newPower){
        this.power = newPower;
    }
    public boolean isAlive(){
        return (this.hp>0);
    }
}
