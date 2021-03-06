package Players;

public abstract class Player {
    protected String name;
    protected int HP;

    public Player(String name){
        this.name = name;
        this.HP = 100;
    }
    public String getName(){
        return this.name;
    }

    public int getHP(){
        return this.HP;
    }

    public void changeHP(int changingHPAmount) {
        this.HP += changingHPAmount;

        if (this.HP < 0) {
            this.HP = 0;
        }
    }
}
