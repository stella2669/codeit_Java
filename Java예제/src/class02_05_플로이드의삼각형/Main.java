package class02_05_�÷��̵��ǻﰢ��;

public class Main {
    public static void main(String[] args) {
        ShapePrinter printer = new ShapePrinter();

        // �׽�Ʈ
        printer.printFloydsPyramid(3);
        System.out.println("----------");
        printer.printFloydsPyramid(5);
        System.out.println("----------");
        printer.printFloydsPyramid(10);
    }
}
