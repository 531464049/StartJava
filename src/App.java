
import java.util.Date;

public class App {
    public static void main(String[] args) {
        System.out.println(new Date());
        test();
    }

    private static void test() {
        int i = 1;
        MUtil.log(i);
        MUtil.log("++i :" + ++i);
        MUtil.log(i);
        MUtil.log("i++ :" + i++);
        MUtil.log(i);
    }
    // 页码 181
}
