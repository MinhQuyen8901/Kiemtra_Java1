package Bai2;

import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Tạo sẵn
        KyThuat k1 = new KyThuat("2019602132", "Nguyen Van A", "01/01/2001", "Hà Nội", "aaa");
        System.out.println(k1.toString());
        //Nhập từ bàn phím
        KyThuat k2 = new KyThuat("2019601700");
        System.out.print("Nhập tên nhân viên: ");
        k2.setTen(in.nextLine());
        System.out.print("Nhập ngày sinh: ");
        k2.setNgaySinh(in.nextLine());
        System.out.print("Nhập địa chỉ: ");
        k2.setAddress(in.nextLine());
        System.out.print("Mô tả công viec: ");
        k2.setTest(in.nextLine());
        System.out.println(k2.toString());
    }
}
