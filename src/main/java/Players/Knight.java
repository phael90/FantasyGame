package Players;

import Interfaces.IWeapon;

public class Knight extends Fighter{
    private String horseName;

    public Knight(String name, IWeapon weapon, String horseName){
        super(name, weapon);
        this.horseName = horseName;
        this.HP = 150;
    }
    public String getHorseName(){
        return this.horseName;
    }


}
