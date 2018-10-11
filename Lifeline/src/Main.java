// Created by Gianni Perez
// This program will test the users reasoning skills with a series of questions and choices that
// will affect the user positively or negatively throughout the program
// cmd+shift+f auto-style
// cmd+shift+s save-all
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // Introduce user
    Scanner in = new Scanner(System.in);
    System.out.println("Welcome to your long range communications device!");
    // String user = in.nextLine();
    System.out.println("Incoming Transmission...");
    System.out.println("SOS! Is anyone out there?");
    System.out.println(" ");
    System.out.println("1. Hello");
    System.out.println("2. Waddup");
    System.out.println("3. Hi ;)");
    // Create users class
    String cls = in.nextLine();

    if (cls.equals("1")) {
      System.out.println("-Hello");

    } else if (cls.equals("2")) {
      System.out.println("-Waddup");

    } else if (cls.equals("3")) {
      System.out.println("-Hi ;)");

    } else {
      System.out.println(
          "You turn of your comm system because you don't feel like dealing with this scrub");
      System.exit(0);
    }

    System.out.println(" ");
    System.out.println("Yes! Finally!");
    System.out.println("I have been sending messages with this stupid thing for an hour");
    System.out.println("I just woke up on this island");
    System.out.println(
        "I think I got hit in the head because I've got a splitting headache and no idea how I got here");
    System.out.println("There's debre everywhere from what looks like a plane crash.");
    System.out.println(
        "I think I remember being in the plane, and I don't know if anyone else made it...");
    System.out.println(" ");
    System.out.println("1. Oh my god! That's awful");
    System.out.println("2. How are you even messaging me right now?!");
    System.out.println("3. I black out all the time, don't be so dramatic.");

    String ans2 = in.nextLine();

    if (ans2.equals("1")) {
      System.out.println("-Oh my god! That's awful.");
      System.out.println(" ");
    } else if (ans2.equals("2")) {
      System.out.println("-How are you even messaging me right now?!");
      System.out.println(" ");
      System.out.println(
          "When I woke up, there was a bunch of debre from the crash. I found this comms device... I think its waterproof.");
    } else if (ans2.equals("3")) {
      System.out.println("-I black out all the time, don't be so dramatic.");
      System.out.println(" ");
      System.out.println("I'm not kidding");

    } else {
      System.out.println(
          "You turn of your comm system because you don't feel like dealing with this scrub");
      System.exit(0);
    }

    System.out.println(" ");
    System.out
        .println("Listen, I need your help. I don't know where I am or what I'm going to do.");
    System.out.println("But after that bump to the head, I can't think straight.");
    System.out.println("Will you help me?");
    System.out.println(" ");
    System.out.println("1. Absolutely!");
    System.out.println("2. What's in it for me?");
    System.out.println("3. Lol sure dude.");

    String ans3 = in.nextLine();

    if (ans3.equals("1")) {
      System.out.println("-Absolutely!");

    } else if (ans3.equals("2")) {
      System.out.println("-What's in it for me?");
      System.out.println(" ");
      System.out.println(
          "If I make it off this island, I'll do whatever I can to make it worth your time.");

    } else if (ans3.equals("3")) {
      System.out.println("-Lol sure dude.");

    } else {
      System.out.println(
          "You turn of your comm system because you don't feel like dealing with this scrub");
      System.exit(0);
    }
    // User name
    System.out.println(
        "If you're going to be helping me make it through this, I guess I should know your name?");
    System.out.println(" ");
    System.out.println("Enter your name");
    String user = in.nextLine();
    System.out.println(" ");
    System.out.println("Nice to meet you " + user);
    System.out.println(" ");
    System.out.println("1. And what is your name?");

    // Survivor name
    String ans4 = in.nextLine();

    if (ans4.equals("1")) {
      System.out.println("-And what is your name?");
      System.out.println("Honestly I can't remember... What do you want to call me?");

    }

    else {
      System.out.println(
          "You turn of your comm system because you don't feel like dealing with this scrub");
      System.exit(0);
    }

    System.out.println(" ");
    System.out.println("Enter Survivor's nickname");
    String plyr = in.nextLine();
    System.out.println("I think I will call you " + plyr);
    System.out.println(" ");

    // survival chance
    int thrst = 50;
    int hngr = 50;
    int health = 50;
    
    int survmath = thrst + hngr + health;
    int surv = survmath / 3;
    System.out.println(plyr + "'s chance of survival is " + surv + "%");
    System.out.println(" ");
    System.out.println("I'm feeling a little hungry, and I could use a drink...");
    System.out.println("but I'm so sore from the crash, maybe I could use the rest.");
    System.out.println("What should I do?");
    System.out.println(" ");
    System.out.println("1. Go searching for food.");
    System.out.println("2. Look for a water source.");
    System.out.println("3. Relax on the beach, it couldn't hurt.");
    System.out.println(" ");
    
    String ans4 = in.nextLine();

    if (ans4.equals("1")) {
      System.out.println("-Go searching for food.");

    } else if (ans4.equals("2")) {
      System.out.println("-Look for a water source.");

    } else if (ans4.equals("3")) {
      System.out.println("-Relax on the beach, it couldn't hurt.");

    } else {
      System.out.println(
          "You turn of your comm system because you don't feel like dealing with this scrub");
      System.exit(0);
    }
    
    // switch statments for survival conditions, actions, etc.

    //________________________________________________________________________________________
    //Older program
    
    // Choose weapon
    String wp = in.nextLine();
    int weap = 0;
    int att = 0;
    int def = 0;
    int mag = 0;
    if (wp.equals("sword")) {
      System.out.println("nice ass sword");
      weap = 1;
      att = 2;
    } else if (wp.equals("axe")) {
      System.out.println("axe biatch");
      weap = 2;
      def = 2;
    } else if (wp.equals("spoon")) {
      System.out
          .println("suprise bitch! The spoon is enchanted or some shit so it is strong af ;)");
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
