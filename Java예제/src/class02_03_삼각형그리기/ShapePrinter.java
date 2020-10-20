package class02_03_삼각형그리기;

public class ShapePrinter {
    public void printTriangle(int height) {
        String line = ""; //String 값 초기화
        for(int i = 1; i <= height; i++) {
        	line += "* ";
        	System.out.println(line);
        }
    }
}

/*for(int i = 1; i <= height; i++){ //i행
 * for(int j = 1; j <= i; j++){ //j열
 * system.out.print("* ");
 * }
 * system.out.println();
 * }*/
