package Notes;

import MUtils.MUtil;

public class Wind extends Instrument {
    @Override
    public void play(Note n) {
        MUtil.log("wind play() " + n);
    }
}
