package Bai2;

public class KyThuat extends NhanVien{
    private String Test;

    @Override
    public String moTaCongViec() {
        return Test;
    }

    public KyThuat() {
    }

    public KyThuat(String maNV, String ten, String ngaySinh, String address, String test) {
        super(maNV, ten, ngaySinh, address);
        Test = test;
    }

    public KyThuat(String maNV) {
        super(maNV);
    }

    public String getTest() {
        return Test;
    }

    public void setTest(String test) {
        Test = test;
    }

    @Override
    public String toString() {
        return "KyThuat[" + super.toString() +
                "Test='" + Test + '\'' +
                ']';
    }
}
