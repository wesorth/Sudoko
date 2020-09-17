package pkgHelper;
//change
public class LatinSquare {
	private int[][] LatinSquare;
	
	public LatinSquare() {
		super();
	}
	
	public LatinSquare(int[][] latinSquare) {
		super();
		LatinSquare = latinSquare;
	}
	
	public int[][] getLatinSquare(){
		return this.LatinSquare;
	}
	
	public void setLatinSquare(int[][] newLatinSquare) {
		this.LatinSquare = newLatinSquare;
	}
	
	public boolean hasDuplicates(int[] section) {
		int count = 0;
		for(int i = 0; i < section.length; i++) {
			int temp = section[i];
			for(int j = 0; j < section.length; j++) {
				if (section[j] == temp) {
					count++;
					if(count == 2) {
						return true;
					}
				}
			}
			count = 0;
		}
		return false; // example boolean
	}
	
	public boolean doesElementExist(int[] section, int element) {
		for(int i = 0; i < section.length; i++) {
			if (section[i] == element) {
				return true;
			}
		}
		return false;
	}
	
	public boolean hasAllValues(int[] section1, int[] section2) {
		int count = 0;
		for(int i = 0; i < section1.length; i++) {
			for(int j = 0; j < section1.length; j++) {
				if (section2[j] == section1[i]) {
					count++;
					break;
				}
			}
		}
		if (count == section1.length) {
		return true; // example boolean
		}
		else {
			return false;
		}
	}
	
	public int[] getColumn(int num_col) {
		int[] column = new int[this.LatinSquare[num_col].length];
		for (int i = 0; i < this.LatinSquare[num_col].length; i++) {
			column[i] = this.LatinSquare[i][num_col];
		}
		return column; // example output
	}
	
	public int[] getRow(int num_row) {
		int[] row = new int[this.LatinSquare[num_row].length];
		for(int i = 0; i < this.LatinSquare[num_row].length; i++) {
			row[i] = this.LatinSquare[num_row][i];
		}
		return row; // example list return
	}
	
	public boolean ContainsZero() {
		for(int i = 0; i < this.LatinSquare.length; i++) {
			for(int j = 0; j < this.LatinSquare.length; j++) {
				if (this.LatinSquare[i][j] == 0) {
					return true;
				} 
			}
		}
		return false;
	}
	
	public boolean isLatinSquare() {
		for(int i = 0; i < this.LatinSquare.length; i++) {
			if(hasDuplicates(getRow(i))) {
				return false;
			}
		}
		for(int j = 0; j < this.LatinSquare.length; j++) {
			if(hasDuplicates(getColumn(j))) {
				return false;
			}
		}
		if (ContainsZero()) {
			return false;
		}
		for(int i = 0; i < this.LatinSquare.length; i++) {
			if(hasDuplicates(getRow(i))) {
				return false;
			}
		}
		for(int j = 0; j < this.LatinSquare.length; j++) {
			if(hasDuplicates(getColumn(j))) {
				return false;
			}
		}
		for(int i = 0; i < this.LatinSquare.length; i++) {
			if(hasAllValues(getRow(i),getColumn(i))) {
				continue;
			}
			else {
				return false;
			}
		}
		return true;
	}
	
	
}
