package Bai1;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Circle c1 = new Circle();
        c1.setRadius(5);
        System.out.println(c1.toString());
        System.out.printf("Chu vi hình tròn = %.2f, Diện tích hình tròn = %.2f",
                            c1.getCircumference(), c1.getArea());

        Circle c2 = new Circle(5);
        System.out.println(c2.toString());
        System.out.printf("Chu vi hình tròn = %.2f, Diện tích hình tròn = %.2f",
                            c2.getCircumference(), c2.getArea());

        Circle c3 = new Circle();
        System.out.print("\nNhập bán kính: ");
        c3.setRadius(in.nextDouble());
        System.out.println(c3.toString());
        System.out.printf("Chu vi hình tròn = %.2f, Diện tích hình tròn = %.2f",
                c3.getCircumference(), c3.getArea());

    }
}
