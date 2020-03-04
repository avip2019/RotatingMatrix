package com.codebind;


import static org.junit.Assert.*;


import org.junit.Test;

public class RowtocolumnTest {

	@Test
	public void test() {
		abc test = new abc();
		int b[][]= new int [][] { {3,9,8},                                                                                                                                  
                                  {2,4,7},
                                  {1,5,6} };
		assertArrayEquals(b,test.rowtocolumn(new int[][]{ {1,5,6},                                                                                                                                  
                                                          {2,4,7},
                                                          {3,9,8} }));
	}
	}


