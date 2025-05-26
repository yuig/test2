package cj1;

import android.content.Context;
import android.graphics.Canvas;
import kotlin.jvm.internal.Intrinsics;
import u50.n;
import ua2.d1;
import ua2.z0;
import ui1.c;
import ui1.l;
import va2.o;

/* loaded from: classes2.dex */
public final class a extends d1 implements ui1.a {

    /* renamed from: h, reason: collision with root package name */
    public o f27884h;

    public final void A(b displayState) {
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        Context context = this.f121492a.getContext();
        n l13 = displayState.l();
        Intrinsics.f(context);
        int intValue = l13.a(context).intValue();
        int intValue2 = displayState.f().a(context).intValue();
        int intValue3 = displayState.m().a(context).intValue();
        int intValue4 = displayState.e().a(context).intValue();
        o oVar = this.f27884h;
        oVar.m(intValue, intValue2, intValue3, intValue4);
        oVar.j(displayState.g(), displayState.j(), displayState.h(), displayState.i().a(context).intValue());
        oVar.p(displayState.k().f59110d);
        oVar.k(displayState.k().f59111e);
        oVar.n(displayState.k().f59108b.a(context).toString());
    }

    @Override // ui1.a
    public final c d(int i13, int i14) {
        return this.f27884h.h().contains(i13, i14) ? l.f122299a : ui1.b.f122290a;
    }

    @Override // ua2.f1
    public final wa2.l k() {
        return this.f27884h;
    }

    @Override // ua2.f1
    public final void r(Canvas canvas, int i13, int i14, int i15, int i16) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int i17 = this.f121483f;
        int i18 = this.f121484g;
        o oVar = this.f27884h;
        oVar.o(i13, i17, i15, i18);
        oVar.draw(canvas);
    }

    @Override // ua2.f1
    public final z0 y(int i13, int i14) {
        o oVar = this.f27884h;
        oVar.l(i13);
        oVar.i();
        return new z0(i13, oVar.f128842e);
    }
}
