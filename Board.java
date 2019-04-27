import java.util.Random;
import java.lang.Character;
import java.awt.Color;
import java.awt.Graphics;
import java.applet.Applet;
public class Board {
	//TODO figure out whether we need a class for Cell
	public final int ROWS = 10;
	public final int COLS = 15;
	private char[][]cells = new char[ROWS][COLS];
	
	
	public static final char SEA = '~'; 
	public static final char SHIP = 'S';
	public static final char HIT = 'X';
	public static final char MISS = 'O';
	
	public Board() {
		for(int i = 0; i < ROWS; i++) {
			for(int j = 0; j < COLS; j++) {
				cells[i][j] = SEA;
			}
		}
	}
	
	public void randomize() {
		Random rand = new Random();
		for(int r = 0; r < ROWS; r++) {
			for(int c = 0; c < COLS; c++) {
				int v = rand.nextInt(4);
				
				cells[r][c] = v==0?SEA:v==1?SHIP:v==2?HIT:MISS;
			}
		}
	}
	
	public boolean placeSHIP(int row, int col, Ship p) {
		this.cells[row][col] = SHIP;
		//TODO we need to check for valid input
		//if 
		for (int r = 0; r < p.getNumRows(); r++) {
			for (int c = 0; c < p.getNumCols(); c++) {
				if(p.getCell(r, c)) {
					this.cells[row + r][col + c] = SHIP;
				}else {
					this.cells[row + r][col + c] = SEA;
				}
			}
		}
		return true;
	}
	
	public void print() {
		System.out.println("Board is printing...");
		//TODO clean the printing, header row and col indices are needed
		for(int i = 0; i <= 14; i++) {
			System.out.print( " " + i );
		}
		System.out.println();
		for(int i = 0; i <= 9;) {
			for(int r = 0; r < ROWS; r++) {			
				System.out.print(i);
				System.out.print("|");
				i++;
				for(int c = 0; c < COLS; c++) {				
					System.out.print(cells[r][c] + "|");
				}
				System.out.println();
			}
		}
	}
}
