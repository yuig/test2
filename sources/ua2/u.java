package ua2;

import android.graphics.Canvas;
import com.pinterest.ui.grid.LegoPinGridCellImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class u extends h0 {

    /* renamed from: h, reason: collision with root package name */
    public int f121608h;

    /* renamed from: i, reason: collision with root package name */
    public final xk2.v f121609i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(LegoPinGridCellImpl legoGridCell) {
        super(legoGridCell, b1.FIXED);
        Intrinsics.checkNotNullParameter(legoGridCell, "legoGridCell");
        this.f121609i = xk2.m.b(new t(legoGridCell, 0));
    }

    @Override // ua2.h0
    public final boolean C(int i13, int i14) {
        return false;
    }

    public final va2.h E() {
        return (va2.h) this.f121609i.getValue();
    }

    public final void F() {
        E().h();
    }

    public final void G(int i13, int i14) {
        va2.h E = E();
        E.f125365t = i13;
        E.f125366u = i14;
    }

    public final void H(String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        E().k(description);
    }

    @Override // ua2.f1
    public final wa2.l k() {
        return E();
    }

    @Override // ua2.f1
    public final void r(Canvas canvas, int i13, int i14, int i15, int i16) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        E().draw(canvas);
        u(canvas);
    }

    @Override // ua2.f1
    public final z0 y(int i13, int i14) {
        va2.h E = E();
        E.g(0);
        E.f(i13);
        E.e(this.f121608h);
        E.i();
        return new z0(E().f128841d, E().f128842e);
    }
}
