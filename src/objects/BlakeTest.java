package objects;

public class BlakeTest {

// REMOVE!!!
  interface MathOperation {
      int operation(int a, int b);
   }
   public int interestingFunc(int ax, int bx)
   {
	MathOperation division = (int a, int b) -> a / b;
	assert 0 != 1;
	return division.operation(ax,  bx);
	
	}

// ^^^ REMOVE!!!
}
