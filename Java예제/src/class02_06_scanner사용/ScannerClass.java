package class02_06_scanner���;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		boolean inMainMenu = true;
		while(inMainMenu) {
			System.out.println("(I)ntro (C)ourse (E)xit");
			String ch = s.next();
			
			switch(ch) {
				case "I":
				case "i":
					System.out.println("�ȳ��ϼ���! �츮�� �ڵ����Դϴ�.");
					System.out.println("�Բ� �����սô�!");
					break;
				case "C":
				case "c":
					
					boolean inCourseMenu = true;
					while(inCourseMenu) {
						System.out.println("�ڵ��� ������ �Ұ��մϴ�.");
						System.out.println("(P)ython (J)ava (i)OS (B)ack");
						String ch2 = s.next();
						
						switch(ch2) {
							case "p":
							case "P":
								System.out.println("Python �� ���� ��ǻ�� ���̾��� ���ʸ� ���ϴ�.");
								System.out.println("����: ������");
								System.out.println("��õ ��������: ����");
							break;
						
							case "J":
							case "j":
								System.out.println("Java�� �⺻ ������ ��ü������ ���α׷����� ���ϴ�.");
								System.out.println("����: �����");
								System.out.println("��õ ��������: Python");
							break;
						
							case "I":
							case "i":
								System.out.println("�ֽ� Swift�� ���� iOS ������ ������ �� �ֽ��ϴ�.");
								System.out.println("����: ����ȣ");
								System.out.println("��õ ��������: Python, Java");
							break;
						
							case "B":
							case "b":
								inCourseMenu = false;
								break;
							default:
								System.out.println("�ٽ� �Է��� �ּ���.");
								break;
						}
					}
				case "E":
				case "e":
					System.out.println("�ȳ��� ������.");
					inMainMenu = false;
				break;
					}

			}
		}
}