
import java.util.Date;

import MUtils.MUtil;
import Notes.Music;
import Notes.Wind;

public class App {
    public static void main(String[] args) {
        System.out.println(new Date());
        // test();
        test_note();
    }

    private static void test() {
        int i = 1;
        MUtil.log(i);
        MUtil.log("++i :" + ++i);
        MUtil.log(i);
        MUtil.log("i++ :" + i++);
        MUtil.log(i);
    }

    private static void test_note() {
        Wind fluteWind = new Wind();
        Music.tune(fluteWind);
    }
}
