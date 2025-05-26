package ua2;

import android.content.Context;
import android.graphics.Canvas;
import ao2.o1;
import com.pinterest.api.model.f30;
import com.pinterest.ui.grid.LegoPinGridCellImpl;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class l extends h0 {

    /* renamed from: h, reason: collision with root package name */
    public final String f121549h;

    /* renamed from: i, reason: collision with root package name */
    public final Function0 f121550i;

    /* renamed from: j, reason: collision with root package name */
    public final Long f121551j;

    /* renamed from: k, reason: collision with root package name */
    public final hs.e f121552k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f121553l;

    /* renamed from: m, reason: collision with root package name */
    public final xk2.v f121554m;

    /* renamed from: n, reason: collision with root package name */
    public int f121555n;

    /* renamed from: o, reason: collision with root package name */
    public int f121556o;

    /* renamed from: p, reason: collision with root package name */
    public final long f121557p;

    /* renamed from: q, reason: collision with root package name */
    public f30 f121558q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(LegoPinGridCellImpl legoGridCell, String buttonText, qa2.r onButtonTap, Long l13, hs.e eVar) {
        super(legoGridCell, b1.FIXED);
        Context context = legoGridCell.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int x03 = dl2.b.x0(context, eo1.a.sema_color_background_inverse_default);
        vn1.c buttonTextColor = vn1.c.DEFAULT;
        Context context2 = legoGridCell.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int x04 = dl2.b.x0(context2, eo1.a.sema_color_background_default);
        Context context3 = legoGridCell.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        int F0 = dl2.b.F0(context3, eo1.a.sema_space_400);
        Context context4 = legoGridCell.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        int F02 = dl2.b.F0(context4, eo1.a.sema_space_800);
        Context context5 = legoGridCell.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        int F03 = dl2.b.F0(context5, eo1.a.sema_space_0);
        Context context6 = legoGridCell.getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
        float F04 = dl2.b.F0(context6, eo1.a.comp_button_large_rounding);
        Intrinsics.checkNotNullParameter(legoGridCell, "legoGridCell");
        Intrinsics.checkNotNullParameter(buttonTextColor, "buttonTextColor");
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        Intrinsics.checkNotNullParameter(onButtonTap, "onButtonTap");
        this.f121549h = buttonText;
        this.f121550i = onButtonTap;
        this.f121551j = l13;
        this.f121552k = eVar;
        this.f121553l = false;
        this.f121554m = xk2.m.b(new k(legoGridCell, x03, this, buttonTextColor, x04, F0, F02, F03, F04));
        zn2.a aVar = zn2.b.f142311b;
        this.f121557p = dl2.b.Q2(l13 != null ? l13.longValue() : 10000L, zn2.d.MILLISECONDS);
    }

    @Override // ua2.h0
    public final boolean B() {
        this.f121550i.invoke();
        return true;
    }

    @Override // ua2.h0
    public final boolean C(int i13, int i14) {
        return !E().f128846i && E().A.contains(i13, i14);
    }

    public final va2.a E() {
        return (va2.a) this.f121554m.getValue();
    }

    public final void F(boolean z13) {
        o1 o1Var;
        if (this.f121551j == null || E().f128846i) {
            return;
        }
        f30 f30Var = this.f121558q;
        hs.e eVar = this.f121552k;
        if (eVar != null) {
            if (Intrinsics.d(((hs.c) eVar).a(f30Var != null ? f30Var.getUid() : null), Boolean.TRUE)) {
                if (z13) {
                    if (eVar != null) {
                        f30 f30Var2 = this.f121558q;
                        ((hs.c) eVar).b(this.f121557p, f30Var2 != null ? f30Var2.getUid() : null);
                        return;
                    }
                    return;
                }
                if (eVar != null) {
                    f30 f30Var3 = this.f121558q;
                    String uid = f30Var3 != null ? f30Var3.getUid() : null;
                    hs.c cVar = (hs.c) eVar;
                    if (uid == null || (o1Var = (o1) cVar.f70026c.get(uid)) == null) {
                        return;
                    }
                    o1Var.cancel((CancellationException) null);
                }
            }
        }
    }

    public final void G(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.f121558q = pin;
        hs.e eVar = this.f121552k;
        if (eVar == null) {
            E().f128846i = !this.f121553l;
        } else {
            if (eVar == null) {
                return;
            }
            E().f128846i = !Intrinsics.d(((hs.c) eVar).a(pin != null ? pin.getUid() : null), Boolean.TRUE);
        }
    }

    @Override // ua2.f1
    public final wa2.l k() {
        return E();
    }

    @Override // ua2.f1
    public final void r(Canvas canvas, int i13, int i14, int i15, int i16) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.f121552k != null) {
            E().f128846i = !Intrinsics.d(((hs.c) r2).a(this.f121558q != null ? r3.getUid() : null), Boolean.TRUE);
        }
        if (E().f128846i) {
            return;
        }
        E().draw(canvas);
        u(canvas);
    }

    @Override // ua2.f1
    public final z0 y(int i13, int i14) {
        va2.a E = E();
        E.f(this.f121555n);
        E.e(this.f121556o);
        E.i();
        return new z0(E().f128841d, E().f128842e);
    }
}
