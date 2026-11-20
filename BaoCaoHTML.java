/** Lớp cụ thể 2: báo cáo dạng HTML. */
public class BaoCaoHTML extends BaoCao {
    @Override
    protected void taoTieuDe() {
        System.out.println("<h2>BÁO CÁO ĐIỂM (HTML)</h2>");
        System.out.println("<table>");
    }

    @Override
    protected void taoNoiDung() {
        for (int i = 0; i < ten.length; i++) {
            System.out.println("<tr><td>" + ten[i] + "</td><td>" + diem[i] + "</td></tr>");
        }
        System.out.println("</table>");
    }
}
