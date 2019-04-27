import java.util.Scanner;
public class Ship {
	private int x;
	private int y;
	private boolean[][]cells;
	
	Scanner scnr = new Scanner(System.in);
	
	public Ship() {
		cells = new boolean[3][2];
		cells[0][0] = true; cells[0][1] = false;
		cells[1][0] = true; cells[1][1] = false;
		cells[2][0] = true; cells[2][1] = true;
	}
	
	public Ship(String shape, int rotation) {
		//Shape  I, J, L, O, S, T,  Z
		String I = "I";
		String J = "J";
		String L = "L";
		String O = "O";
		String S = "S";
		String T = "T";
		String Z = "Z";
		
		shape = scnr.nextLine().toUpperCase();
		if(shape.equals(I)) {
			cells = new boolean[4][1];
			cells[0][0] = true;
			cells[1][0] = true;
			cells[2][0] = true;
			cells[3][0] = true;
		}else if(shape.equals(J)) {
			cells = new boolean[3][2];
			cells[0][0] = false; cells[0][1] = true;
			cells[1][0] = false; cells[1][1] = true;
			cells[2][0] = true; cells[2][1] = true;	
		}else if(shape.equals(L)) {
			cells = new boolean[3][2];
			cells[0][0] = true; cells[0][1] = false;
			cells[1][0] = true; cells[1][1] = false;
			cells[2][0] = true; cells[2][1] = true;
		}else if(shape.equals(O)) {
			cells = new boolean[2][2];
			cells[0][0] = true; cells[0][1] = true;
			cells[1][0] = true; cells[1][1] = true;
		}else if(shape.equals(S)) {
			cells = new boolean[3][2];
			cells[0][0] = true; cells[0][1] = false;
			cells[1][0] = true; cells[1][1] = true;
			cells[2][0] = false; cells[2][1] = true;	
		}else if(shape.equals(T)) {
			cells = new boolean[2][3];
			cells[0][0] = true; cells[0][1] = true; cells[0][2] = true;
			cells[1][0] = false; cells[1][1] = true; cells[1][2] = false;			
		}else if(shape.equals(Z)) {
			cells = new boolean[3][2];
			cells[0][0] = false; cells[0][1] = true;
			cells[1][0] = true; cells[1][1] = true;
			cells[2][0] = true; cells[2][1] = false;	
		}
		
		
	}
	
	public int getNumRows() {
		return cells.length;
	}
	
	public int getNumCols() {
		return cells[0].length;
	}
	
	public boolean getCell(int row, int col) {
		return cells[row][col];
	}
	
	public void rotate() {
		//TODO operate on cells and rotates that array
	}
	
	public String toString() {
		String out = "";
		for (int r = 0; r < cells.length; r++) {
			for (int c = 0; c < cells[r].length; c++) {
				if(cells[r][c]) {
					out = out + Board.SHIP;
				}else {
					out = out + Board.SEA;
				}
			}
			out += "\n";
		}
		return out;
	}

}
