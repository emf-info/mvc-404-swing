package ctrl;

import ihm.Ihm;
import wrk.Wrk;

public class Ctrl {

    public Ctrl() {
        refWrk = null;
        refIhm = null;
    }

    public void start() {
        refIhm.start();
        int resultat = refWrk.calcule( 10, 20 );
        refIhm.affiche( "10 + 20 = " + resultat );
    }

    public Ihm getRefIhm() {
        return refIhm;
    }

    public void setRefIhm( Ihm refIhm ) {
        this.refIhm = refIhm;
    }

    public Wrk getRefWrk() {
        return refWrk;
    }

    public void setRefWrk( Wrk refWrk ) {
        this.refWrk = refWrk;
    }

    private Ihm refIhm;
    private Wrk refWrk;

}
