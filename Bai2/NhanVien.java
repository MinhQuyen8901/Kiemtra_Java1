package Bai2;

public  abstract class NhanVien {
    private String maNV;
    private String ten;
    private String ngaySinh;
    private String address;

    public NhanVien() {
    }

    public NhanVien(String maNV, String ten, String ngaySinh, String address) {
        this.maNV = maNV;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.address = address;
    }

    public NhanVien(String maNV) {
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMaNV() {
        return maNV;
    }

    public String getTen() {
        return ten;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "NhanVien[" +
                "maNV='" + maNV + '\'' +
                ", ten='" + ten + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                ", address='" + address + '\'' +
                ']';
    }
    public abstract String moTaCongViec();
}
