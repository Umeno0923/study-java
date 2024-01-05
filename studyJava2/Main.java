package studyJava2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("割られる数字を入力してください：");
        int a = scanner.nextInt();

        System.out.print("割る数字を入力してください：");
        int b = scanner.nextInt();

        try {
            System.out.println("計算開始");
            System.out.println("a / b =" + (a / b) + "あまり" + (a % b));
            System.out.println("計算終了");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("２つの数値を入力してください");
            System.out.println("詳細：" + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("例外が発生しました");
            System.out.println("詳細：" + e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("プログラムを終了します");
        }
    }
}
