package wrk;

import ctrl.Ctrl;

public class Wrk {

    public Wrk() {
        refCtrl = null;
    }

    public int calcule( int a, int b ) {
        return a + b;
    }

    public Ctrl getRefCtrl() {
        return refCtrl;
    }

    public void setRefCtrl( Ctrl refCtrl ) {
        this.refCtrl = refCtrl;
    }

    private Ctrl refCtrl;
}
