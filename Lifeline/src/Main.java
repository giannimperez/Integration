// Created by Gianni Perez

/**
 * Small text based game in which choices made by the user have lasting affects throughout the game.
 * Much of the content in this game is for testing purposes. After the framework is done, I will be
 * implementing better content. The framework itself will include a player stats system affected by
 * the players gear, choices, etc. and the stats will change the outcomes of certain events
 * throughout the game. Working on finding a way to integrate all of the required topics into this
 * project. Will potentially make additional classes that will implement more of the required
 * material
 **/

// Boolean: true or false
// Int: whole number digits
// Double: decimal number digits
// String: text
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    // Introduce user

    Scanner in = new Scanner(System.in);
    System.out.println("Hello, What is your name?");
    String user = in.nextLine();
    System.out.println("Welcome " + user + "!");
    System.out.println("What is your class? fast, strong or perceptive?");

    int att = 0;
    int def = 0;
    int mag = 0;

    // Create users class
    String cls = in.nextLine();
    int clas = 0;

    if (cls.equals("fast")) {
      System.out.println("youre prob slow in real life");
      clas = 1;
      att += 1;
    } else if (cls.equals("strong")) {
      System.out.println("Nah youre prob weak");
      clas = 2;
      def += 1;
    } else if (cls.equals("perceptive")) {
      System.out.println("I Is VeRY perCenTIVe");
      clas = 3;
      mag += 1;
    } else {
      System.out.println("You couldn't even pick a class, so you died...");
      System.exit(0);
    }

    System.out.println("Attack: " + att);
    System.out.println("Defense: " + def);
    System.out.println("Intelligence: " + mag);

    System.out.println(" ");
    System.out.println(
        "You wake up on the forest ground. You sit up with a splitting headache and no recollection of how you got there.");
    System.out.println(
        "You stand up and brush yourself off. You survey the area and spot your village not too far away.");

    System.out.println(
        "As you enter your village you need to test some code, so you need to buy a weapon: sword, axe, spoon or nothing?");

    // Choose weapon
    String wp = in.nextLine();
    int weap = 0;

    if (wp.equals("sword")) {
      System.out.println("nice sword");
      weap = 1;
      att = 2;
    } else if (wp.equals("axe")) {
      System.out.println("axe biatch");
      weap = 2;
      def = 2;
    } else if (wp.equals("spoon")) {
      System.out
          .println("suprise biatch! The spoon is enchanted or something so it is strong af ;)");
      weap = 3;
      mag = 2;
    } else if (wp.equals("nothing")) {
      System.out.println("You buy nothing cuz you a broke boy.");
    } else {
      System.out.println(user
          + " was caught trying to steal from the merchant and was attacked. You didn't make it.");
      System.exit(0);
    }

    System.out.println(" ");
    System.out.println("As you are leaving the stand, some asshole is trying to fight you.");
    System.out.println("You know that you have to put an end to his shit.");

    if (att == 2) {
      System.out.println("You swing your sword and defeat the homie");
    } else if (def == 2) {
      System.out.println("You use your axe to take out the duuuuude");
    } else if (mag == 2) {
      System.out.println(
          "You don't know how to use your new magic spoon so you just close your eyes and wave it around.");
      System.out.println(
          "You open your eyes to see that your magic spoon has turned the homie into a chicken, poor guy.");
    } else {
      System.out.println(user
          + " waved his hands around and peed a little. He ran away, tripped and fell into a spike pit... THE END.");
      System.exit(0);
    }

  }

}


