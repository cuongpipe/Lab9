/** Lớp cụ thể 1: báo cáo dạng văn bản. */
public class BaoCaoVanBan extends BaoCao {
    @Override
    protected void taoTieuDe() {
        System.out.println("=== BÁO CÁO ĐIỂM (VĂN BẢN) ===");
    }

    @Override
    protected void taoNoiDung() {
        for (int i = 0; i < ten.length; i++) {
            System.out.println((i + 1) + ". " + ten[i] + " - " + diem[i]);
        }
    }
}
