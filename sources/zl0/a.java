package zl0;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;
import mj0.c;
import pj0.s;
import yk1.i;
import yq0.t;

/* loaded from: classes5.dex */
public final class a extends s {
    @Override // pj0.s, wk1.q, yk1.b
    public final void onActivate() {
        super.onActivate();
        if (isBound()) {
            ((t) ((c) getView())).setLoadState(i.LOADING);
        }
    }

    @Override // wk1.n, nr0.d
    public final void onPinClicked(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.f100281q.l2(pin, null);
    }
}
