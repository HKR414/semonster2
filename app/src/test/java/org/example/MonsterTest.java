package org.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class MonsterTest {
    @Test public void toStringTest() {
        Monster monster = new Monster();
        assertNotNull("toString should have a monster", monster.toString());
    }

    @Test public void ConstructorTest() {
        Monster monster = new Monster("ドラゴン", 4);
        assertEquals("constructor should have 2 arguments", "ドラゴン:レア度[4]", monster.toString());
    }

    @Test
    public void testSummonMonster1() {
        Monster monster = new Monster(0, 1);
        assertEquals("スライム:レア度[1]", monster.toString());

    }

    @Test public void evolveMonsterTest() {
        Monster monster1 = new Monster("ドラゴン", 3);
        monster1.evolveMonster();
        assertEquals("Monsters that should evolve are not evolving", "メタルドラゴン", monster1.name);
        Monster monster2 = new Monster("スライム", 2);
        monster2.evolveMonster();
        assertEquals("Monsters that should not evolve are evolving", "スライム", monster2.name);
    }
}