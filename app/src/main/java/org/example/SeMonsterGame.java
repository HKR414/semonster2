package org.example;

import java.util.HashMap;
import java.util.LinkedList;

public class SeMonsterGame {
  HashMap<String, Player> playerMap = new HashMap<>();
  LinkedList<Integer> randomNumberList = new LinkedList<Integer>();

  SeMonsterGame(LinkedList<Integer> randomNumberList) {
    this.randomNumberList = randomNumberList;
  }

  void addPlayer(String playerName) {
    this.playerMap.put(playerName, new Player(playerName));
  }

  void draw(String playerName) {
    Player player = this.playerMap.get(playerName);
    player.drawMonsters();
    System.out.println(player);
  }
}
