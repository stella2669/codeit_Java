package class02_04_피라미드그리기;

public class ShapePrinter {
    public void printPyramid(int height) {
    	for(int i = 1; i <= height; i++) {
    		for(int j = 1; j <= height - i; j++) {
    			System.out.print(" ");
    		}
    		for(int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");
			}
    		System.out.println();
    	}
    }
}
