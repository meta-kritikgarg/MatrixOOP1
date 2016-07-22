import static org.junit.Assert.*;

import org.junit.Test;


public class MatrixTest {

Matrix m1 = new Matrix(2, 2);
	
	int[][] input1 = {{1,2},{3,4}};

	//Test case for addition
	@Test
	public void testAddMatrix() {
		int [][] expacted = {{2,4},{6,8}};
		m1.setMatrixbyArray(input1);
		Matrix actual = m1.addMatrix(m1);
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				assertEquals(expacted[i][j],actual.matrix[i][j]);
			}
		}
		//Negative Test Case
		int [][] notexpacted = {{20,43},{-6,80}};
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				assertNotEquals(notexpacted[i][j],actual.matrix[i][j]);
			}
		}
	}

	//Test case for Multiplication
	@Test
	public void testMultiply() {
		int [][] expacted = {{7,10},{15,22}};
		int [][] notexpacted = {{17,120},{5,232}};
		m1.setMatrixbyArray(input1);
		Matrix actual = m1.multiply(m1);
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				assertEquals(expacted[i][j],actual.matrix[i][j]);
			}
		}
		//Negative Test Case
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				assertNotEquals(notexpacted[i][j],actual.matrix[i][j]);
			}
		}
	}

	//Test case for transpose
	@Test
	public void testGetTranspose() {
		int [][] expacted = {{1,3},{2,4}};
		int [][] notExpacted = {{11,2},{5,6}};
		m1.setMatrixbyArray(input1);
		Matrix actual = m1.getTranspose();
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				assertEquals(expacted[i][j],actual.matrix[i][j]);
			}
		}
		//Negative Test Case
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				assertNotEquals(notExpacted[i][j],actual.matrix[i][j]);
			}
		}
	}

}
