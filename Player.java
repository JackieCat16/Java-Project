import java.util.Scanner;
import java.util.Random;

public class Player {
	private boolean isHuman; 
	private Ship[] ships;
	private Board ownBoard = new Board();
	private Board enemyBoard = new Board();	
	private String name;
	private Scanner scnr = new Scanner(System.in);
	private Random rand = new Random();
	
	public void setIsHuman(boolean isHuman) {
		this.isHuman = isHuman;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName(String name) {
		this.name = name;
		return name;
	}
	
	public void shoot() {
		System.out.println(name + " is shooting the other player");
	}
	
	public void think() {
		//TODO assuming here that all ships are the same
		for (int i = 1; i < 7; i++) {
			ownBoard.print();
			System.out.print("Enter coordinates col row or -1");
			int col = scnr.nextInt();
			//TODO think about rotating
			int row = scnr.nextInt();
			Ship p = new Ship(); //TODO flush out the details
			boolean valid = this.ownBoard.placeSHIP(row, col, p);
			//TODO deal with incorrect input
			
		}
	}
	
	private void compute() {
		for(int i = 1; i < 7; i++) {
			int col = rand.nextInt(ownBoard.COLS);
			int row = rand.nextInt(ownBoard.ROWS);
			Ship p = new Ship();
			boolean valid = this.ownBoard.placeSHIP(row, col, p);
		}
	}
	
	public void initBoard() {
		System.out.println(name + " please set your pieces");
		if(isHuman) {
			System.out.println("Initiating board by thinking ....");
			this.think();
		}else {
			System.out.println("Initiating board by computing ....");
			this.compute();
		}
	}
	
	public void printOwnBoard() {
		System.out.println(name + " is printing own board");
		ownBoard.print();
	}
	
	public void printEnemyBoard() {
		System.out.println(name + " is printing enemy board");
		enemyBoard.print();
	}

}
