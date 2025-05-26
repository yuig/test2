package hh;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class j extends i {
    @Override // hh.i
    public final void a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        d(bundle2);
    }

    @Override // hh.i
    public final boolean b() {
        return false;
    }
}
