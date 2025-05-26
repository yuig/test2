package gj1;

import kotlin.jvm.internal.Intrinsics;
import ui1.c;
import ui1.o;

/* loaded from: classes5.dex */
public final class a extends ej1.a implements ui1.a {
    public final void C(b displayState) {
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        A(displayState.f65199a);
    }

    @Override // ui1.a
    public final c d(int i13, int i14) {
        return this.f59096h.getBounds().contains(i13, i14) ? o.f122302a : ui1.b.f122290a;
    }
}
