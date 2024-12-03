package jp.ac.uryukyu.ie.e245706;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WarriorTest {
    @Test
    void attackWithWeponSkillTest(){
        int warriorAttack = 100;
        Warrior demowarrior = new Warrior("デモ勇者", 100, warriorAttack);
        Enemy enemy = new Enemy("スライムもどき", 1000, 10);

        for (int i = 0; i < 3; i++){
            int idealpoint = (int)(warriorAttack * 1.5);
            int beforeHP = enemy.getHitpoint();
            demowarrior.attackWithWeponSkill(enemy);
            int afterHP = enemy.getHitpoint();
            
            int lealpoint = beforeHP - afterHP;
            assertEquals(idealpoint, lealpoint);

        }
    }
}