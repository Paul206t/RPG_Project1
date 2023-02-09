package rpgpackage;

import java.util.ArrayList;

public class Room {
    int number;
    String name;
    ArrayList<String> desc = new ArrayList<String>();
    ArrayList<String> exits = new ArrayList<String>();

    public Room(int x){
        number = x;

    }
}
