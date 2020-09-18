package pkgHelper;
//change3

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class LatinSquareTest {

	@Test
	public void HasDuplicatesTest1() {
		LatinSquare LS = new LatinSquare();
		int[] arr = {1,2,3,4,5};
		
		boolean bHasDuplicates = LS.hasDuplicates(arr);
		
		assertEquals(false,bHasDuplicates);
	}
	@Test
	public void hasDuplicates_test1() {
		LatinSquare LS  = new LatinSquare();
		int[] arr = {1, 3, 5, 2, 4};
		
		boolean bHasDuplicates = LS.hasDuplicates(arr);
		
		assertEquals(bHasDuplicates, false);
	}
	@Test
	public void hasDuplicates_test2() {
		LatinSquare LS = new LatinSquare();
		int[] arr = { 1, 3, 5, 2, 3 };
		boolean bHasDuplicates = LS.hasDuplicates(arr);
		assertEquals(bHasDuplicates, true);
	}
	@Test
	public void ContainsZeroTest1() {

		int[][] MySquare = {{1,2,3},{3,1,2},{2,3,1}};
		LatinSquare LS = new LatinSquare(MySquare);
		
		boolean bContainsZero = LS.ContainsZero();
		
		assertEquals(false,bContainsZero);
	}
	@Test
	public void doesElementExist_Test1() {
		LatinSquare LS = new LatinSquare();
		int[] arr = { 1, 3, 5, 2, 4 };
		int iValue = 3;
		boolean bdoesElementExist = LS.doesElementExist(arr, iValue);
		assertEquals(bdoesElementExist, true);
		}
	@Test
	public void doesElementExist_Test2() {
		LatinSquare LS = new LatinSquare();
		int[] arr = { 1, 3, 5, 2, 4 };
		int iValue = 99;
		boolean bdoesElementExist = LS.doesElementExist(arr, iValue);
		assertEquals(bdoesElementExist, false);
		}
	@Test
	public void hasAllValues_Test1() {
		LatinSquare LS = new LatinSquare();
		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = { 3, 2, 1 };
		boolean bhasAllValues = LS.hasAllValues(arr1, arr2);
		assertEquals(bhasAllValues, true);
		}
	@Test
	public void getColumn_Test1() {
		int[][] MySquare = { { 1, 2, 3 }, { 3, 1, 2 }, { 2, 3, 1 } };
		LatinSquare LS = new LatinSquare(MySquare);
		int [] ExpectedCol = {2,1,3};
		int [] Col = LS.getColumn(1);
		assertTrue(Arrays.equals(ExpectedCol, Col));
		}
	@Test
	public void getRow_Test1() {
		int[][] MySquare = { { 1, 2, 3 }, { 3, 1, 2 }, { 2, 3, 1 } };
		LatinSquare LS = new LatinSquare(MySquare);
		int [] ExpectedRow = {3,1,2};
		int [] Row = LS.getRow(1);
		assertTrue(Arrays.equals(ExpectedRow, Row));
		}
	@Test
	public void isLatinSquare_Test1() {
		int[][] MySquare = { { 1, 2, 3 }, { 3, 1, 2 }, { 2, 3, 1 } };
		LatinSquare LS = new LatinSquare(MySquare);
		assertTrue(LS.isLatinSquare());
		}
	@Test
	public void isLatinSquare_Test2() {
		int[][] MySquare = { { 1, 2, 3 }, { 3, 1, 2 }, { 4, 5, 6 } };
	LatinSquare LS = new LatinSquare(MySquare);
	assertFalse(LS.isLatinSquare());
	}
	@Test
	public void hasAllValues_Test2() {
		LatinSquare LS = new LatinSquare();
		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = { 3, 2, 99 };
		boolean bhasAllValues = LS.hasAllValues(arr1, arr2);
		assertEquals(bhasAllValues, false);
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
