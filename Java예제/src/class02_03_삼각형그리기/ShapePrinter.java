package class02_03_�ﰢ���׸���;

public class ShapePrinter {
    public void printTriangle(int height) {
        String line = ""; //String �� �ʱ�ȭ
        for(int i = 1; i <= height; i++) {
        	line += "* ";
        	System.out.println(line);
        }
    }
}

/*for(int i = 1; i <= height; i++){ //i��
 * for(int j = 1; j <= i; j++){ //j��
 * system.out.print("* ");
 * }
 * system.out.println();
 * }*/
