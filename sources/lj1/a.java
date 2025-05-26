package lj1;

import android.graphics.Canvas;
import android.view.View;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import kh2.j;
import kotlin.jvm.internal.Intrinsics;
import pk.a0;
import qa2.f0;
import s3.n1;
import ua2.b1;
import ua2.f1;
import ua2.z0;
import ui1.c;
import ui1.e;
import wa2.l;
import xk2.m;
import xk2.v;

/* loaded from: classes2.dex */
public final class a extends f1 implements ui1.a {

    /* renamed from: f, reason: collision with root package name */
    public boolean f83613f;

    /* renamed from: g, reason: collision with root package name */
    public final v f83614g;

    /* renamed from: h, reason: collision with root package name */
    public int f83615h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(SbaPinRep pinRepView) {
        super(pinRepView, b1.FIXED);
        b displayState = new b(null, false, null, null, false, 16383);
        Intrinsics.checkNotNullParameter(pinRepView, "pinRepView");
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        this.f83614g = m.b(new n1(displayState, pinRepView, this, 2));
    }

    public final void A(b displayState) {
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        j.s(C(), displayState);
        this.f83613f = displayState.f83628m;
        if (displayState.f83629n) {
            View view = this.f121492a;
            if (!(view.getParent() instanceof f0)) {
                view.postInvalidate();
                return;
            }
            Object parent = view.getParent();
            View view2 = parent instanceof View ? (View) parent : null;
            if (view2 != null) {
                view2.postInvalidate();
            }
        }
    }

    public final void B(boolean z13) {
        va2.a C = C();
        if (C != null) {
            a0.x(this.f121492a, C, z13, null);
        }
    }

    public final va2.a C() {
        return (va2.a) this.f83614g.getValue();
    }

    public final void D() {
        C().f128846i = true;
    }

    @Override // ui1.a
    public final c d(int i13, int i14) {
        return (C().f128846i || !C().h(i13, i14)) ? ui1.b.f122290a : e.f122292a;
    }

    @Override // ua2.f1
    public final l k() {
        return C();
    }

    @Override // ua2.f1
    public final void r(Canvas canvas, int i13, int i14, int i15, int i16) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (C().f128846i) {
            return;
        }
        C().draw(canvas);
        u(canvas);
    }

    @Override // ua2.f1
    public final z0 y(int i13, int i14) {
        va2.a C = C();
        C.f(i13);
        C.e(this.f83615h);
        C.i();
        return new z0(C().f128841d, C().f128842e);
    }
}
