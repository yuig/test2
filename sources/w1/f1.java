package w1;

import a.l9;
import android.view.KeyEvent;

/* loaded from: classes2.dex */
public final class f1 implements c1 {
    @Override // w1.c1
    public final b1 t(KeyEvent keyEvent) {
        b1 b1Var = null;
        if (keyEvent.isShiftPressed() && keyEvent.isAltPressed()) {
            long a13 = l9.a(keyEvent.getKeyCode());
            if (l3.a.a(a13, u1.f127530i)) {
                b1Var = b1.SELECT_LINE_LEFT;
            } else if (l3.a.a(a13, u1.f127531j)) {
                b1Var = b1.SELECT_LINE_RIGHT;
            } else if (l3.a.a(a13, u1.f127532k)) {
                b1Var = b1.SELECT_HOME;
            } else if (l3.a.a(a13, u1.f127533l)) {
                b1Var = b1.SELECT_END;
            }
        } else if (keyEvent.isAltPressed()) {
            long a14 = l9.a(keyEvent.getKeyCode());
            if (l3.a.a(a14, u1.f127530i)) {
                b1Var = b1.LINE_LEFT;
            } else if (l3.a.a(a14, u1.f127531j)) {
                b1Var = b1.LINE_RIGHT;
            } else if (l3.a.a(a14, u1.f127532k)) {
                b1Var = b1.HOME;
            } else if (l3.a.a(a14, u1.f127533l)) {
                b1Var = b1.END;
            }
        }
        return b1Var == null ? e1.f127234a.t(keyEvent) : b1Var;
    }
}
