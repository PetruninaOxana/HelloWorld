package Task1.ifelse;

import java.util.InputMismatchException;
import java.util.Scanner;
// ���������� �������� ���������, ��� �� ������������ ������������ ������ �����  303.
// ���� ������������ ��� ����� 303, ��������� ������ ������� ���������: "�� ����� ����� 303".
// ���� ������������ ��� ������ �����, ��������� ������ ������ �� ������ ������.
public class Task3 {
    public static void main(String[] args) {
        System.out.print("������� ����� 303: ");
        Scanner scanner = new Scanner(System.in);
        try {
            int i = scanner.nextInt();
            if (i == 303) {
                System.out.println("�� ����� ����� 303");
            }
        } catch (InputMismatchException e) {
            // nothing to do
        }
    }
}
