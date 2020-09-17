package pkgHelper;
//change
import static org.junit.Assert.*;

import org.junit.Test;

public class LatinSquareTest {

	@Test
	public void HasDuplicatesTest1() {
		LatinSquare LS = new LatinSquare();
		int[] arr = {1,2,3,4,5};
		
		boolean bHasDuplicates = LS.hasDuplicates(arr);
		
		assertEquals(false,bHasDuplicates);
	}
	@Test
	public void ContainsZeroTest1() {

		int[][] MySquare = {{1,2,3},{3,1,2},{2,3,1}};
		LatinSquare LS = new LatinSquare(MySquare);
		
		boolean bContainsZero = LS.ContainsZero();
		
		assertEquals(false,bContainsZero);
	}
	@Test
	public void ContainsZeroTest2() {

		int[][] MySquare = {{1,2,3},{3,0,2},{2,3,1}};
		LatinSquare LS = new LatinSquare(MySquare);
		
		boolean bContainsZero = LS.ContainsZero();
		
		assertEquals(true,bContainsZero);
	}
	
	@Test
	public void ContainsZeroEdgeCase1() {

		int[][] MySquare = {{0,2,3},{3,1,2},{2,3,1}};
		LatinSquare LS = new LatinSquare(MySquare);
		
		boolean bContainsZero = LS.ContainsZero();
		
		assertEquals(true,bContainsZero);
	}
	@Test
	public void ContainsZeroEdgeCase2() {

		int[][] MySquare = {{1,2,3},{3,1,2},{2,3,0}};
		LatinSquare LS = new LatinSquare(MySquare);
		
		boolean bContainsZero = LS.ContainsZero();
		
		assertEquals(true,bContainsZero);
	}
	@Test
	public void ContainsZeroEdgeCase3() {

		int[][] MySquare = {{1,2,3},{3,0,2},{2,3,1},{2,3,0}};
		LatinSquare LS = new LatinSquare(MySquare);
		
		boolean bContainsZero = LS.ContainsZero();
		
		assertEquals(true,bContainsZero);
	}
	@Test
	public void GetColumnTest1() {

		int[][] MySquare = {{1,2,3},{3,0,2},{2,3,1}};
		LatinSquare LS = new LatinSquare(MySquare);
		
		//assertEquals({1,3,2},LS.getColumn());
	}
	
	@Test
	public void isLatinSquareTest1() {
		
		int[][] MySquare = {{1,2,3},{3,1,2},{2,3,1}};
		LatinSquare LS = new LatinSquare(MySquare);
		
		boolean bisLatinSquare = LS.isLatinSquare();
		
		assertEquals(true,bisLatinSquare);
		
	}
	
	@Test
	public void isLatinSquareTest2() {
		
		int[][] MySquare = {{1,2,3},{3,1,2},{2,3,0}};
		LatinSquare LS = new LatinSquare(MySquare);
		
		boolean bisLatinSquare = LS.isLatinSquare();
		
		assertEquals(false,bisLatinSquare);
	}
	

}
