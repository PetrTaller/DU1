public class Main {
    public static void main(String[] args) {

        Game game = new Game();

        game.act1();
        if(game.in1 == 1){
            game.act2();
        }
        
    }
}