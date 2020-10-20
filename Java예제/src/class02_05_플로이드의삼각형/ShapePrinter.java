package class02_05_플로이드의삼각형;

public class ShapePrinter {
    public void printFloydsPyramid(int height) {
    	int max = height * (height + 1) / 2;
    	int maxLength = (String.valueOf(max)).length();
    	int cur = 1;
    	
    	for(int i = 1; i <= height; i++) {
    		for(int j = 1; j <= i; j++) {
    			int jLength = String.valueOf(cur).length();
    			for(int k = 1; k <= maxLength - jLength; k++) {
    				System.out.print(" ");
    			}
    			System.out.print(cur + " ");
    			cur++;
    		}
    		System.out.println();
    	}
    }
}
