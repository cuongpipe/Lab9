/** Lớp trừu tượng: định nghĩa khung thuật toán xuất báo cáo điểm. */
public abstract class BaoCao {
    protected String[] ten;
    protected double[] diem;

    // TEMPLATE METHOD: quy định thứ tự các bước (final: lớp con không được đổi)
    public final void xuatBaoCao() {
        layDuLieu();     // bước 1 - chung
        taoTieuDe();     // bước 2 - thay đổi
        taoNoiDung();    // bước 3 - thay đổi
        inTongKet();     // bước 4 - chung
    }

    // Bước chung
    protected void layDuLieu() {
        ten  = new String[]{"Nguyễn Văn An", "Trần Thị Bình", "Lê Hoàng Cường"};
        diem = new double[]{8.5, 6.8, 4.5};
    }

    protected void inTongKet() {
        double tong = 0;
        for (double d : diem) tong += d;
        System.out.printf("Điểm trung bình: %.2f%n", tong / diem.length);
    }

    // Bước thay đổi: lớp con bắt buộc cài đặt
    protected abstract void taoTieuDe();
    protected abstract void taoNoiDung();
}
