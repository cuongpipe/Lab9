import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        System.out.println("--- Trường hợp 1: Văn bản ---");
        BaoCao b1 = new BaoCaoVanBan();
        b1.xuatBaoCao();

        System.out.println();
        System.out.println("--- Trường hợp 2: HTML ---");
        BaoCao b2 = new BaoCaoHTML();
        b2.xuatBaoCao();
    }
}
