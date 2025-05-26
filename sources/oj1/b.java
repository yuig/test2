package oj1;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import eo1.c;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;
import nx.r0;
import u50.b0;
import u50.k0;
import ua2.b1;
import ua2.f1;
import ua2.z0;
import va2.h;
import wa2.l;
import xk2.m;
import xk2.v;

/* loaded from: classes2.dex */
public final class b extends f1 {

    /* renamed from: f, reason: collision with root package name */
    public int f95397f;

    /* renamed from: g, reason: collision with root package name */
    public final v f95398g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(SbaPinRep pinRepView) {
        super(pinRepView, b1.FIXED);
        Intrinsics.checkNotNullParameter(pinRepView, "pinRepView");
        k0 description = new k0(x0.watch_again);
        b0 topRadius = new b0(c.lego_corner_radius_medium);
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(topRadius, "topRadius");
        this.f95398g = m.b(new r0(pinRepView, 15));
    }

    public final void A(a displayState) {
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        h B = B();
        k0 k0Var = displayState.f95393a;
        View view = this.f121492a;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        B.k(k0Var.a(context).toString());
        h B2 = B();
        Intrinsics.checkNotNullExpressionValue(view.getContext(), "getContext(...)");
        B2.l(displayState.f95394b.a(r1).intValue());
        B2.j(view.getContext().getResources().getDimensionPixelSize(displayState.f95395c));
        if (displayState.f95396d) {
            B().m();
        } else {
            B().h();
        }
    }

    public final h B() {
        return (h) this.f95398g.getValue();
    }

    public final int C() {
        return this.f95397f;
    }

    @Override // ua2.f1
    public final l k() {
        return B();
    }

    @Override // ua2.f1
    public final void r(Canvas canvas, int i13, int i14, int i15, int i16) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        B().draw(canvas);
    }

    @Override // ua2.f1
    public final z0 y(int i13, int i14) {
        h B = B();
        B.g(0);
        B.f(i13);
        B.e(this.f95397f);
        B.i();
        return new z0(B().f128841d, B().f128842e);
    }
}
