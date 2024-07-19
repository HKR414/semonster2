package org.example;

public class Player {
  String name;
  Monster[] Deck = new Monster[8];
  int hp = 10;

  Player() {
    this.name = "user";
    MakeDeck();
    System.out.println(toString());
  }

  void MakeDeck() {
    for (int i = 0; i < 8; i++) {
      Monster m = new Monster();
      this.Deck[i] = m;
    }
  }

  @Override
  public String toString() {
    String result = "Deck:" + this.name + " HP:" + this.hp + "\n";
    for (int i = 0; i < 8; i++) {
      result = result + this.Deck[i].name + ":レア度[" + this.Deck[i].rare + "]\n";
    }

    return result;
  }
}
