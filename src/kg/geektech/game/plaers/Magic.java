package kg.geektech.game.plaers;

import kg.geektech.game.generals.RPG_GAME;

import java.util.Random;
public class Magic extends Hero{

    public Magic(int health, int damage, String name) {
        super(health, damage, SuperAbility.BOOST, name);
    }

    @Override
    public void applySuperPower(Hero[] heroes, Boss boss) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getName() != this.getName()) {
                Random rand = new Random();
                boss.setHealth(boss.getHealth() - (heroes[i].getDamage() * (rand.nextInt(2)+1) - heroes[i].getDamage()));
            }
        }
    }
}
