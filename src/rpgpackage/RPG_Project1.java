package rpgpackage;

public class RPG_Project1 {
    static Game_Logic gl = new Game_Logic();

    public static void main(String[] args) {

        while(true) {

            // calling for the game_loop
            game_loop();
        }
    }

    public static void game_loop() {

        // pulling waitforCommand from the game logic instance >> class
        gl.waitforCommand();
    }
}
