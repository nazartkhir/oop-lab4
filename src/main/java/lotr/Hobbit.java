package lotr;
public class Hobbit extends lotr.Character {
    public Hobbit(){
        super(3, 0);
    }
    public void toCry(){
        System.out.println("aaaaaa");
    }
    public void kick(Character c){
        toCry();
    }
    public String toString(){
        String ans = "Hobbit{hp=";
        ans += getHp();
        ans += ", power=";
        ans += getPower();
        ans += "}";
        return ans;
    }
}
