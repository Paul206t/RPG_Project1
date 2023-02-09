package rpgpackage;

import java.util.Scanner;
public class Game_Logic {
    Scanner scan = new Scanner(System.in);
    public Game_Logic() {

        // constructing a room
        Game_Objects.room.add(new Room(1));
        Game_Objects.room.get(0).name = "Space";
        Game_Objects.room.get(0).desc.add("Description Line 1");
        Game_Objects.room.get(0).desc.add("Description Line 2");
        Game_Objects.room.get(0).exits.add("South 1");
        Game_Objects.room.get(0).exits.add("North 2");


    }

    // This is where game will generally start
    public void waitforCommand() {
        if (Game_Objects.playable_character.inRoom == 0){
            createCharacter();
        }
        else {
            System.out.println("What are we doing? ");
            String userCommand = scan.nextLine();
            // Confirming what the user input. This will change
            String[] words = userCommand.split(" ");
            processCommand(words);
        }
    }


    public void processCommand(String[] x) {
        // This is where I'll be writing else-ifs to process what command was entered
        if(x[0].equals("look")){
            look(x);
        }
    }

    // Optional entered commands will go here
    public void look(String[] x){
        System.out.println("You looked.");
    }


    public void createCharacter(){
        //creating your character
        System.out.println("Welcome to RPG_Project 1. What's your name? ");
        Game_Objects.playable_character.name = scan.nextLine();
        Game_Objects.playable_character.hp = 75;
        Game_Objects.playable_character.strength = 25;
        Game_Objects.playable_character.inRoom = 1;
        System.out.println("You are starting with " + Game_Objects.playable_character.hp + " HP and " + Game_Objects.playable_character.strength + " strength.");
    }


}
