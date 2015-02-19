import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;


public class MatrixUnitTest {
	List<ArrayList<ArrayList<Integer>>> matrices;
	@Before
	public void setUp() throws Exception {
		String filename = "//home//shiza//workspace//Matrix//matrixFile.txt";
		matrices = ReadFile.read(filename, 3);
	}

	@Test
	public void testAdd() {
		int[][] check = new int[3][3];
		check[0][0] = 13;
		check[0][1] = 12;
		check[0][2] = 15;
		check[1][0] = 6;
		check[1][1] = 16;
		check[1][2] = 16;
		check[2][0] = 9;
		check[2][1] = 20;
		check[2][2] = 11;
		
		
		
		int[][] A = ReadFile.add(matrices);
		int n = A.length;
		for(int i =0;i<n;i++){
			for(int j = 0;j<n;j++){
		    assertEquals(check[i][j],A[i][j]);
				
			}
			
			
		}
		
		
	}
	
	@Test
	public void addSec(){
		int[][] check = new int[3][3];
		check[0][0] = 17;
		check[0][1] = 32;
		check[0][2] = 25;
		check[1][0] = 28;
		check[1][1] = 75;
		check[1][2] = 60;
		check[2][0] = 46;
		check[2][1] = 111;
		check[2][2] = 92;
		
		String filename = "//home//shiza//workspace//Matrix//matrixFile.txt";
		List<ArrayList<ArrayList<Integer>>> gmat  = ReadFile.read(filename, 2);
		int m[][] = ReadFile.multiply(gmat);
		List<ArrayList<ArrayList<Integer>>> nlst = new LinkedList<ArrayList<ArrayList<Integer>>>();
		
		ArrayList<ArrayList<Integer>> mat = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < m.length; i++) {
			
			
			
			ArrayList<Integer> row  = new ArrayList<Integer>();
			for (int j = 0; j < m[0].length; j++) {
				
				row.add(m[i][j]);
			}
			mat.add(row);
			
		}
		
		nlst.add(mat);
		nlst.add(matrices.get(2));
		
		int[][] A = ReadFile.add(nlst);
		int n = A.length;
		for(int i =0;i<n;i++){
			for(int j = 0;j<n;j++){
		    assertEquals(check[i][j],A[i][j]);
				
			}
			
			
		}
		
	}

	@Test
	public void testSubtract() {
		int[][] check = new int[3][3];
		check[0][0] = -11;
		check[0][1] = -8;
		check[0][2] = -9;
		check[1][0] = 2;
		check[1][1] = -6;
		check[1][2] = -4;
		check[2][0] = 5;
		check[2][1] = -4;
		check[2][2] = 7;
		int[][] A = ReadFile.subtract(matrices);
		int n = A.length;
		for(int i =0;i<n;i++){
			for(int j = 0;j<n;j++){
		    assertEquals(check[i][j],A[i][j]);
				
			}
		
	}
	}

	@Test
	public void testMultiply() {
		int[][] check = new int[3][3];
		check[0][0] = 9;
		check[0][1] = 27;
		check[0][2] = 19;
		check[1][0] = 27;
		check[1][1] = 66;
		check[1][2] = 55;
		check[2][0] = 45;
		check[2][1] = 105;
		check[2][2] = 91;
		
		int[][] A = ReadFile.multiply(matrices);
		int n = A.length;
		for(int i =0;i<n;i++){
			for(int j = 0;j<n;j++){
		    assertEquals(check[i][j],A[i][j]);
				
			}
		
	}
		
		
	}

}
