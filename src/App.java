
import java.util.Date;

import MUtils.MUtil;
import Notes.Note;

public class App {
    public static void main(String[] args) {
        System.out.println(new Date());
        test();
        Note n = Note.MIDDLE_C;
    }

    private static void test() {
        int i = 1;
        MUtil.log(i);
        MUtil.log("++i :" + ++i);
        MUtil.log(i);
        MUtil.log("i++ :" + i++);
        MUtil.log(i);
    }
}
