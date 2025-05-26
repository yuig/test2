package androidx.appcompat.app;

import android.app.Dialog;
import android.os.Bundle;

/* loaded from: classes2.dex */
public class q0 extends androidx.fragment.app.q {
    @Override // androidx.fragment.app.q
    public Dialog O6(Bundle bundle) {
        return new p0(getContext(), this.f18410f);
    }

    @Override // androidx.fragment.app.q
    public final void R6(Dialog dialog, int i13) {
        if (!(dialog instanceof p0)) {
            super.R6(dialog, i13);
            return;
        }
        p0 p0Var = (p0) dialog;
        if (i13 != 1 && i13 != 2) {
            if (i13 != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        p0Var.d().j(1);
    }
}
