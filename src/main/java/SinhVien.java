public class SinhVien {

    private String maSV = "B22DCDN001";
    private String hoTen;
    private String lop;
    private String ngaySinh;
    private double gpa;

    public double getGPA() {
        return gpa;
    }

    SinhVien() {
        maSV = "";
        hoTen = "";
        lop = "" ;
        ngaySinh = "";
        gpa = 0.0;
    }

    SinhVien (
            String hoTen,
            String lop,
            String ngaySinh,
            double gpa
    ) {
        this.hoTen = hoTen;
        this.lop = lop;
        this.ngaySinh = ngaySinh;
        this.gpa = gpa;
        formatDOB();
    }

    private void formatDOB() {
        if ( ngaySinh.charAt(1) == '/' )
            ngaySinh = "0" + ngaySinh;
        if ( ngaySinh.charAt(4) == '/' )
            ngaySinh = ngaySinh.substring(0, 3) + "0" + ngaySinh.substring(3);
    }

    @Override
    public String toString() {
        return maSV + " " + hoTen + " " + lop + " " + ngaySinh + " " + String.format("%.2f", gpa).replace(',', '.');
    }

}
