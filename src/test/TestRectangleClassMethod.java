package test;
import static org.junit.Assert.*;

import org.junit.Test;

import a2.Rectangle;


public class TestRectangleClassMethod {

	@Test
	public void TestConstructor() {
        Rectangle rec = new Rectangle(10,10,0,0,"rectangle test");		
		assertTrue(rec.getLeft()==0);
	}

}
