import java.util.Scanner;
public class Game {
	private Player player1 = new Player();
	private Player player2 = new Player();
	
	public static void main(String[] args) {
		System.out.println("Game starts");
		Scanner scan = new Scanner(System.in);
		
		Game game = new Game();
		game.player1.setIsHuman(true);
		game.player2.setIsHuman(false);
		
		//setting up
		System.out.print("Enter your name: ");
		String name1 = scan.nextLine();
		System.out.print("Give a name to your computer opponent: ");
		String name2 = scan.nextLine();
		game.player1.setName(name1);
		game.player2.setName(name2);
		
		game.player1.initBoard();
		game.player2.initBoard();
		//deliverable 1
		game.player1.printOwnBoard();
		game.player2.printOwnBoard();
		
		//main loop (tic tac toe code)
		//deliverable 2
		while (true) {
			game.player1.shoot();
			game.player2.shoot();
		}
	}

}
