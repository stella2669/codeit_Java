package class02_04_피라미드그리기;

public class Main {
    public static void main(String[] args) {
        ShapePrinter printer = new ShapePrinter();

        // 테스트
        printer.printPyramid(3);
        System.out.println("----------");
        printer.printPyramid(5);
        System.out.println("----------");
        printer.printPyramid(10);
    }
}
