package org.example;

import java.util.Random;

public class Monster {
  String name;
  int rare;// 1:normal,2:uncommon,3:rare,4:ultra rare

  Monster() {
    Random random = new Random();
    this.name = this.summonMonster(random.nextInt(5));
    this.rare = random.nextInt(5);
  }

  Monster(int mnumber, int rare) {
    this.name = summonMonster(mnumber);
    this.rare = rare;
  }

  Monster(String name, int rare) {
    this.name = name;
    this.rare = rare;
  }

  String summonMonster(int mnumber) {
    String monsters[] = { "スライム", "サハギン", "ドラゴン", "デュラハン", "シーサーペント" };
    return monsters[mnumber];
  }

  void evolveMonster() {
    if(this.rare >= 3) {
        this.name = "メタル" + this.name;
    }
  }

  @Override
  public String toString() {

    return this.name + ":レア度[" + this.rare + "]";
  }
}
